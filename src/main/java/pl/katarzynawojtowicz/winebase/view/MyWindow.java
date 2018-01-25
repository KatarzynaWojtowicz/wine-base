package pl.katarzynawojtowicz.winebase.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import pl.katarzynawojtowicz.winebase.constants.ComboBoxValues;
import pl.katarzynawojtowicz.winebase.dao.WineDao;
import pl.katarzynawojtowicz.winebase.model.Wine;

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton saveButton;
	private JTextField name;
	private JTextField country;
	private JTextField year;
	private JTextField price;
	private JComboBox<String> type;
	private JComboBox<String> colour;
	private JComboBox<String> grapeVariety;
	private JTextArea wineDescription;

	private WineDao wine = new WineDao();

	public MyWindow() {
		super("Winebase - Add");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(740, 600);

		JPanel panel = createPanel();
		createLabels(panel);
		createButton(panel);
		createTextFields(panel);
		createJComboBox(panel);
		createJTextArea(panel);

		add(panel);
		setVisible(true);

	}

	private void createJComboBox(JPanel panel) {
		colour = new JComboBox<>(ComboBoxValues.COLOUR_WINE);
		colour.setBounds(350, 20, 100, 25);
		panel.add(colour);

		grapeVariety = new JComboBox<>(ComboBoxValues.GRAPE_VARIETY);
		grapeVariety.setBounds(350, 100, 100, 25);
		panel.add(grapeVariety);

		type = new JComboBox<>(ComboBoxValues.TYPE);
		type.setBounds(350, 60, 100, 25);
		panel.add(type);

	}

	private void createLabels(JPanel panel) {
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(20, 20, 100, 25);
		nameLabel.setForeground(Color.white);
		panel.add(nameLabel);

		JLabel colourLabel = new JLabel("Colour");
		colourLabel.setBounds(240, 20, 100, 25);
		colourLabel.setForeground(Color.white);
		panel.add(colourLabel);

		JLabel countryLabel = new JLabel("Country");
		countryLabel.setBounds(20, 60, 100, 25);
		countryLabel.setForeground(Color.white);
		panel.add(countryLabel);

		JLabel yearLabel = new JLabel("Year");
		yearLabel.setBounds(20, 100, 100, 25);
		yearLabel.setForeground(Color.white);
		panel.add(yearLabel);

		JLabel priceLabel = new JLabel("Price");
		priceLabel.setBounds(500, 60, 100, 25);
		priceLabel.setForeground(Color.white);
		panel.add(priceLabel);

		JLabel grapeVarietyLabel = new JLabel("Grape Variety");
		grapeVarietyLabel.setBounds(240, 100, 100, 25);
		grapeVarietyLabel.setForeground(Color.white);
		panel.add(grapeVarietyLabel);

		JLabel typeLabel = new JLabel("Type");
		typeLabel.setBounds(240, 60, 100, 25);
		typeLabel.setForeground(Color.white);
		panel.add(typeLabel);

		JLabel descriptionLabel = new JLabel("Wine Description");
		descriptionLabel.setBounds(20, 140, 100, 25);
		descriptionLabel.setForeground(Color.white);
		panel.add(descriptionLabel);

	}

	private void createButton(JPanel panel) {
		saveButton = new JButton("Save");
		saveButton.setBounds(600, 420, 100, 25);
		saveButton.addActionListener((ActionListener) this);
		panel.add(saveButton);

	}

	private void createTextFields(JPanel panel) {
		name = new JTextField();
		name.setBounds(110, 20, 100, 25);
		panel.add(name);
		name.setEditable(true);
		name.setEnabled(true);

		country = new JTextField();
		country.setBounds(110, 60, 100, 25);
		panel.add(country);
		country.setEditable(true);
		country.setEnabled(true);

		year = new JTextField();
		year.setBounds(110, 100, 100, 25);
		panel.add(year);
		year.setEditable(true);
		year.setEnabled(true);

		price = new JTextField();
		price.setBounds(580, 60, 100, 25);
		panel.add(price);
		price.setEditable(true);
		price.setEnabled(true);
	}

	private void createJTextArea(JPanel panel) {
		wineDescription = new JTextArea();
		wineDescription.setBounds(20, 160, 680, 250);
		panel.add(wineDescription);
		wineDescription.setEditable(true);
		wineDescription.setEnabled(true);
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(130, 80, 60));
		return panel;
	}

	public void actionPerformed(ActionEvent arg0) {
		Wine newWine = new Wine();
		newWine.setWineName(name.getText());
		newWine.setColour((String) colour.getSelectedItem());
		newWine.setWineCountry(country.getText());
		newWine.setWineType((String) type.getSelectedItem());
		newWine.setWineYear(Integer.valueOf(year.getText()));
		newWine.setGrapeVariety((String) grapeVariety.getSelectedItem());
		newWine.setWinePrice(Double.valueOf(price.getText()));
		newWine.setWineDescription(wineDescription.getText());

		wine.addWine(newWine);

	}

}
