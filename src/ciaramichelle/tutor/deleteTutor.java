//code - michelle
//gui - ciara
package ciaramichelle.tutor;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class deleteTutor extends JFrame implements ActionListener {

    private JPanel contentPane;
    private GridBagLayout baglayout = new GridBagLayout();
    private JLabel firstName, lastName; 
    private JTextField fnField, lnField;
    private JButton delButton, backButton;
    
    private String searchString;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    deleteTutor frame = new deleteTutor();
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
    public deleteTutor() {

        //frame settings
        setTitle("Delete Tutors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(baglayout);

        GridBagConstraints gbc = new GridBagConstraints();

        //first name
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 0;
        //gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(getHeight() / 16, 0, 0, 0);
        firstName = new JLabel("First Name:");
        contentPane.add(firstName, gbc);

        //first name text field settings
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.ipady = 10;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        fnField = new JTextField();
        fnField.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
            public void removeUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
            public void insertUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
        });
        contentPane.add(fnField, gbc);
        
        //last name
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        //gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(getHeight() / 16, 0, 0, 0);
        lastName = new JLabel("Last Name:");
        contentPane.add(lastName, gbc);

        //last name text field settings
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.ipady = 10;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lnField = new JTextField();
        lnField.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
            public void removeUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
            public void insertUpdate(DocumentEvent e){
                textfieldEditor(lnField);
            }
        });
        contentPane.add(lnField, gbc);
        
        //delete button settings
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.ipady = getHeight() / 12;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        delButton = new JButton("Delete");
        delButton.setEnabled(false);
        delButton.setActionCommand("delete");
        delButton.addActionListener(this);
        contentPane.add(delButton, gbc);

        //back button settings
        gbc.gridx = 3;
        backButton = new JButton("Back");
        backButton.setActionCommand("back");
        backButton.addActionListener(this);
        contentPane.add(backButton, gbc);

        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("delete")) {
            //use last name to search for first
            searchString = lnField.getText().trim();
            try {
                //raf the file
                RandomAccessFile raf = new RandomAccessFile("binary.dat", "rw");
                //insert binary searching here - get index
                //remove 152 bytes of data
                raf.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("back")) {
            System.out.println("Go Back");
        }
    }
    
    public void textfieldEditor(JTextField j){
        //check if fields are filled and enable/disable the delete button accordingly
            if((lnField.getText() != null && !lnField.getText().equals("")) && (fnField.getText() != null && !fnField.getText().equals("")))
                delButton.setEnabled(true);
            else
                if(delButton.isEnabled())
                    delButton.setEnabled(false);
            //limit characters to type
    }

}
