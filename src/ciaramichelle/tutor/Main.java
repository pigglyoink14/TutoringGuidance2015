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
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends JFrame {

    private JPanel contentPane;

    //ciara
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("binary.dat", "rw");
        int year = raf.readInt();
        String oldstring = year + "-09-01";
        Date dateNew = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring);
        Date date = new Date();
        if (date.after(dateNew)) {
            year++;
            raf.seek(0);
            raf.writeInt(year);
            while (true) {
                try {
                    raf.skipBytes(34);
                    int grade = raf.readInt();
                    if (grade == 12) {
                        long tutorPos = raf.getFilePointer() - 38;
                        byte[] lastTutor = new byte[153];
                        raf.seek(raf.length() - 153);
                        raf.readFully(lastTutor);
                        raf.seek(tutorPos);
                        raf.write(lastTutor);
                        raf.setLength(raf.length() - 153);
                        raf.seek(tutorPos);

                    } else if (grade == 11) {
                        raf.seek(raf.getFilePointer() - 4);
                        raf.writeInt(12);
                        raf.seek(raf.getFilePointer() + 115);

                    }

                } catch (EOFException e) {
                    raf.close();
                    break;
                }

            }

        } else {
            raf.close();
        }
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
            }
        });
        contentPane.add(btnNewButton, "cell 1 3");

        JButton btnNewButton_1 = new JButton("Find Tutor");
        contentPane.add(btnNewButton_1, "cell 3 3");

        JButton btnNewButton_2 = new JButton("Delete Tutor");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                deleteTutor dt = new deleteTutor();
            }
        });
        contentPane.add(btnNewButton_2, "cell 5 3");
    }
}

	
