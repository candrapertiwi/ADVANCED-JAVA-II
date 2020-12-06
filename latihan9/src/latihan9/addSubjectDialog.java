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

public class addSubjectDialog extends JFrame {

	private JPanel contentPane;
	private JTextField subjectCode;
	private JTextField subjectName;
	private Subject subject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addSubjectDialog frame = new addSubjectDialog();
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
	public addSubjectDialog() {
		setTitle("New Subject Entry");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 363, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSCode = new JLabel("Subject Code ");
		lblSCode.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSCode.setBounds(33, 11, 87, 14);
		contentPane.add(lblSCode);
		
		JLabel lblSubjectName = new JLabel("Subject Name");
		lblSubjectName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSubjectName.setBounds(33, 47, 87, 14);
		contentPane.add(lblSubjectName);
		
		subjectCode = new JTextField();
		subjectCode.setBounds(130, 11, 177, 20);
		contentPane.add(subjectCode);
		subjectCode.setColumns(10);
		
		subjectName = new JTextField();
		subjectName.setColumns(10);
		subjectName.setBounds(130, 45, 177, 20);
		contentPane.add(subjectName);
		
		JButton btnOK = new JButton("Ok");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(subjectCode.getText().equals("") || subjectName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "You Haven't entered any subject");
				}
				else {
					try {
						String subjectNameSave = subjectName.getText().trim();
						String subjectCodeSave = subjectCode.getText().trim();
						subject = new Subject(subjectCodeSave, subjectNameSave);
						subjectName.setText("");
						subjectCode.setText("");
						JOptionPane.showMessageDialog(null, "Subject Added!");
						setVisible(false);
					}
					catch(Exception ieo) {
						JOptionPane.showMessageDialog(null, "Unexpected error!");
					}
				}
			}		
		});
		btnOK.setBounds(21, 76, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subjectCode.setText("");
				subjectName.setText("");
			}
		});
		btnReset.setBounds(127, 76, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subjectMaintananceGUI sm = new subjectMaintananceGUI();
				sm.setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(238, 76, 89, 23);
		contentPane.add(btnCancel);
	}

}
