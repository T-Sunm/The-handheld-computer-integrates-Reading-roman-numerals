package viewRoman;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import viewchoose.viewchoose;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewRoman {
	
	
	private JFrame frame;
	private JTextField Finput;
	private JTextField Foutput;
	
	boolean isequalsPress = false;
	
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public viewRoman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 14));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 566, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnI.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnI, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnI, -415, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnI);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnL.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnL, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnI, -18, SpringLayout.NORTH, btnL);
		springLayout.putConstraint(SpringLayout.NORTH, btnL, 310, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnL, -79, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnL);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnV.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.NORTH, btnV, 235, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnI, 0, SpringLayout.NORTH, btnV);
		springLayout.putConstraint(SpringLayout.EAST, btnV, -215, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnV);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnX.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnX, -140, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnX, -21, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnX);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnC.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnC, 210, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnV, -23, SpringLayout.NORTH, btnC);
		springLayout.putConstraint(SpringLayout.EAST, btnL, -73, SpringLayout.WEST, btnC);
		springLayout.putConstraint(SpringLayout.WEST, btnV, 0, SpringLayout.WEST, btnC);
		springLayout.putConstraint(SpringLayout.NORTH, btnC, 310, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnC, 0, SpringLayout.SOUTH, btnL);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		springLayout.putConstraint(SpringLayout.SOUTH, btnX, -23, SpringLayout.NORTH, btnD);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		btnD.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.EAST, btnC, -75, SpringLayout.WEST, btnD);
		springLayout.putConstraint(SpringLayout.NORTH, btnD, 0, SpringLayout.NORTH, btnL);
		springLayout.putConstraint(SpringLayout.WEST, btnD, 0, SpringLayout.WEST, btnX);
		springLayout.putConstraint(SpringLayout.SOUTH, btnD, -79, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnD, -21, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnD);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					Finput.setText("");
				}
				
				String cmd = e.getActionCommand();
				Finput.setText(Finput.getText() + cmd);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnM, 14, SpringLayout.SOUTH, btnL);
		springLayout.putConstraint(SpringLayout.WEST, btnM, 0, SpringLayout.WEST, btnI);
		springLayout.putConstraint(SpringLayout.SOUTH, btnM, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnM, -415, SpringLayout.EAST, frame.getContentPane());
		btnM.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		frame.getContentPane().add(btnM);
		
		Finput = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, Finput, 57, SpringLayout.NORTH, frame.getContentPane());
		Finput.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		springLayout.putConstraint(SpringLayout.WEST, Finput, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Finput, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Finput);
		Finput.setColumns(10);
		
		Foutput = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, btnX, 29, SpringLayout.SOUTH, Foutput);
		springLayout.putConstraint(SpringLayout.SOUTH, Foutput, -244, SpringLayout.SOUTH, frame.getContentPane());
		Foutput.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		springLayout.putConstraint(SpringLayout.NORTH, Foutput, 149, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Foutput, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Foutput, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Foutput);
		Foutput.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Reading Roman Numeral");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -13, SpringLayout.NORTH, Finput);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Finput.getText().equals("")) {
					return;
				}
				String value = romanToInt(Finput.getText()+"")+"";
				Foutput.setText(value);
				isequalsPress = true;
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnEqual, 6, SpringLayout.SOUTH, btnD);
		springLayout.putConstraint(SpringLayout.WEST, btnEqual, 267, SpringLayout.EAST, btnM);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEqual, -14, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnEqual, 0, SpringLayout.EAST, btnX);
		btnEqual.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		frame.getContentPane().add(btnEqual);
		
		JLabel lblNewLabel_1 = new JLabel("Input");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 23, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, Finput);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 304, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 87, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		springLayout.putConstraint(SpringLayout.SOUTH, Finput, -6, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 115, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, Foutput);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -479, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		
		
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finput.setText("");
				Foutput.setText("");
				isequalsPress = false;
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 12, SpringLayout.SOUTH, btnC);
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, btnV);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, btnM);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -67, SpringLayout.WEST, btnEqual);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnquaylai = new JButton("Quay lại");
		btnquaylai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewchoose();
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnquaylai, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnquaylai, 0, SpringLayout.WEST, btnI);
		frame.getContentPane().add(btnquaylai);
		
		frame.setVisible(true);
	}
	public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int sum = 0;
        char ch = 0;
        char pre = 0;
        for(int i = 0, len = s.length(); i < len; i ++) {
            pre = ch;
            ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    sum ++;
                    break;
                case 'V':
                    if (pre == 'I') {
                        sum += 3;
                    }
                    else {
                        sum += 5;
                    }
                    break;
                case 'X':
                    if (pre == 'I') {
                        sum += 8;
                    }
                    else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    if (pre == 'I') {
                        sum += 48;
                    }
                    else if (pre == 'V') {
                        sum += 40;
                    }
                    else if (pre == 'X') {
                        sum += 30;
                    }
                    else {
                        sum += 50;
                    }
                    break;
                case 'C':
                    if (pre == 'I') {
                        sum += 98;
                    }
                    else if (pre == 'V') {
                        sum += 90;
                    }
                    else if (pre == 'X') {
                        sum += 80;
                    }
                    else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    if (pre == 'I') {
                        sum += 498;
                    }
                    else if (pre == 'V') {
                        sum += 490;
                    }
                    else if (pre == 'X') {
                        sum += 480;
                    }
                    else if (pre == 'C') {
                        sum += 300;
                    }
                    else {
                        sum += 500;
                    }
                    break;
                case 'M':
                    if (pre == 'I') {
                        sum += 998;
                    }
                    else if (pre == 'V') {
                        sum += 990;
                    }
                    else if (pre == 'X') {
                        sum += 980;
                    }
                    else if (pre == 'C') {
                        sum += 800;
                    }
                    else {
                        sum += 1000;
                    }
                    break;
            }
        }
        return sum;
    }
}
