//code - michelle
//gui - ciara

package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;

public class findTutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLastName;
	private JTextField textField_1;
	private JCheckBox chckbxPeriod;
	private JCheckBox chckbxPeriod_1;
	private JCheckBox chckbxPeriod_2;
	private JCheckBox chckbxPeriod_3;
	private JCheckBox chckbxPeriod_4;
	private JCheckBox chckbxAfterSchool;
	private JLabel lblSubjects;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findTutor frame = new findTutor();
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
	public findTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblFirstName, "cell 1 0");
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblLastName, "cell 2 0");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 1,growx");
		textField_1.setColumns(10);
		
		chckbxPeriod = new JCheckBox("Period 1\r\n");
		contentPane.add(chckbxPeriod, "cell 1 3");
		
		chckbxPeriod_1 = new JCheckBox("Period 2");
		contentPane.add(chckbxPeriod_1, "cell 2 3");
		
		chckbxPeriod_2 = new JCheckBox("Period 3");
		contentPane.add(chckbxPeriod_2, "cell 1 4");
		
		chckbxPeriod_3 = new JCheckBox("Period 4");
		contentPane.add(chckbxPeriod_3, "cell 2 4");
		
		chckbxPeriod_4 = new JCheckBox("Period 5");
		contentPane.add(chckbxPeriod_4, "cell 1 5");
		
		chckbxAfterSchool = new JCheckBox("After School");
		contentPane.add(chckbxAfterSchool, "cell 2 5");
		
		JCheckBox chckbxSemester = new JCheckBox("Semester 1");
		contentPane.add(chckbxSemester, "cell 1 9");
		
		JCheckBox chckbxSemester_1 = new JCheckBox("Semester 2");
		contentPane.add(chckbxSemester_1, "cell 2 9");
		
		lblSubjects = new JLabel("Subjects:");
		lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSubjects, "cell 1 14");
		
		JLabel lblGrade = new JLabel("Grade 9");
		lblGrade.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade, "cell 1 16");
		
		JLabel lblGrade_1 = new JLabel("Grade 10");
		lblGrade_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade_1, "cell 2 16");
		
		JLabel lblGrade_2 = new JLabel("Grade 11");
		lblGrade_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade_2, "cell 3 16");
		JCheckBox chckbxNewCheckBox = new JCheckBox("Math\r\n");
		contentPane.add(chckbxNewCheckBox, "cell 1 18");
		
		JCheckBox checkBox = new JCheckBox("Math\r\n");
		contentPane.add(checkBox, "cell 2 18");
		
		JCheckBox checkBox_1 = new JCheckBox("Math\r\n");
		contentPane.add(checkBox_1, "cell 3 18");
		
		JCheckBox chckbxEnglish = new JCheckBox("English");
		contentPane.add(chckbxEnglish, "cell 1 19");
		
		JCheckBox checkBox_2 = new JCheckBox("English");
		contentPane.add(checkBox_2, "cell 2 19");
		
		JCheckBox checkBox_3 = new JCheckBox("English");
		contentPane.add(checkBox_3, "cell 3 19");
		
		JCheckBox chckbxScience = new JCheckBox("Science");
		contentPane.add(chckbxScience, "cell 1 20");
		
		JCheckBox checkBox_4 = new JCheckBox("Science");
		contentPane.add(checkBox_4, "cell 2 20");
		
		JCheckBox chckbxBiology = new JCheckBox("Biology");
		contentPane.add(chckbxBiology, "cell 3 20");
		
		JCheckBox chckbxGeography = new JCheckBox("Geography");
		contentPane.add(chckbxGeography, "cell 1 21");
		
		JCheckBox chckbxHistory = new JCheckBox("History");
		contentPane.add(chckbxHistory, "cell 2 21");
		
		JCheckBox chckbxChemistry = new JCheckBox("Chemistry");
		contentPane.add(chckbxChemistry, "cell 3 21");
		
		JCheckBox chckbxFrench = new JCheckBox("French");
		contentPane.add(chckbxFrench, "cell 1 22");
		
		JCheckBox chckbxFrench_1 = new JCheckBox("French");
		contentPane.add(chckbxFrench_1, "cell 2 22");
		
		JCheckBox chckbxPhysics = new JCheckBox("Physics");
		contentPane.add(chckbxPhysics, "cell 3 22");
		
		JCheckBox chckbxFiFrench = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench, "cell 1 23");
		
		JCheckBox chckbxFiFrench_1 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_1, "cell 2 23");
		
		JCheckBox chckbxFrench_2 = new JCheckBox("French");
		contentPane.add(chckbxFrench_2, "cell 3 23");
		
		JCheckBox chckbxFiScience = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience, "cell 1 24");
		
		JCheckBox chckbxFiScience_1 = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience_1, "cell 2 24");
		
		JCheckBox chckbxFiFrench_2 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_2, "cell 3 24");
		
		JCheckBox chckbxFiGeography = new JCheckBox("FI Geography");
		contentPane.add(chckbxFiGeography, "cell 1 25");
		
		JCheckBox chckbxFiHistory = new JCheckBox("FI History");
		contentPane.add(chckbxFiHistory, "cell 2 25");
		
		JCheckBox chckbxPreApBiology = new JCheckBox("Pre AP BIology");
		contentPane.add(chckbxPreApBiology, "cell 3 25");
		
		JLabel lblOther = new JLabel("Other:");
		contentPane.add(lblOther, "cell 1 26");
		
		JLabel label = new JLabel("Other:");
		contentPane.add(label, "cell 2 26");
		
		JCheckBox chckbxPreApMath = new JCheckBox("Pre AP Math");
		contentPane.add(chckbxPreApMath, "cell 3 26");
		
		JButton btnNewButton = new JButton("Find Tutor");
		contentPane.add(btnNewButton, "cell 3 28");
		
	}

}
