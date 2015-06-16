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
import java.util.HashSet;

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
     * Create the frame.
     */
    public findTutor() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                HashSet<SearchByName> people = new HashSet<>();
                try {
                    if (chckbxNewCheckBox.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 57));

                    }
                    if (chckbxEnglish.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 102));

                    }
                    if (chckbxScience.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 103));

                    }
                    if (chckbxGeography.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 104));

                    }
                    if (chckbxFrench.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 105));

                    }
                    if (chckbxFiFrench.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 106));

                    }
                    if (checkBox.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 107));

                    }
                    if (checkBox_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 108));

                    }
                    if (checkBox_4.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 109));

                    }
                    if (chckbxHistory.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 110));

                    }
                    if (chckbxFrench_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 111));

                    }
                    if (chckbxFiFrench_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 112));

                    }
                    if (chckbxFiScience_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 113));

                    }
                    if (chckbxFiHistory.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 114));

                    }
                    if (checkBox_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 115));

                    }
                    if (checkBox_3.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 116));

                    }
                    if (chckbxBiology.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 117));

                    }
                    if (chckbxChemistry.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 118));

                    }
                    if (chckbxPhysics.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 119));

                    }
                    if (chckbxFrench_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 120));

                    }
                    if (chckbxFiFrench_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 121));

                    }
                    if (chckbxPreApBiology.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 122));

                    }
                    if (chckbxPreApMath.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 123));

                    }
                    ArrayList<SearchByName> finalPeople = new ArrayList<>();
                    for (SearchByName person : people) {
                        if (chckbxSemester.isSelected()) {
                            if (chckbxPeriod.isSelected() && person.semOnePerOne) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_1.isSelected() && person.semOnePerTwo) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_2.isSelected() && person.semOnePerThree) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_3.isSelected() && person.semOnePerFour) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_4.isSelected() && person.semOnePerFive) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxMonday.isSelected() && person.semOneMonday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxTuesday.isSelected() && person.semOneTuesday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxWednesday.isSelected() && person.semOneWednesday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxThursday.isSelected() && person.semOneThursday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxFriday.isSelected() && person.semOneFriday) {
                                finalPeople.add(person);
                                continue;
                            }
                        } else {
                            if (chckbxPeriod.isSelected() && person.semTwoPerOne) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_1.isSelected() && person.semTwoPerTwo) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_2.isSelected() && person.semTwoPerThree) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_3.isSelected() && person.semTwoPerFour) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxPeriod_4.isSelected() && person.semTwoPerFive) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxMonday.isSelected() && person.semTwoMonday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxTuesday.isSelected() && person.semTwoTuesday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxWednesday.isSelected() && person.semTwoWednesday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxThursday.isSelected() && person.semTwoThursday) {
                                finalPeople.add(person);
                                continue;
                            }
                            if (chckbxFriday.isSelected() && person.semTwoFriday) {
                                finalPeople.add(person);
                                continue;
                            }
                        }

                    }
                    TutorList stuff = new TutorList(finalPeople);
                    System.out.println(finalPeople.get(0).firstName);
                    System.out.println(finalPeople.get(0).lastName);
                    System.out.println(finalPeople.get(0).grade);
                    System.out.println(finalPeople.get(0).semOnePerOne);
                    System.out.println(finalPeople.get(0).semOnePerTwo);
                    System.out.println(finalPeople.get(0).semOnePerThree);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        contentPane.add(btnNewButton, "cell 3 38");
    }

}
