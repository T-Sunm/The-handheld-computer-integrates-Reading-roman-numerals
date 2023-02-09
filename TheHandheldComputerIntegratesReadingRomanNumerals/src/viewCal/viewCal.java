package viewCal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import viewchoose.viewchoose;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewCal {

	private JFrame frame;
	private JTextField txtResult;
	String operanl = "";
	String operator = "";
	//xem người dùng có nhấn vào dấu "=" hay không
	boolean isequalsPress = false;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public viewCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("CASIO");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -93, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 37, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -350, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 129, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 340, SpringLayout.SOUTH, panel);
		
		txtResult = new JTextField();
		txtResult.setPreferredSize(new Dimension(480, 70));
		Font font = new Font("Arial", Font.PLAIN, 30);
		txtResult.setFont(font);
		panel.add(txtResult);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 5, 5));
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);			}
		});
		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operanl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		JButton btnCan = new JButton("sqrt");
		btnCan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return ;
				}
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					value = Math.sqrt(value);
					txtResult.setText(value+"");
					
					isequalsPress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operanl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		JButton btnLaySoDu = new JButton("%");
		btnLaySoDu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return ;
				}
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					value = value * 100;
					txtResult.setText(value+"");
					isequalsPress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operanl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		JButton btnNghichDao = new JButton("1/x");
		btnNghichDao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return ;
				}
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					value = 1/value;
					txtResult.setText(value+"");
					isequalsPress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		JButton btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isequalsPress) {
					// set lại coi như chưa nhấn dấu "="
					isequalsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		JButton btnPlus = new JButton("+/-");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(txtResult.getText());
					value = - value;
					txtResult.setText("" + value);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		JButton btnLammoi = new JButton("C");
		btnLammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				operanl = "";
				operator = "";
				isequalsPress = false;
			}
		});
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operanl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		JButton btnAns = new JButton("=");
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("") || operanl.equals("")) {
					return;
				}
				try {
					double oprand1 = Double.parseDouble(operanl);
					double oprand2 = Double.parseDouble(txtResult.getText());
					double result = 0 ;
					if(operator.equals("+")) {
						result = oprand1 + oprand2;
					}
					else if(operator.equals("-")) {
						result = oprand1 - oprand2;
					}
					else if(operator.equals("*")) {
						result = oprand1 * oprand2;
					}
					else if(operator.equals("/")) {
						result = oprand1 / oprand2;
					}
					txtResult.setText(result +"");
					
					isequalsPress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
		panel_1.add(btnNumber1);
		panel_1.add(btnNumber2);
		panel_1.add(btnNumber3);
		panel_1.add(btnChia);
		panel_1.add(btnCan);
		panel_1.add(btnNumber4);
		panel_1.add(btnNumber5);
		panel_1.add(btnNumber6);
		panel_1.add(btnNhan);
		panel_1.add(btnLaySoDu);
		panel_1.add(btnNumber7);
		panel_1.add(btnNumber8);
		panel_1.add(btnNumber9);
		panel_1.add(btnCong);
		panel_1.add(btnNghichDao);
		panel_1.add(btnNumber0);
		panel_1.add(btnPlus);
		panel_1.add(btnLammoi);
		panel_1.add(btnTru);
		panel_1.add(btnAns);
		
		JButton btnquaylai = new JButton("Quay lại");
		btnquaylai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewchoose();
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnquaylai, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnquaylai, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnquaylai);
		
		frame.setVisible(true);
		
	}
}
