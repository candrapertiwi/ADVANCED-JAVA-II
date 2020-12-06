package latihan9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class subjectMaintananceGUI extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subjectMaintananceGUI window = new subjectMaintananceGUI();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public subjectMaintananceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Subject Maintanance");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 465, 86);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton newSubject = new JButton("New Subject");
		newSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				addSubjectDialog inputSubject = new addSubjectDialog();			
				inputSubject.setVisible(true);	
			}
		});
		newSubject.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		newSubject.setBounds(22, 11, 177, 23);
		contentPane.add(newSubject);
		
		JButton btnDisplay = new JButton("Display Details For Subject");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubjectDetailGUI sbjDet = new SubjectDetailGUI();
				sbjDet.setVisible(true);
			}
		});
		btnDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnDisplay.setBounds(211, 11, 223, 23);
		contentPane.add(btnDisplay);
	}
}
