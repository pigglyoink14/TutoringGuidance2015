//ciara
package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SpecificTutor extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     *
     * @param person filtered list
     */
    public SpecificTutor(SearchByName person) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 569 + 100, 496 + 100);
        setLocationRelativeTo(null);
        setTitle(person.firstName.trim() + " " + person.lastName.trim());
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[111][111][111][111][111][111]", "[][][][][][30.00][30.00][30.00][30.00][30.00][30.00][][][][30.00][30.00][30.00][30.00][30.00][30.00]"));

        JLabel lblFirstName = new JLabel("First Name:");
        contentPane.add(lblFirstName, "cell 1 0");

        JLabel lblLastName = new JLabel("Last Name:");
        contentPane.add(lblLastName, "cell 3 0");

        JLabel lblGrade = new JLabel("Grade:");
        contentPane.add(lblGrade, "cell 5 0");

        JLabel lblNewLabel = new JLabel(person.firstName);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel, "cell 1 1");

        JLabel lblNewLabel_1 = new JLabel(person.lastName);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_1, "cell 3 1");

        JLabel lblNewLabel_2 = new JLabel(String.valueOf(person.grade));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_2, "cell 5 1");

        JLabel lblSemesterOne = new JLabel("Semester One");
        contentPane.add(lblSemesterOne, "cell 0 3 2 1");

        JLabel lblMonday = new JLabel("Monday");
        contentPane.add(lblMonday, "cell 1 4");

        JLabel lblTuesday = new JLabel("Tuesday");
        contentPane.add(lblTuesday, "cell 2 4");

        JLabel lblWednesday = new JLabel("Wednesday");
        contentPane.add(lblWednesday, "cell 3 4");

        JLabel lblThursday = new JLabel("Thursday");
        contentPane.add(lblThursday, "cell 4 4");

        JLabel lblFriday = new JLabel("Friday");
        contentPane.add(lblFriday, "cell 5 4");

        JLabel lblPeriod = new JLabel("Period 1");
        contentPane.add(lblPeriod, "cell 0 5");

        JButton[] buttons = new JButton[30];
        int counter = 0;
        for (int i = 5; i < 11; i++) {
            for (int j = 1; j < 6; j++) {
                buttons[counter] = new JButton("");
                if ((i == 5 && !person.semOnePerOne) || (i == 6 && !person.semOnePerTwo) || (i == 7 && !person.semOnePerThree) || (i == 8 && !person.semOnePerFour)
                        || (i == 9 && !person.semOnePerFive || (i == 10 && ((!person.semOneMonday && j == 1) || (!person.semOneTuesday && j == 2) || (!person.semOneWednesday && j == 3) || (!person.semOneThursday && j == 4) || (!person.semOneFriday && j == 5))))) {
                    buttons[counter].setEnabled(false);
                }
                if (!person.availiability[counter] && buttons[counter].isEnabled()) {
                    buttons[counter].setBackground(Color.red);
                } else if (buttons[counter].isEnabled() && person.availiability[counter]) {
                    buttons[counter].setBackground(Color.green);
                }

                buttons[counter].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (((JButton) e.getSource()).getBackground().equals(Color.green)) {
                            ((JButton) e.getSource()).setBackground(Color.red);
                            person.availiability[Integer.parseInt(e.getActionCommand())] = false;
                        } else {
                            ((JButton) e.getSource()).setBackground(Color.green);
                            person.availiability[Integer.parseInt(e.getActionCommand())] = true;
                        }

                    }
                });
                buttons[counter].setActionCommand(String.valueOf(counter));
                contentPane.add(buttons[counter], "cell " + j + " " + i + ", grow");
                counter++;
            }

        }

        JLabel lblPeriod_1 = new JLabel("Period 2");
        contentPane.add(lblPeriod_1, "cell 0 6");

        JLabel lblPeriod_2 = new JLabel("Period 3");
        contentPane.add(lblPeriod_2, "cell 0 7");

        JLabel lblPeriod_3 = new JLabel("Period 4");
        contentPane.add(lblPeriod_3, "cell 0 8");

        JLabel lblPeriod_4 = new JLabel("Period 5");
        contentPane.add(lblPeriod_4, "cell 0 9");

        JLabel lblAfterSchool = new JLabel("After School");
        contentPane.add(lblAfterSchool, "cell 0 10");

        JButton[] buttonsTwo = new JButton[30];
        int counterTwo = 0;
        for (int i = 14; i < 20; i++) {
            for (int j = 1; j < 6; j++) {
                buttonsTwo[counterTwo] = new JButton("");
                if ((i == 14 && !person.semTwoPerOne) || (i == 15 && !person.semTwoPerTwo) || (i == 16 && !person.semTwoPerThree) || (i == 17 && !person.semTwoPerFour)
                        || (i == 18 && !person.semTwoPerFive || (i == 19 && ((j == 1 && !person.semTwoMonday) || (j == 2 && !person.semTwoTuesday) || (j == 3 && !person.semTwoWednesday) || (j == 4 && !person.semTwoThursday) || (j == 5 && !person.semTwoFriday))))) {
                    buttonsTwo[counterTwo].setEnabled(false);
                }
                if (!person.availiability[counterTwo + 30] && buttonsTwo[counterTwo].isEnabled()) {
                    buttonsTwo[counterTwo].setBackground(Color.red);
                } else if (buttonsTwo[counterTwo].isEnabled() && person.availiability[counterTwo + 30]) {
                    buttonsTwo[counterTwo].setBackground(Color.green);
                }

                buttonsTwo[counterTwo].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (((JButton) e.getSource()).getBackground().equals(Color.green)) {
                            ((JButton) e.getSource()).setBackground(Color.red);
                            person.availiability[Integer.parseInt(e.getActionCommand())] = false;
                        } else {
                            ((JButton) e.getSource()).setBackground(Color.green);
                            person.availiability[Integer.parseInt(e.getActionCommand())] = true;
                        }

                    }
                });

                buttonsTwo[counterTwo].setActionCommand(String.valueOf(counter + 30));
                contentPane.add(buttonsTwo[counterTwo], "cell " + j + " " + i + ", grow");
                counterTwo++;
            }

        }

        JLabel label = new JLabel("Monday");
        contentPane.add(label, "cell 1 13");

        JLabel label_1 = new JLabel("Tuesday");
        contentPane.add(label_1, "cell 2 13");

        JLabel label_2 = new JLabel("Wednesday");
        contentPane.add(label_2, "cell 3 13");

        JLabel label_3 = new JLabel("Thursday");
        contentPane.add(label_3, "cell 4 13");

        JLabel label_4 = new JLabel("Friday");
        contentPane.add(label_4, "cell 5 13");

        JLabel label_5 = new JLabel("Period 1");
        contentPane.add(label_5, "cell 0 14");

        JLabel label_6 = new JLabel("Period 2");
        contentPane.add(label_6, "cell 0 15");

        JLabel label_7 = new JLabel("Period 3");
        contentPane.add(label_7, "cell 0 16");

        JLabel label_8 = new JLabel("Period 4");
        contentPane.add(label_8, "cell 0 17");

        JLabel label_9 = new JLabel("Period 5");
        contentPane.add(label_9, "cell 0 18");

        JLabel lblAfterSchool_1 = new JLabel("After School");
        contentPane.add(lblAfterSchool_1, "cell 0 19");

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    RandomAccessFile raf = new RandomAccessFile("binary.dat", "rw");
                    raf.seek(4);
                    while (raf.getFilePointer() < raf.length()) {
                        if (raf.readUTF().equalsIgnoreCase(person.firstName) && raf.readUTF().equalsIgnoreCase(person.lastName)) {
                            raf.skipBytes(143 - 60 - 34);
                            for (int i = 0; i < person.availiability.length; i++) {
                                raf.writeBoolean(person.availiability[i]);
                            }
                            break;
                        }else
                            raf.skipBytes(109);
                    }
                    raf.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Something went wrong");
                }

            }
        });

        setVisible(true);
    }

}
