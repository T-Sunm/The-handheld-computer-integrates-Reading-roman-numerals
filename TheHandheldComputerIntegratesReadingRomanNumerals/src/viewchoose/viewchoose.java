package viewchoose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import viewCal.viewCal;
import viewRoman.viewRoman;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewchoose {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		    //set look and feel
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
			viewchoose window = new viewchoose();
			window.frame.setVisible(true);
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
	}

	/**
	 * Create the application.
	 */
	public viewchoose() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 436, 165);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton viewCal = new JButton("Handheld Computer");
		springLayout.putConstraint(SpringLayout.EAST, viewCal, 152, SpringLayout.WEST, frame.getContentPane());
		viewCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewCal();
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, viewCal, 44, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, viewCal, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, viewCal, -45, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(viewCal);
		
		JButton btnNewButton_1 = new JButton("Reading Roman Numerals");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 44, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, -189, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -45, SpringLayout.SOUTH, frame.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewRoman();
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
	}
}
