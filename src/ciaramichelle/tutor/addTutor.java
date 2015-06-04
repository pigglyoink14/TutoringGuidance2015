package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class addTutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTutor frame = new addTutor();
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
	public addTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][grow][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblFirstName = new JLabel("First Name");
		contentPane.add(lblFirstName, "cell 1 0");
		
		JLabel lblLastName = new JLabel("Last Name");
		contentPane.add(lblLastName, "cell 2 0");
		
		JLabel lblGrade = new JLabel("Grade");
		contentPane.add(lblGrade, "cell 3 0");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 1,growx");
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12"}));
		contentPane.add(comboBox, "cell 3 1,growx");
		
		JLabel lblSemester = new JLabel("Semester 1");
		contentPane.add(lblSemester, "cell 1 2");
		
		JCheckBox chckbxPeriod = new JCheckBox("Period 1");
		contentPane.add(chckbxPeriod, "cell 1 3");
		
		JCheckBox chckbxPeriod_1 = new JCheckBox("Period 2");
		contentPane.add(chckbxPeriod_1, "cell 2 3");
		
		JCheckBox chckbxPeriod_2 = new JCheckBox("Period 3");
		contentPane.add(chckbxPeriod_2, "cell 3 3");
		
		JCheckBox chckbxPeriod_3 = new JCheckBox("Period 4");
		contentPane.add(chckbxPeriod_3, "cell 4 3");
		
		JCheckBox chckbxPeriod_4 = new JCheckBox("Period 5");
		contentPane.add(chckbxPeriod_4, "cell 5 3");
		
		JCheckBox chckbxAfterSchool = new JCheckBox("After School");
		contentPane.add(chckbxAfterSchool, "cell 1 4");
		
		JLabel lblSemester_1 = new JLabel("Semester 2");
		contentPane.add(lblSemester_1, "cell 1 5");
		
		JCheckBox checkBox_5 = new JCheckBox("Period 1");
		contentPane.add(checkBox_5, "cell 1 6");
		
		JCheckBox checkBox_6 = new JCheckBox("Period 2");
		contentPane.add(checkBox_6, "cell 2 6");
		
		JCheckBox checkBox_7 = new JCheckBox("Period 3");
		contentPane.add(checkBox_7, "cell 3 6");
		
		JCheckBox checkBox_8 = new JCheckBox("Period 4");
		contentPane.add(checkBox_8, "cell 4 6");
		
		JCheckBox checkBox_9 = new JCheckBox("Period 5");
		contentPane.add(checkBox_9, "cell 5 6");
		
		JCheckBox checkBox_10 = new JCheckBox("After School");
		contentPane.add(checkBox_10, "cell 1 7");
		
		JLabel lblDaysAvailable = new JLabel("Days Available");
		contentPane.add(lblDaysAvailable, "cell 1 8");
		
		JCheckBox chckbxMonday = new JCheckBox("Monday");
		contentPane.add(chckbxMonday, "cell 1 9");
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		contentPane.add(chckbxTuesday, "cell 2 9");
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		contentPane.add(chckbxWednesday, "cell 3 9");
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		contentPane.add(chckbxThursday, "cell 4 9");
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		contentPane.add(chckbxFriday, "cell 5 9");
		
		JLabel lblSubjects = new JLabel("Subjects");
		contentPane.add(lblSubjects, "cell 1 11");
		
		JLabel lblGrade_1 = new JLabel("Grade 9");
		contentPane.add(lblGrade_1, "cell 1 12");
		
		JLabel lblGrade_2 = new JLabel("Grade 10");
		contentPane.add(lblGrade_2, "cell 2 12");
		
		JLabel lblGrade_3 = new JLabel("Grade 11");
		contentPane.add(lblGrade_3, "cell 3 12");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Math\r\n");
		contentPane.add(chckbxNewCheckBox, "cell 1 13");
		
		JCheckBox checkBox = new JCheckBox("Math\r\n");
		contentPane.add(checkBox, "cell 2 13");
		
		JCheckBox checkBox_1 = new JCheckBox("Math\r\n");
		contentPane.add(checkBox_1, "cell 3 13");
		
		JCheckBox chckbxEnglish = new JCheckBox("English");
		contentPane.add(chckbxEnglish, "cell 1 14");
		
		JCheckBox checkBox_2 = new JCheckBox("English");
		contentPane.add(checkBox_2, "cell 2 14");
		
		JCheckBox checkBox_3 = new JCheckBox("English");
		contentPane.add(checkBox_3, "cell 3 14");
		
		JCheckBox chckbxScience = new JCheckBox("Science");
		contentPane.add(chckbxScience, "cell 1 15");
		
		JCheckBox checkBox_4 = new JCheckBox("Science");
		contentPane.add(checkBox_4, "cell 2 15");
		
		JCheckBox chckbxBiology = new JCheckBox("Biology");
		contentPane.add(chckbxBiology, "cell 3 15");
		
		JCheckBox chckbxGeography = new JCheckBox("Geography");
		contentPane.add(chckbxGeography, "cell 1 16");
		
		JCheckBox chckbxHistory = new JCheckBox("History");
		contentPane.add(chckbxHistory, "cell 2 16");
		
		JCheckBox chckbxChemistry = new JCheckBox("Chemistry");
		contentPane.add(chckbxChemistry, "cell 3 16");
		
		JCheckBox chckbxFrench = new JCheckBox("French");
		contentPane.add(chckbxFrench, "cell 1 17");
		
		JCheckBox chckbxFrench_1 = new JCheckBox("French");
		contentPane.add(chckbxFrench_1, "cell 2 17");
		
		JCheckBox chckbxPhysics = new JCheckBox("Physics");
		contentPane.add(chckbxPhysics, "cell 3 17");
		
		JCheckBox chckbxFiFrench = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench, "cell 1 18");
		
		JCheckBox chckbxFiFrench_1 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_1, "cell 2 18");
		
		JCheckBox chckbxFrench_2 = new JCheckBox("French");
		contentPane.add(chckbxFrench_2, "cell 3 18");
		
		JCheckBox chckbxFiScience = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience, "cell 1 19");
		
		JCheckBox chckbxFiScience_1 = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience_1, "cell 2 19");
		
		JCheckBox chckbxFiFrench_2 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_2, "cell 3 19");
		
		JCheckBox chckbxFiGeography = new JCheckBox("FI Geography");
		contentPane.add(chckbxFiGeography, "cell 1 20");
		
		JCheckBox chckbxFiHistory = new JCheckBox("FI History");
		contentPane.add(chckbxFiHistory, "cell 2 20");
		
		JCheckBox chckbxPreApBiology = new JCheckBox("Pre AP BIology");
		contentPane.add(chckbxPreApBiology, "cell 3 20");
		
		JLabel lblOther = new JLabel("Other:");
		contentPane.add(lblOther, "cell 1 21");
		
		JLabel label = new JLabel("Other:");
		contentPane.add(label, "cell 2 21");
		
		JCheckBox chckbxPreApMath = new JCheckBox("Pre AP Math");
		contentPane.add(chckbxPreApMath, "cell 3 21");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 22,growx");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "cell 2 22,growx");
		
		JLabel label_1 = new JLabel("Other:");
		contentPane.add(label_1, "cell 3 22");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "cell 3 23,growx");
		
		JButton btnAddTutor = new JButton("Add Tutor");
		contentPane.add(btnAddTutor, "cell 4 24");
	}

}
