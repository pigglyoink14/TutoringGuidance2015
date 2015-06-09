//ciara
package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SpecificTutor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpecificTutor frame = new SpecificTutor();
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
	public SpecificTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblFirstName = new JLabel("First Name:");
		contentPane.add(lblFirstName, "cell 1 0");
		
		JLabel lblLastName = new JLabel("Last Name:");
		contentPane.add(lblLastName, "cell 3 0");
		
		JLabel lblGrade = new JLabel("Grade:");
		contentPane.add(lblGrade, "cell 5 0");
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, "cell 1 1");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		contentPane.add(lblNewLabel_1, "cell 3 1");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		contentPane.add(lblNewLabel_2, "cell 5 1");
		
		JLabel lblSemesterOne = new JLabel("Semester One");
		contentPane.add(lblSemesterOne, "cell 1 3 2 1");
		
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
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, "cell 1 5");
		
		JButton btnNewButton_6 = new JButton("New button");
		contentPane.add(btnNewButton_6, "cell 2 5");
		
		JButton btnNewButton_12 = new JButton("New button");
		contentPane.add(btnNewButton_12, "cell 3 5");
		
		JButton btnNewButton_13 = new JButton("New button");
		contentPane.add(btnNewButton_13, "cell 4 5");
		
		JButton btnNewButton_14 = new JButton("New button");
		contentPane.add(btnNewButton_14, "cell 5 5");
		
		JLabel lblPeriod_1 = new JLabel("Period 2");
		contentPane.add(lblPeriod_1, "cell 0 6");
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, "cell 1 6");
		
		JButton btnNewButton_7 = new JButton("New button");
		contentPane.add(btnNewButton_7, "cell 2 6");
		
		JButton btnNewButton_15 = new JButton("New button");
		contentPane.add(btnNewButton_15, "cell 3 6");
		
		JButton btnNewButton_16 = new JButton("New button");
		contentPane.add(btnNewButton_16, "cell 4 6");
		
		JButton btnNewButton_17 = new JButton("New button");
		contentPane.add(btnNewButton_17, "cell 5 6");
		
		JLabel lblPeriod_2 = new JLabel("Period 3");
		contentPane.add(lblPeriod_2, "cell 0 7");
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, "cell 1 7");
		
		JButton btnNewButton_8 = new JButton("New button");
		contentPane.add(btnNewButton_8, "cell 2 7");
		
		JButton btnNewButton_18 = new JButton("New button");
		contentPane.add(btnNewButton_18, "cell 3 7");
		
		JButton btnNewButton_19 = new JButton("New button");
		contentPane.add(btnNewButton_19, "cell 4 7");
		
		JButton btnNewButton_20 = new JButton("New button");
		contentPane.add(btnNewButton_20, "cell 5 7");
		
		JLabel lblPeriod_3 = new JLabel("Period 4");
		contentPane.add(lblPeriod_3, "cell 0 8");
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, "cell 1 8");
		
		JButton btnNewButton_9 = new JButton("New button");
		contentPane.add(btnNewButton_9, "cell 2 8");
		
		JButton btnNewButton_21 = new JButton("New button");
		contentPane.add(btnNewButton_21, "cell 3 8");
		
		JButton btnNewButton_22 = new JButton("New button");
		contentPane.add(btnNewButton_22, "cell 4 8");
		
		JButton btnNewButton_23 = new JButton("New button");
		contentPane.add(btnNewButton_23, "cell 5 8");
		
		JLabel lblPeriod_4 = new JLabel("Period 5");
		contentPane.add(lblPeriod_4, "cell 0 9");
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, "cell 1 9");
		
		JButton btnNewButton_10 = new JButton("New button");
		contentPane.add(btnNewButton_10, "cell 2 9");
		
		JButton btnNewButton_24 = new JButton("New button");
		contentPane.add(btnNewButton_24, "cell 3 9");
		
		JButton btnNewButton_25 = new JButton("New button");
		contentPane.add(btnNewButton_25, "cell 4 9");
		
		JButton btnNewButton_26 = new JButton("New button");
		contentPane.add(btnNewButton_26, "cell 5 9");
		
		JLabel lblAfterSchool = new JLabel("After School");
		contentPane.add(lblAfterSchool, "cell 0 10");
		
		JButton btnNewButton_5 = new JButton("New button");
		contentPane.add(btnNewButton_5, "cell 1 10");
		
		JButton btnNewButton_11 = new JButton("New button");
		contentPane.add(btnNewButton_11, "cell 2 10");
		
		JButton btnNewButton_27 = new JButton("New button");
		contentPane.add(btnNewButton_27, "cell 3 10");
		
		JButton btnNewButton_28 = new JButton("New button");
		contentPane.add(btnNewButton_28, "cell 4 10");
		
		JButton btnNewButton_29 = new JButton("New button");
		contentPane.add(btnNewButton_29, "cell 5 10");
		
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
		
		JButton btnNewButton_30 = new JButton("New button");
		contentPane.add(btnNewButton_30, "cell 1 14");
		
		JButton btnNewButton_31 = new JButton("New button");
		contentPane.add(btnNewButton_31, "cell 2 14");
		
		JButton btnNewButton_32 = new JButton("New button");
		contentPane.add(btnNewButton_32, "cell 3 14");
		
		JButton btnNewButton_33 = new JButton("New button");
		contentPane.add(btnNewButton_33, "cell 4 14");
		
		JButton btnNewButton_34 = new JButton("New button");
		contentPane.add(btnNewButton_34, "cell 5 14");
		
		JLabel label_6 = new JLabel("Period 2");
		contentPane.add(label_6, "cell 0 15");
		
		JButton btnNewButton_35 = new JButton("New button");
		contentPane.add(btnNewButton_35, "cell 1 15");
		
		JButton btnNewButton_36 = new JButton("New button");
		contentPane.add(btnNewButton_36, "cell 2 15");
		
		JButton btnNewButton_37 = new JButton("New button");
		contentPane.add(btnNewButton_37, "cell 3 15");
		
		JButton btnNewButton_38 = new JButton("New button");
		contentPane.add(btnNewButton_38, "cell 4 15");
		
		JButton btnNewButton_39 = new JButton("New button");
		contentPane.add(btnNewButton_39, "cell 5 15");
		
		JLabel label_7 = new JLabel("Period 3");
		contentPane.add(label_7, "cell 0 16");
		
		JButton btnNewButton_40 = new JButton("New button");
		contentPane.add(btnNewButton_40, "cell 1 16");
		
		JButton btnNewButton_41 = new JButton("New button");
		contentPane.add(btnNewButton_41, "cell 2 16");
		
		JButton btnNewButton_42 = new JButton("New button");
		contentPane.add(btnNewButton_42, "cell 3 16");
		
		JButton btnNewButton_43 = new JButton("New button");
		contentPane.add(btnNewButton_43, "cell 4 16");
		
		JButton btnNewButton_44 = new JButton("New button");
		contentPane.add(btnNewButton_44, "cell 5 16");
		
		JLabel label_8 = new JLabel("Period 4");
		contentPane.add(label_8, "cell 0 17");
		
		JButton btnNewButton_45 = new JButton("New button");
		contentPane.add(btnNewButton_45, "cell 1 17");
		
		JButton btnNewButton_46 = new JButton("New button");
		contentPane.add(btnNewButton_46, "cell 2 17");
		
		JButton btnNewButton_47 = new JButton("New button");
		contentPane.add(btnNewButton_47, "cell 3 17");
		
		JButton btnNewButton_48 = new JButton("New button");
		contentPane.add(btnNewButton_48, "cell 4 17");
		
		JButton btnNewButton_49 = new JButton("New button");
		contentPane.add(btnNewButton_49, "cell 5 17");
		
		JLabel label_9 = new JLabel("Period 5");
		contentPane.add(label_9, "cell 0 18");
		
		JButton btnNewButton_50 = new JButton("New button");
		contentPane.add(btnNewButton_50, "cell 1 18");
		
		JButton btnNewButton_51 = new JButton("New button");
		contentPane.add(btnNewButton_51, "cell 2 18");
		
		JButton btnNewButton_52 = new JButton("New button");
		contentPane.add(btnNewButton_52, "cell 3 18");
		
		JButton btnNewButton_53 = new JButton("New button");
		contentPane.add(btnNewButton_53, "cell 4 18");
		
		JButton btnNewButton_54 = new JButton("New button");
		contentPane.add(btnNewButton_54, "cell 5 18");
		
		JLabel lblAfterSchool_1 = new JLabel("After School");
		contentPane.add(lblAfterSchool_1, "cell 0 19");
		
		JButton btnNewButton_55 = new JButton("New button");
		contentPane.add(btnNewButton_55, "cell 1 19");
		
		JButton btnNewButton_56 = new JButton("New button");
		contentPane.add(btnNewButton_56, "cell 2 19");
		
		JButton btnNewButton_57 = new JButton("New button");
		contentPane.add(btnNewButton_57, "cell 3 19");
		
		JButton btnNewButton_58 = new JButton("New button");
		contentPane.add(btnNewButton_58, "cell 4 19");
		
		JButton btnNewButton_59 = new JButton("New button");
		contentPane.add(btnNewButton_59, "cell 5 19");
		
		
	}

}
