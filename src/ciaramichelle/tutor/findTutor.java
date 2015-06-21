//code - michelle
//gui - ciara
package ciaramichelle.tutor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashSet;
import javax.swing.JSeparator;

/**
 * Finds tutor from a binary file list using filters from checkboxes
 * @author Michelle
 */
public class findTutor extends JFrame {

    private JPanel contentPane;
    private JCheckBox chckbxPeriod;
    private JCheckBox chckbxPeriod_1;
    private JCheckBox chckbxPeriod_2;
    private JCheckBox chckbxPeriod_3;
    private JCheckBox chckbxPeriod_4;
    private JLabel lblSubjects;

    /**
     * Create the frame.
     */
    public findTutor() {
        
        //find tutor
        JButton btnNewButton = new JButton("Find Tutor");
        btnNewButton.setEnabled(false);
        
        //subject checkboxes
        JCheckBox chckbxNewCheckBox = new JCheckBox("Math\r\n");
        JCheckBox checkBox = new JCheckBox("Math\r\n");
        JCheckBox checkBox_1 = new JCheckBox("Math\r\n");
        JCheckBox chckbxEnglish = new JCheckBox("English");
        JCheckBox checkBox_2 = new JCheckBox("English");
        JCheckBox checkBox_3 = new JCheckBox("English");
        JCheckBox chckbxScience = new JCheckBox("Science");
        JCheckBox checkBox_4 = new JCheckBox("Science");
        JCheckBox chckbxBiology = new JCheckBox("Biology");
        JCheckBox chckbxGeography = new JCheckBox("Geography");
        JCheckBox chckbxHistory = new JCheckBox("History");
        JCheckBox chckbxChemistry = new JCheckBox("Chemistry");
        JCheckBox chckbxFrench = new JCheckBox("French");
        JCheckBox chckbxFrench_1 = new JCheckBox("French");
        JCheckBox chckbxPhysics = new JCheckBox("Physics");
        JCheckBox chckbxFiFrench = new JCheckBox("FI French");
        JCheckBox chckbxFiFrench_1 = new JCheckBox("FI French");
        JCheckBox chckbxFrench_2 = new JCheckBox("French");
        JCheckBox chckbxFiScience = new JCheckBox("FI Science");
        JCheckBox chckbxFiScience_1 = new JCheckBox("FI Science");
        JCheckBox chckbxFiFrench_2 = new JCheckBox("FI French");
        JCheckBox chckbxFiGeography = new JCheckBox("FI Geography");
        JCheckBox chckbxFiHistory = new JCheckBox("FI History");
        JCheckBox chckbxPreApBiology = new JCheckBox("Pre AP BIology");
        JCheckBox chckbxPreApMath = new JCheckBox("Pre AP Math");
        
        //only allow finding if at least one subject is checked
        ItemListener il = new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if( e.getStateChange() == ItemEvent.SELECTED && (e.getSource().equals(chckbxNewCheckBox) || e.getSource().equals(checkBox) || e.getSource().equals(checkBox_1) || e.getSource().equals(chckbxEnglish) || e.getSource().equals(checkBox_2)
                        || e.getSource().equals(checkBox_3) || e.getSource().equals(chckbxScience) || e.getSource().equals(chckbxGeography) || e.getSource().equals(chckbxHistory)
                        || e.getSource().equals(chckbxChemistry) || e.getSource().equals(chckbxFrench) || e.getSource().equals(chckbxFrench_1) || e.getSource().equals(chckbxPhysics)
                        || e.getSource().equals(chckbxFiFrench) || e.getSource().equals(chckbxFiFrench_1) || e.getSource().equals(chckbxFrench_2) || e.getSource().equals(chckbxFiScience)
                        || e.getSource().equals(chckbxFiScience_1) || e.getSource().equals(chckbxFiFrench_2) || e.getSource().equals(chckbxFiGeography) || e.getSource().equals(chckbxFiHistory)
                        || e.getSource().equals(chckbxPreApBiology) || e.getSource().equals(chckbxPreApMath)))
                    btnNewButton.setEnabled(true);
                else if(!checkBox.isSelected() && !checkBox_1.isSelected() && !chckbxEnglish.isSelected() && !checkBox_2.isSelected() && !checkBox_3.isSelected() && !chckbxScience.isSelected()
                        && !chckbxGeography.isSelected() && !chckbxHistory.isSelected() && !chckbxFiFrench.isSelected() && !chckbxFiFrench_1.isSelected() && !chckbxFrench_2.isSelected() && !chckbxFiScience.isSelected()
                        && !chckbxFiScience_1.isSelected() && !chckbxFiFrench_2.isSelected() && !chckbxFiGeography.isSelected() && !chckbxFiHistory.isSelected() && !chckbxPreApBiology.isSelected() && !chckbxPreApMath.isSelected())
                    btnNewButton.setEnabled(false);
            }
            
            
        };
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 538, 690);
        setTitle("Find a Tutor!");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));

        //formatting/layout
        JLabel instructions = new JLabel("Please pick a Subject, and Day/Period you wish to find a Tutor for.");
        instructions.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(instructions, "cell 1 0 3 0, grow");
        
        JLabel periodLabel = new JLabel("Periods");
        periodLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(periodLabel, "cell 1 1");
        
        JSeparator ln3 = new JSeparator();
        contentPane.add(ln3, "cell 1 2 3 0, grow");
        
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
        lblAfterSchool.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblAfterSchool, "cell 1 8");
        
        JSeparator ln2 = new JSeparator();
        contentPane.add(ln2, "cell 1 9 3 0, grow");

        JCheckBox chckbxMonday = new JCheckBox("Monday");
        contentPane.add(chckbxMonday, "cell 1 10");

        JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
        contentPane.add(chckbxTuesday, "cell 2 10");

        JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
        contentPane.add(chckbxWednesday, "cell 3 10");

        JCheckBox chckbxThursday = new JCheckBox("Thursday");
        contentPane.add(chckbxThursday, "cell 1 11");

        JCheckBox chckbxFriday = new JCheckBox("Friday");
        contentPane.add(chckbxFriday, "cell 2 11");

        JCheckBox chckbxSemester = new JCheckBox("Semester 1");
        contentPane.add(chckbxSemester, "cell 1 16");

        JCheckBox chckbxSemester_1 = new JCheckBox("Semester 2");
        contentPane.add(chckbxSemester_1, "cell 2 16");

        lblSubjects = new JLabel("Subjects");
        lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblSubjects, "cell 1 23");

        JLabel lblGrade = new JLabel("Grade 9");
        lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblGrade, "cell 1 25");

        JLabel lblGrade_1 = new JLabel("Grade 10");
        lblGrade_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblGrade_1, "cell 2 25");

        JLabel lblGrade_2 = new JLabel("Grade 11");
        lblGrade_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblGrade_2, "cell 3 25");
        
        chckbxNewCheckBox.addItemListener(il);
        contentPane.add(chckbxNewCheckBox, "cell 1 27");

        checkBox.addItemListener(il);
        contentPane.add(checkBox, "cell 2 27");

        checkBox_1.addItemListener(il);
        contentPane.add(checkBox_1, "cell 3 27");

        chckbxEnglish.addItemListener(il);
        contentPane.add(chckbxEnglish, "cell 1 28");

        checkBox_2.addItemListener(il);
        contentPane.add(checkBox_2, "cell 2 28");

        checkBox_3.addItemListener(il);
        contentPane.add(checkBox_3, "cell 3 28");

        chckbxScience.addItemListener(il);
        contentPane.add(chckbxScience, "cell 1 29");

        checkBox_4.addItemListener(il);
        contentPane.add(checkBox_4, "cell 2 29");

        chckbxBiology.addItemListener(il);
        contentPane.add(chckbxBiology, "cell 3 29");

        chckbxGeography.addItemListener(il);
        contentPane.add(chckbxGeography, "cell 1 30");

        chckbxHistory.addItemListener(il);
        contentPane.add(chckbxHistory, "cell 2 30");

        chckbxChemistry.addItemListener(il);
        contentPane.add(chckbxChemistry, "cell 3 30");

        chckbxFrench.addItemListener(il);
        contentPane.add(chckbxFrench, "cell 1 31");

        chckbxFrench_1.addItemListener(il);
        contentPane.add(chckbxFrench_1, "cell 2 31");

        chckbxPhysics.addItemListener(il);
        contentPane.add(chckbxPhysics, "cell 3 31");

        chckbxFiFrench.addItemListener(il);
        contentPane.add(chckbxFiFrench, "cell 1 32");

        chckbxFiFrench_1.addItemListener(il);
        contentPane.add(chckbxFiFrench_1, "cell 2 32");

        chckbxFrench_2.addItemListener(il);
        contentPane.add(chckbxFrench_2, "cell 3 32");

        chckbxFiScience.addItemListener(il);
        contentPane.add(chckbxFiScience, "cell 1 33");

        chckbxFiScience_1.addItemListener(il);
        contentPane.add(chckbxFiScience_1, "cell 2 33");

        chckbxFiFrench_2.addItemListener(il);
        contentPane.add(chckbxFiFrench_2, "cell 3 33");

        chckbxFiGeography.addItemListener(il);
        contentPane.add(chckbxFiGeography, "cell 1 34");

        chckbxFiHistory.addItemListener(il);
        contentPane.add(chckbxFiHistory, "cell 2 34");

        
        chckbxPreApBiology.addItemListener(il);
        contentPane.add(chckbxPreApBiology, "cell 3 34");

        chckbxPreApMath.addItemListener(il);
        contentPane.add(chckbxPreApMath, "cell 3 35");
        
        JSeparator separator = new JSeparator();
        contentPane.add(separator, "cell 1 24 3 0, grow");
        
        //when find button is pressed
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //add people to hashset dependant on checked checkboxes, then filter even more using period and afterschool day
                HashSet<SearchByName> people = new HashSet<>();
                try {
                    if (chckbxNewCheckBox.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 58));                     

                    }
                    if (chckbxEnglish.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 59));

                    }
                    if (chckbxScience.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 60));

                    }
                    if (chckbxGeography.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 61));

                    }
                    if (chckbxFrench.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 62));

                    }
                    if (chckbxFiFrench.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 63));

                    }
                    if (checkBox.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 64));

                    }
                    if (checkBox_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 65));

                    }
                    if (checkBox_4.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 66));

                    }
                    if (chckbxHistory.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 67));

                    }
                    if (chckbxFrench_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 68));

                    }
                    if (chckbxFiFrench_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 69));

                    }
                    if (chckbxFiScience_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 70));

                    }
                    if (chckbxFiHistory.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 71));

                    }
                    if (checkBox_1.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 72));

                    }
                    if (checkBox_3.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 73));

                    }
                    if (chckbxBiology.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 74));

                    }
                    if (chckbxChemistry.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 75));

                    }
                    if (chckbxPhysics.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 76));

                    }
                    if (chckbxFrench_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 77));

                    }
                    if (chckbxFiFrench_2.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 78));

                    }
                    if (chckbxPreApBiology.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 79));

                    }
                    if (chckbxPreApMath.isSelected()) {
                        people.addAll(SearchByName.searchBySubject("binary.dat", 80));

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
                    //after filtering, bring up list of filtered tutors
                    TutorList stuff = new TutorList(finalPeople);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        contentPane.add(btnNewButton, "cell 3 38");
    }

}
