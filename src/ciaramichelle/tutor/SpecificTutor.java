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
		
		
		JButton[] buttons = new JButton[30];
		int counter = 0;
		for(int i = 5; i < 11; i++){
			for(int j = 1; j <6; j++){
				buttons[counter] = new JButton("");
				contentPane.add(buttons[counter], "cell " + j + " " + i);
				counter ++;
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
		for(int i = 14; i < 20; i++){
			for(int j = 1; j <6; j++){
				buttonsTwo[counterTwo] = new JButton("");
				contentPane.add(buttonsTwo[counterTwo], "cell " + j + " " + i);
				counterTwo ++;
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
		
		
	}

}
