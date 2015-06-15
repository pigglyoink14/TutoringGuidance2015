//code - michelle
//gui - ciara

package ciaramichelle.tutor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

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
	private JLabel lblSubjects;
        private ArrayList arb = new ArrayList();

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
		setBounds(100, 100, 538, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
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
		
		JLabel lblAfterSchool = new JLabel("After School");
		lblAfterSchool.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblAfterSchool, "cell 1 8");
		
		JCheckBox chckbxMonday = new JCheckBox("Monday");
		contentPane.add(chckbxMonday, "cell 1 9");
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		contentPane.add(chckbxTuesday, "cell 2 9");
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		contentPane.add(chckbxWednesday, "cell 3 9");
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		contentPane.add(chckbxThursday, "cell 1 10");
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		contentPane.add(chckbxFriday, "cell 2 10");
		
		JCheckBox chckbxSemester = new JCheckBox("Semester 1");
		contentPane.add(chckbxSemester, "cell 1 16");
		
		JCheckBox chckbxSemester_1 = new JCheckBox("Semester 2");
		contentPane.add(chckbxSemester_1, "cell 2 16");
		
		lblSubjects = new JLabel("Subjects:");
		lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSubjects, "cell 1 23");
		
		JLabel lblGrade = new JLabel("Grade 9");
		lblGrade.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade, "cell 1 25");
		
		JLabel lblGrade_1 = new JLabel("Grade 10");
		lblGrade_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade_1, "cell 2 25");
		
		JLabel lblGrade_2 = new JLabel("Grade 11");
		lblGrade_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		contentPane.add(lblGrade_2, "cell 3 25");
		JCheckBox chckbxNewCheckBox = new JCheckBox("Math\r\n");
		contentPane.add(chckbxNewCheckBox, "cell 1 27");
		
		JCheckBox checkBox = new JCheckBox("Math\r\n");
		contentPane.add(checkBox, "cell 2 27");
		
		JCheckBox checkBox_1 = new JCheckBox("Math\r\n");
		contentPane.add(checkBox_1, "cell 3 27");
		
		JCheckBox chckbxEnglish = new JCheckBox("English");
		contentPane.add(chckbxEnglish, "cell 1 28");
		
		JCheckBox checkBox_2 = new JCheckBox("English");
		contentPane.add(checkBox_2, "cell 2 28");
		
		JCheckBox checkBox_3 = new JCheckBox("English");
		contentPane.add(checkBox_3, "cell 3 28");
		
		JCheckBox chckbxScience = new JCheckBox("Science");
		contentPane.add(chckbxScience, "cell 1 29");
		
		JCheckBox checkBox_4 = new JCheckBox("Science");
		contentPane.add(checkBox_4, "cell 2 29");
		
		JCheckBox chckbxBiology = new JCheckBox("Biology");
		contentPane.add(chckbxBiology, "cell 3 29");
		
		JCheckBox chckbxGeography = new JCheckBox("Geography");
		contentPane.add(chckbxGeography, "cell 1 30");
		
		JCheckBox chckbxHistory = new JCheckBox("History");
		contentPane.add(chckbxHistory, "cell 2 30");
		
		JCheckBox chckbxChemistry = new JCheckBox("Chemistry");
		contentPane.add(chckbxChemistry, "cell 3 30");
		
		JCheckBox chckbxFrench = new JCheckBox("French");
		contentPane.add(chckbxFrench, "cell 1 31");
		
		JCheckBox chckbxFrench_1 = new JCheckBox("French");
		contentPane.add(chckbxFrench_1, "cell 2 31");
		
		JCheckBox chckbxPhysics = new JCheckBox("Physics");
		contentPane.add(chckbxPhysics, "cell 3 31");
		
		JCheckBox chckbxFiFrench = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench, "cell 1 32");
		
		JCheckBox chckbxFiFrench_1 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_1, "cell 2 32");
		
		JCheckBox chckbxFrench_2 = new JCheckBox("French");
		contentPane.add(chckbxFrench_2, "cell 3 32");
		
		JCheckBox chckbxFiScience = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience, "cell 1 33");
		
		JCheckBox chckbxFiScience_1 = new JCheckBox("FI Science");
		contentPane.add(chckbxFiScience_1, "cell 2 33");
		
		JCheckBox chckbxFiFrench_2 = new JCheckBox("FI French");
		contentPane.add(chckbxFiFrench_2, "cell 3 33");
		
		JCheckBox chckbxFiGeography = new JCheckBox("FI Geography");
		contentPane.add(chckbxFiGeography, "cell 1 34");
		
		JCheckBox chckbxFiHistory = new JCheckBox("FI History");
		contentPane.add(chckbxFiHistory, "cell 2 34");
		
		JCheckBox chckbxPreApBiology = new JCheckBox("Pre AP BIology");
		contentPane.add(chckbxPreApBiology, "cell 3 34");
		
		JCheckBox chckbxPreApMath = new JCheckBox("Pre AP Math");
		contentPane.add(chckbxPreApMath, "cell 3 35");
		
		JButton btnNewButton = new JButton("Find Tutor");
                
                btnNewButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                        ArrayList<SearchByName> people = new ArrayList<>();
                        try {
                            if(chckbxNewCheckBox.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 60));
                                
                            }
                            if(chckbxEnglish.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 61));
                                
                            }
                            if(chckbxScience.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 62));
                                
                            }
                            if(chckbxGeography.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 63));
                                
                            }
                            if(chckbxFrench.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 64));
                                
                            }
                            if(chckbxFiFrench.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 65));
                                
                            }
                            if(checkBox.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 66));
                                
                            }
                            if(checkBox_2.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 67));
                                
                            }
                            if(checkBox_4.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 68));
                                
                            }
                            if(chckbxHistory.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 69));
                                
                            }
                            if(chckbxFrench_1.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 70));
                                
                            }if(chckbxFiFrench_1.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 71));
                                
                            }
                            if(chckbxFiScience_1.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 72));
                                
                            }
                            if(chckbxFiHistory.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 73));
                                
                            }
                            if(checkBox_1.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 74));
                                
                            }
                            if(checkBox_3.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 75));
                                
                            }if(chckbxBiology.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 76));
                                
                            }
                            if(chckbxChemistry.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 77));
                                
                            }
                            if(chckbxPhysics.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 78));
                                
                            }
                            if(chckbxFrench_2.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 79));
                                
                            }
                            if(chckbxFiFrench_2.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 80));
                                
                            }
                            if(chckbxPreApBiology.isSelected()){
                               people.addAll(SearchByName.searchBySubject("binary.dat", 81));
                                
                            }
                            if(chckbxPreApMath.isSelected()){
                                people.addAll(SearchByName.searchBySubject("binary.dat", 82));
                                
                            }
                            ArrayList<SearchByName> finalPeople = new ArrayList<>();
                            for(int i=0; i < people.size(); i++){
                                if(chckbxSemester.isSelected()){
                                    if(chckbxPeriod.isSelected() && people.get(i).semOnePerOne){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_1.isSelected() && people.get(i).semOnePerTwo){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_2.isSelected() && people.get(i).semOnePerThree){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_3.isSelected() && people.get(i).semOnePerFour){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_4.isSelected() && people.get(i).semOnePerFive){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxMonday.isSelected() && people.get(i).semOneMonday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxTuesday.isSelected() && people.get(i).semOneTuesday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxWednesday.isSelected() && people.get(i).semOneWednesday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxThursday.isSelected() && people.get(i).semOneThursday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxFriday.isSelected() && people.get(i).semOneFriday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                }else{
                                    if(chckbxPeriod.isSelected() && people.get(i).semTwoPerOne){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_1.isSelected() && people.get(i).semTwoPerTwo){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_2.isSelected() && people.get(i).semTwoPerThree){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_3.isSelected() && people.get(i).semTwoPerFour){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxPeriod_4.isSelected() && people.get(i).semTwoPerFive){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxMonday.isSelected() && people.get(i).semTwoMonday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxTuesday.isSelected() && people.get(i).semTwoTuesday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxWednesday.isSelected() && people.get(i).semTwoWednesday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxThursday.isSelected() && people.get(i).semTwoThursday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                    if(chckbxFriday.isSelected() && people.get(i).semTwoFriday){
                                        finalPeople.add(people.get(i));
                                        continue;
                                    }
                                }
                                
                            }
                            
                            
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        
                        
                    }
                });
                contentPane.add(btnNewButton, "cell 3 38");
                setVisible(true);
		
		
	}

}
