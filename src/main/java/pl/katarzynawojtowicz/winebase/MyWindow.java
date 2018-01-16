package pl.katarzynawojtowicz.winebase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton saveButton;
	private JTextField name;
	private JTextField country;
	private JTextField year;
	private JTextField price;
	private JComboBox<String> crapeVariety;
	private JComboBox<String> wineDescription;

	public MyWindow() {
		super("Winebase");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(600, 600);

		JPanel panel = createPanel();
		createLabels(panel);
		createButton(panel);

		add(panel);
		setVisible(true);

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

		JLabel descriptionLabel = new JLabel("Wine Description");
		descriptionLabel.setBounds(20, 320, 100, 25);
		descriptionLabel.setForeground(Color.white);
		panel.add(descriptionLabel);

	}

	private void createButton(JPanel panel) {
		saveButton = new JButton("Save");
		saveButton.setBounds(350, 420, 100, 25);
		saveButton.addActionListener((ActionListener) this);
		panel.add(saveButton);

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
