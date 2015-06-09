//ciara

package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 589, 870);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[100px,grow][100px,grow][100px,grow][100px][100px]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));

		JLabel lblFirstName = new JLabel("First Name");
		contentPane.add(lblFirstName, "cell 0 0");

		JLabel lblLastName = new JLabel("Last Name");
		contentPane.add(lblLastName, "cell 2 0");

		JLabel lblGrade = new JLabel("Grade");
		contentPane.add(lblGrade, "cell 4 0");

		textField = new JTextField();
		contentPane.add(textField, "cell 0 1 2 1,growx");
		textField.setColumns(10);

		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 1 2 1,growx");
		textField_1.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "9", "10",
				"11", "12" }));
		contentPane.add(comboBox, "cell 4 1,growx");

		JLabel lblSemester = new JLabel("Semester 1");
		contentPane.add(lblSemester, "cell 0 3");

		JCheckBox chckbxPeriod = new JCheckBox("Period 1");
		contentPane.add(chckbxPeriod, "cell 0 4");

		JCheckBox chckbxPeriod_1 = new JCheckBox("Period 2");
		contentPane.add(chckbxPeriod_1, "cell 1 4");

		JCheckBox chckbxPeriod_2 = new JCheckBox("Period 3");
		contentPane.add(chckbxPeriod_2, "cell 2 4");

		JCheckBox chckbxPeriod_3 = new JCheckBox("Period 4");
		contentPane.add(chckbxPeriod_3, "cell 3 4");

		JCheckBox chckbxPeriod_4 = new JCheckBox("Period 5");
		contentPane.add(chckbxPeriod_4, "cell 4 4");
		
		JLabel lblDaysAvailable_1 = new JLabel("Days Available After School");
		contentPane.add(lblDaysAvailable_1, "cell 0 7 2 1");
		
		JCheckBox chckbxMonday_1 = new JCheckBox("Monday");
		contentPane.add(chckbxMonday_1, "cell 0 8");
		
		JCheckBox chckbxTuesday_1 = new JCheckBox("Tuesday");
		contentPane.add(chckbxTuesday_1, "cell 1 8");
		
		JCheckBox chckbxWednesday_1 = new JCheckBox("Wednesday");
		contentPane.add(chckbxWednesday_1, "cell 2 8");
		
		JCheckBox chckbxThursday_1 = new JCheckBox("Thursday");
		contentPane.add(chckbxThursday_1, "cell 3 8");
		
		JCheckBox chckbxFriday_1 = new JCheckBox("Friday");
		contentPane.add(chckbxFriday_1, "cell 4 8");

		JLabel lblSemester_1 = new JLabel("Semester 2");
		contentPane.add(lblSemester_1, "cell 0 10");

		JCheckBox checkBox_5 = new JCheckBox("Period 1");
		contentPane.add(checkBox_5, "cell 0 11");

		JCheckBox checkBox_6 = new JCheckBox("Period 2");
		contentPane.add(checkBox_6, "cell 1 11");

		JCheckBox checkBox_7 = new JCheckBox("Period 3");
		contentPane.add(checkBox_7, "cell 2 11");

		JCheckBox checkBox_8 = new JCheckBox("Period 4");
		contentPane.add(checkBox_8, "cell 3 11");

		JCheckBox checkBox_9 = new JCheckBox("Period 5");
		contentPane.add(checkBox_9, "cell 4 11");

		JLabel lblDaysAvailable = new JLabel("Days Available After School");
		contentPane.add(lblDaysAvailable, "cell 0 14 2 1");

		JCheckBox chckbxMonday = new JCheckBox("Monday");
		contentPane.add(chckbxMonday, "cell 0 15");

		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		contentPane.add(chckbxTuesday, "cell 1 15");

		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		contentPane.add(chckbxWednesday, "cell 2 15");

		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		contentPane.add(chckbxThursday, "cell 3 15");

		JCheckBox chckbxFriday = new JCheckBox("Friday");
		contentPane.add(chckbxFriday, "cell 4 15");

		JLabel lblSubjects = new JLabel("Subjects");
		contentPane.add(lblSubjects, "cell 0 17");

		JLabel lblGrade_1 = new JLabel("Grade 9");
		contentPane.add(lblGrade_1, "cell 0 18");

		JLabel lblGrade_2 = new JLabel("Grade 10");
		contentPane.add(lblGrade_2, "cell 1 18");

		JLabel lblGrade_3 = new JLabel("Grade 11");
		contentPane.add(lblGrade_3, "cell 2 18");

		JCheckBox chckbxNewCheckBox = new JCheckBox("Math\r\n");
		contentPane.add(chckbxNewCheckBox, "cell 0 19");

		JCheckBox checkBox = new JCheckBox("Math\r\n");
		contentPane.add(checkBox, "cell 1 19");

		JCheckBox checkBox_1 = new JCheckBox("Math\r\n");
		contentPane.add(checkBox_1, "cell 2 19");

		JCheckBox chckbxPreApMath = new JCheckBox("Pre AP Math");
		contentPane.add(chckbxPreApMath, "cell 3 19");

		JCheckBox chckbxEnglish = new JCheckBox("English");
		contentPane.add(chckbxEnglish, "cell 0 20");

		JCheckBox checkBox_2 = new JCheckBox("English");
		contentPane.add(checkBox_2, "cell 1 20");

		JCheckBox checkBox_3 = new JCheckBox("English");
		contentPane.add(checkBox_3, "cell 2 20");

		JCheckBox chckbxScience = new JCheckBox("Science");
		contentPane.add(chckbxScience, "cell 0 21");

		JCheckBox checkBox_4 = new JCheckBox("Science");
		contentPane.add(checkBox_4, "cell 1 21");

		JCheckBox chckbxBiology = new JCheckBox("Biology");
		contentPane.add(chckbxBiology, "cell 2 21");

		JCheckBox chckbxGeography = new JCheckBox("Geography");
		contentPane.add(chckbxGeography, "cell 0 22");

		JCheckBox chckbxHistory = new JCheckBox("History");
		contentPane.add(chckbxHistory, "cell 1 22");

		JCheckBox chckbxChemistry = new JCheckBox("Chemistry");
		contentPane.add(chckbxChemistry, "cell 2 22");

		JCheckBox chckbxFrench = new JCheckBox("French");
		contentPane.add(chckbxFrench, "cell 0 23");

		JCheckBox chckbxFrench_1 = new JCheckBox("French");
		contentPane.add(chckbxFrench_1, "cell 1 23");

		JCheckBox chckbxPhysics = new JCheckBox("Physics");
		contentPane.add(chckbxPhysics, "cell 2 23");

		JCheckBox chckbxFiFrench = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench, "cell 0 24");

		JCheckBox chckbxFiFrench_1 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_1, "cell 1 24");

		JCheckBox chckbxFrench_2 = new JCheckBox("French");
		contentPane.add(chckbxFrench_2, "cell 2 24");

		JCheckBox chckbxFiScience = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience, "cell 0 25");

		JCheckBox chckbxFiScience_1 = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience_1, "cell 1 25");

		JCheckBox chckbxFiFrench_2 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_2, "cell 2 25");

		JCheckBox chckbxFiGeography = new JCheckBox("FI Geography");
		contentPane.add(chckbxFiGeography, "cell 0 26");

		JCheckBox chckbxFiHistory = new JCheckBox("FI History");
		contentPane.add(chckbxFiHistory, "cell 1 26");

		JCheckBox chckbxPreApBiology = new JCheckBox("Pre AP BIology");
		contentPane.add(chckbxPreApBiology, "cell 2 26");

		JLabel lblOther = new JLabel("Other:");
		contentPane.add(lblOther, "cell 0 27");

		JLabel label = new JLabel("Other:");
		contentPane.add(label, "cell 1 27");

		JLabel label_1 = new JLabel("Other:");
		contentPane.add(label_1, "cell 2 27");

		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 0 28,growx");
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "cell 1 28,growx");

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "cell 2 28 2 1,growx");
		
				JButton btnAddTutor = new JButton("Add Tutor");
				btnAddTutor.addActionListener((ActionEvent arg0) -> {
					try {
						RandomAccessFile current = new RandomAccessFile("binary.dat",
								"rw");
						String textFieldText = textField.getText();

						current.writeUTF(String.format(
								"%-15s",
								textFieldText.substring(0,
										Math.min(textFieldText.length(), 15))));
						textFieldText = textField_1.getText();
						current.writeUTF(String.format(
								"%-15s",
								textFieldText.substring(0,
										Math.min(textFieldText.length(), 15))));
						current.writeInt((int) comboBox.getItemAt(comboBox
								.getSelectedIndex()));
						current.writeBoolean(chckbxPeriod.isSelected());
						current.writeBoolean(chckbxPeriod_1.isSelected());
						current.writeBoolean(chckbxPeriod_2.isSelected());
						current.writeBoolean(chckbxPeriod_3.isSelected());
						current.writeBoolean(chckbxPeriod_4.isSelected());
						current.writeBoolean(chckbxMonday_1.isSelected());
						current.writeBoolean(chckbxTuesday_1.isSelected());
						current.writeBoolean(chckbxWednesday_1.isSelected());
						current.writeBoolean(chckbxThursday_1.isSelected());
						current.writeBoolean(chckbxFriday_1.isSelected());
						
						current.writeBoolean(checkBox_5.isSelected());
						current.writeBoolean(checkBox_6.isSelected());
						current.writeBoolean(checkBox_7.isSelected());
						current.writeBoolean(checkBox_8.isSelected());
						current.writeBoolean(checkBox_9.isSelected());
						
						current.writeBoolean(chckbxMonday.isSelected());
						current.writeBoolean(chckbxTuesday.isSelected());
						current.writeBoolean(chckbxWednesday.isSelected());
						current.writeBoolean(chckbxThursday.isSelected());
						current.writeBoolean(chckbxFriday.isSelected());
						// grade nine
						current.writeBoolean(chckbxNewCheckBox.isSelected());
						current.writeBoolean(chckbxEnglish.isSelected());
						current.writeBoolean(chckbxScience.isSelected());
						current.writeBoolean(chckbxGeography.isSelected());
						current.writeBoolean(chckbxFrench.isSelected());
						current.writeBoolean(chckbxFiFrench.isSelected());
						current.writeBoolean(chckbxFiScience.isSelected());
						current.writeBoolean(chckbxFiGeography.isSelected());
						textFieldText = textField_2.getText();
						current.writeUTF(String.format(
								"%-s8",
								textFieldText.substring(0,
										Math.min(textFieldText.length(), 8))));

						// grade 10
						current.writeBoolean(checkBox.isSelected());
						current.writeBoolean(checkBox_2.isSelected());
						current.writeBoolean(checkBox_4.isSelected());
						current.writeBoolean(chckbxHistory.isSelected());
						current.writeBoolean(chckbxFrench_1.isSelected());
						current.writeBoolean(chckbxFiFrench_1.isSelected());
						current.writeBoolean(chckbxFiScience_1.isSelected());
						current.writeBoolean(chckbxFiHistory.isSelected());
						textFieldText = textField_3.getText();
						current.writeUTF(String.format(
								"%-s8",
								textFieldText.substring(0,
										Math.min(textFieldText.length(), 8))));

						// grade 11
						current.writeBoolean(checkBox_1.isSelected());
						current.writeBoolean(checkBox_3.isSelected());
						current.writeBoolean(chckbxBiology.isSelected());
						current.writeBoolean(chckbxChemistry.isSelected());
						current.writeBoolean(chckbxPhysics.isSelected());
						current.writeBoolean(chckbxFrench_2.isSelected());
						current.writeBoolean(chckbxFiFrench_2.isSelected());
						current.writeBoolean(chckbxPreApBiology.isSelected());
						current.writeBoolean(chckbxPreApMath.isSelected());
						textFieldText = textField_4.getText();
						current.writeUTF(String.format(
								"%-s8",
								textFieldText.substring(0,
										Math.min(textFieldText.length(), 8))));

						current.close();
						setVisible(false);
						dispose();

					} catch (IOException e1) {

					}
				});
				contentPane.add(btnAddTutor, "cell 4 31");
	}

}
