package pl.katarzynawojtowicz.winebase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton saveButton;

	public MyWindow() {
		super("Winebase");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(400, 400);

		JPanel panel = createPanel();
		createLabels(panel);
		createButton(panel);

		add(panel);
		setVisible(true);

	}

	private void createLabels(JPanel panel) {
		JLabel nameLabel = new JLabel("Wine name");
		nameLabel.setBounds(20, 20, 100, 25);
		panel.add(nameLabel);
	}

	private void createButton(JPanel panel) {
		saveButton = new JButton("Save");
		saveButton.setBounds(20, 300, 100, 25);
		saveButton.addActionListener((ActionListener) this);
		panel.add(saveButton);

	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(200, 100, 50));
		return panel;
	}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("button pressed");

	}

}
