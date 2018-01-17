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

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton saveButton;
	private JTextField name;
	private JTextField country;
	private JTextField year;
	private JTextField price;
	private JComboBox<String> type;
	private JComboBox<String> colour;
	private JComboBox<String> crapeVariety;
	private JTextArea wineDescription;

	public MyWindow() {
		super("Winebase - Add");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(600, 600);

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
		colour.setBounds(140, 70, 100, 25);
		panel.add(colour);

		crapeVariety = new JComboBox<>(ComboBoxValues.CRAPE_VARIETY);
		crapeVariety.setBounds(140, 270, 100, 25);
		panel.add(crapeVariety);

		type = new JComboBox<>(ComboBoxValues.TYPE);
		type.setBounds(140, 320, 100, 25);
		panel.add(type);

	}

	private void createLabels(JPanel panel) {
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(20, 20, 100, 25);
		nameLabel.setForeground(Color.white);
		panel.add(nameLabel);

		JLabel colourLabel = new JLabel("Colour");
		colourLabel.setBounds(20, 70, 100, 25);
		colourLabel.setForeground(Color.white);
		panel.add(colourLabel);

		JLabel countryLabel = new JLabel("Country");
		countryLabel.setBounds(20, 120, 100, 25);
		countryLabel.setForeground(Color.white);
		panel.add(countryLabel);

		JLabel yearLabel = new JLabel("Year");
		yearLabel.setBounds(20, 170, 100, 25);
		yearLabel.setForeground(Color.white);
		panel.add(yearLabel);

		JLabel priceLabel = new JLabel("Price");
		priceLabel.setBounds(20, 220, 100, 25);
		priceLabel.setForeground(Color.white);
		panel.add(priceLabel);

		JLabel crapeVarietyLabel = new JLabel("Crape Variety");
		crapeVarietyLabel.setBounds(20, 270, 100, 25);
		crapeVarietyLabel.setForeground(Color.white);
		panel.add(crapeVarietyLabel);

		JLabel typeLabel = new JLabel("Type");
		typeLabel.setBounds(20, 320, 100, 25);
		typeLabel.setForeground(Color.white);
		panel.add(typeLabel);

		JLabel descriptionLabel = new JLabel("Wine Description");
		descriptionLabel.setBounds(20, 370, 100, 25);
		descriptionLabel.setForeground(Color.white);
		panel.add(descriptionLabel);

	}

	private void createButton(JPanel panel) {
		saveButton = new JButton("Save");
		saveButton.setBounds(350, 420, 100, 25);
		saveButton.addActionListener((ActionListener) this);
		panel.add(saveButton);

	}

	private void createTextFields(JPanel panel) {
		name = new JTextField();
		name.setBounds(140, 20, 100, 25);
		panel.add(name);
		name.setEditable(true);
		name.setEnabled(true);

		country = new JTextField();
		country.setBounds(140, 120, 100, 25);
		panel.add(country);
		country.setEditable(true);
		country.setEnabled(true);

		year = new JTextField();
		year.setBounds(140, 170, 100, 25);
		panel.add(year);
		year.setEditable(true);
		year.setEnabled(true);

		price = new JTextField();
		price.setBounds(140, 220, 100, 25);
		panel.add(price);
		price.setEditable(true);
		price.setEnabled(true);
	}

	private void createJTextArea(JPanel panel) {
		wineDescription = new JTextArea();
		wineDescription.setBounds(140, 370, 140, 125);
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
		System.out.println("button pressed");

	}

}