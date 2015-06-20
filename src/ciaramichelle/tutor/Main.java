package ciaramichelle.tutor;

import com.bric.plaf.BevelButtonUI;
import com.bric.plaf.ButtonFill;
import com.bric.plaf.ButtonShape;
import com.bric.plaf.CapsuleButtonUI;
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
import com.bric.plaf.FilledButtonUI;
import com.bric.plaf.ShimmerPaintUIEffect;
import java.awt.geom.Rectangle2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class Main extends JFrame {

    private JPanel contentPane;

    //ciara
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("binary.dat", "rw");
        //michelle - if file has no tutors in it + made year up to date
        if (raf.length() > 90) {
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
        //setBounds(100, 100, 450, 300);
        setTitle("Tutor Program");
        setBounds(100, 100, 674, 368);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[grow][grow][grow]", "[113.00][60.00]"));

        JButton btnNewButton = new JButton("Add Tutor");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                addTutor at = new addTutor();
            }
        });
        contentPane.add(btnNewButton, "cell 0 1, grow");

        JButton btnNewButton_1 = new JButton("Find Tutor");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                findTutor ft = new findTutor();
            }
        });
        contentPane.add(btnNewButton_1, "cell 1 1, grow");

        JButton btnNewButton_2 = new JButton("Delete Tutor");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                deleteTutor dt = new deleteTutor();
            }
        });
        contentPane.add(btnNewButton_2, "cell 2 1, grow");
        BevelButtonUI duke = new BevelButtonUI();
        btnNewButton_1.setUI(duke);
        btnNewButton_2.setUI(duke);
        btnNewButton.setUI(duke);
        //btnNewButton_2.putClientProperty(FilledButtonUI.SHAPE, new Rectangle2D.Float(0,0,40, 80));
        btnNewButton_1.putClientProperty(FilledButtonUI.SHAPE, new Ellipse2D.Float(0, 0, 40, 40));
        btnNewButton_2.putClientProperty(FilledButtonUI.SHAPE, new Ellipse2D.Float(0, 0, 40, 40));
        btnNewButton.putClientProperty(FilledButtonUI.SHAPE, new Ellipse2D.Float(0, 0, 40, 40));
        btnNewButton.addMouseListener(ShimmerPaintUIEffect.mouseListener);
        btnNewButton_1.addMouseListener(ShimmerPaintUIEffect.mouseListener);
        btnNewButton_2.addMouseListener(ShimmerPaintUIEffect.mouseListener);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).requestFocusInWindow();
            }
        });
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).requestFocusInWindow();
            }
        });
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).requestFocusInWindow();
            }
        });
    }
}
