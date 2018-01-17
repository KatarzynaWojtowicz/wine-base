package pl.katarzynawojtowicz.winebase.view;

import static pl.katarzynawojtowicz.winebase.constants.StyleConstants.DEFAULT_HEIGHT;
import static pl.katarzynawojtowicz.winebase.constants.StyleConstants.DEFAULT_WIDTH;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pl.katarzynawojtowicz.winebase.constants.ComboBoxValues;

public class SearchJFrame extends JFrame implements ActionListener {

	private JButton searchButton;
	private JTextField name;
	private JTextField country;
	private JTextField year;
	private JTextField priceFrom;
	private JTextField priceTo;
	private JComboBox<String> type;
	private JComboBox<String> colour;
	private JComboBox<String> crapeVariety;

	public SearchJFrame() {
		super("Winebase - Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(1000, 1000);

		JPanel searchPanel = createPanel();
		createLabels(searchPanel);
		createButton(searchPanel);
		createTextFields(searchPanel);
		createJComboBox(searchPanel);

		add(searchPanel);
		setVisible(true);

	}

	private void createJComboBox(JPanel searchPanel) {
		colour = new JComboBox<>(ComboBoxValues.COLOUR_WINE);
		colour.setBounds(140, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(colour);

		crapeVariety = new JComboBox<>(ComboBoxValues.CRAPE_VARIETY);
		crapeVariety.setBounds(620, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(crapeVariety);

		type = new JComboBox<>(ComboBoxValues.TYPE);
		type.setBounds(740, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(type);
	}

	private void createTextFields(JPanel searchPanel) {
		name = new JTextField();
		name.setBounds(20, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(name);

		country = new JTextField();
		country.setBounds(260, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(country);

		year = new JTextField();
		year.setBounds(380, 50, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchPanel.add(year);

		priceFrom = new JTextField();
		priceFrom.setBounds(500, 50, 45, DEFAULT_HEIGHT);
		searchPanel.add(priceFrom);

		priceTo = new JTextField();
		priceTo.setBounds(555, 50, 45, DEFAULT_HEIGHT);
		searchPanel.add(priceTo);

	}

	private void createButton(JPanel searchPanel) {
		searchButton = new JButton("Search");
		searchButton.setBounds(350, 420, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		searchButton.addActionListener((ActionListener) this);
		searchPanel.add(searchButton);

	}

	private void createLabels(JPanel searchPanel) {
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(20, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		nameLabel.setForeground(Color.white);
		searchPanel.add(nameLabel);

		JLabel colourLabel = new JLabel("Colour");
		colourLabel.setBounds(140, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		colourLabel.setForeground(Color.white);
		searchPanel.add(colourLabel);

		JLabel countryLabel = new JLabel("Country");
		countryLabel.setBounds(260, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		countryLabel.setForeground(Color.white);
		searchPanel.add(countryLabel);

		JLabel yearLabel = new JLabel("Year");
		yearLabel.setBounds(380, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		yearLabel.setForeground(Color.white);
		searchPanel.add(yearLabel);

		JLabel priceLabel = new JLabel("Price");
		priceLabel.setBounds(500, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		priceLabel.setForeground(Color.white);
		searchPanel.add(priceLabel);

		JLabel crapeVarietyLabel = new JLabel("Crape Variety");
		crapeVarietyLabel.setBounds(620, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		crapeVarietyLabel.setForeground(Color.white);
		searchPanel.add(crapeVarietyLabel);

		JLabel typeLabel = new JLabel("Type");
		typeLabel.setBounds(740, 20, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		typeLabel.setForeground(Color.white);
		searchPanel.add(typeLabel);

	}

	private JPanel createPanel() {
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(null);
		searchPanel.setBackground(new Color(130, 80, 60));
		return searchPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
