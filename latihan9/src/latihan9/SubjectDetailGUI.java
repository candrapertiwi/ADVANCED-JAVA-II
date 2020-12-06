package latihan9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubjectDetailGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubjectDetailGUI frame = new SubjectDetailGUI();
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
	public SubjectDetailGUI() {
		setTitle("Subject Detail");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(512, 43, 17, 368);
		contentPane.add(scrollBar);
		
		JLabel labelTitle = new JLabel("BIT203 Advanced Programming in Java Student");
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTitle.setBounds(0, 11, 514, 21);
		contentPane.add(labelTitle);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 49, 496, 362);
		contentPane.add(scrollPane);
		
		JButton addStudentbtn = new JButton("Add Student");
		addStudentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDialog sd = new StudentDialog();
				sd.setVisible(true);
			}
		});
		addStudentbtn.setBounds(104, 434, 107, 23);
		contentPane.add(addStudentbtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subjectMaintananceGUI sm = new subjectMaintananceGUI();
				sm.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(221, 434, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(320, 434, 89, 23);
		contentPane.add(btnExit);
	}
}
