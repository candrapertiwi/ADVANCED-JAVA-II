package latihan9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDialog extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=44,-11
	 */
	private final JTextField textField = new JTextField();
	private JTextField textName;
	private JTextField textMark;
	private Student student;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDialog frame = new StudentDialog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentDialog() {
		textField.setColumns(10);
		setTitle("New Student Entry");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelName = new JLabel("Name");
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName.setBounds(61, 29, 49, 14);
		contentPane.add(labelName);
		
		JLabel labelMark = new JLabel("Mark");
		labelMark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMark.setBounds(61, 71, 49, 14);
		contentPane.add(labelMark);
		
		textName = new JTextField();
		textName.setBounds(118, 28, 202, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textMark = new JTextField();
		textMark.setColumns(10);
		textMark.setBounds(120, 70, 202, 20);
		contentPane.add(textMark);
		
		JButton btnOK = new JButton("Ok");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textName.getText().equals("") || textMark.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "You Haven't entered any Student!");
				}
				else {
					try {
						String name = textName.getText().trim();
						int mark = Integer.parseInt(textMark.getText());
						student = new Student(name, mark);
						reset();
						JOptionPane.showMessageDialog(null, "Student Added!");
						setVisible(false);
					}
					catch(Exception ieo) {
						JOptionPane.showMessageDialog(null, "Unexpected error!");
					}
				}
			}
		});
		btnOK.setBounds(41, 109, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textMark.setText("");
			}
		});
		btnReset.setBounds(141, 109, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubjectDetailGUI sdg = new SubjectDetailGUI();
				sdg.setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(243, 109, 89, 23);
		contentPane.add(btnCancel);
	}
	public void reset() {
		textName.setText("");
		textMark.setText("");
	}
}
