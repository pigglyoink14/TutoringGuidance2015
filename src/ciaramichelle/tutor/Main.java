package ciaramichelle.tutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	//ciara
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][]", "[][][][]"));
		
		JButton btnNewButton = new JButton("Add Tutor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            addTutor at = new addTutor();
			}
		});
		contentPane.add(btnNewButton, "cell 1 3");
		
		JButton btnNewButton_1 = new JButton("Find Tutor");
                btnNewButton_1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                        findTutor ft = new findTutor();
                    }
                });
		contentPane.add(btnNewButton_1, "cell 3 3");
		
		JButton btnNewButton_2 = new JButton("Delete Tutor");
                btnNewButton_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0){
                            deleteTutor dt = new deleteTutor();
                        }
                });
		contentPane.add(btnNewButton_2, "cell 5 3");
	}

}
