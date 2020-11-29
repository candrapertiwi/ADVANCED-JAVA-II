package tutorial8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textDisp;
	double firstNum;
	double secondNum;
	double result;
	String calc, answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 366, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisp = new JTextField();
		textDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisp.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textDisp.setBounds(10, 11, 331, 91);
		frame.getContentPane().add(textDisp);
		textDisp.setColumns(10);
		
		final JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn7.getText();
				textDisp.setText(number);
			}
		});
		btn7.setBounds(22, 113, 54, 61);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn8.getText();
				textDisp.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn8.setBounds(108, 113, 54, 61);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn9.getText();
				textDisp.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn9.setBounds(191, 113, 54, 61);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				calc = "+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPlus.setBounds(271, 113, 54, 61);
		frame.getContentPane().add(btnPlus);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn4.getText();
				textDisp.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn4.setBounds(22, 183, 54, 61);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn5.getText();
				textDisp.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn5.setBounds(108, 183, 54, 61);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn6.getText();
				textDisp.setText(number);
			}
			
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn6.setBounds(191, 183, 54, 61);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				calc = "-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSub.setBounds(271, 183, 54, 61);
		frame.getContentPane().add(btnSub);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn1.getText();
				textDisp.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn1.setBounds(22, 255, 54, 61);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn2.getText();
				textDisp.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn2.setBounds(108, 255, 54, 61);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText() + btn3.getText();
				textDisp.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn3.setBounds(191, 255, 54, 61);
		frame.getContentPane().add(btn3);
		
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				calc = "*";
			}
		});
		btnTimes.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnTimes.setBounds(271, 255, 54, 61);
		frame.getContentPane().add(btnTimes);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textDisp.getText()+btn0.getText();
				textDisp.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn0.setBounds(22, 327, 54, 61);
		frame.getContentPane().add(btn0);
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operation = Double.parseDouble(String.valueOf(textDisp.getText()));
				operation = operation * (-1);
				textDisp.setText(String.valueOf(operation));
			}
		});
		btnSign.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnSign.setBounds(108, 327, 54, 61);
		frame.getContentPane().add(btnSign);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum=Double.parseDouble(textDisp.getText());
				if(calc == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.0f", result);
					textDisp.setText(answer);
				}
				else if(calc == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.0f", result);
					textDisp.setText(answer);
				}
				else if(calc == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.0f", result);
					textDisp.setText(answer);
				}
				else if(calc == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.0f", result);
					textDisp.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnEquals.setBounds(191, 327, 54, 61);
		frame.getContentPane().add(btnEquals);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				calc = "/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnDivide.setBounds(271, 327, 54, 61);
		frame.getContentPane().add(btnDivide);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AC = null;
				if(textDisp.getText().length()>0) {
					StringBuilder str = new StringBuilder(textDisp.getText());
					str.deleteCharAt(textDisp.getText().length()-1);
					AC = str.toString();
					textDisp.setText(AC);
				}
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnC.setBounds(131, 399, 78, 61);
		frame.getContentPane().add(btnC);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisp.setText(null);
			}
		});
		btnAc.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnAc.setBounds(232, 399, 78, 61);
		frame.getContentPane().add(btnAc);
	}
}
