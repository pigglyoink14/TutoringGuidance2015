//code - michelle
//gui - ciara
package ciaramichelle.tutor;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
/**
 * Class that deletes tutors within a binary file
 * @author Michelle
 */
public class deleteTutor extends JFrame implements ActionListener {
    //records are 143 bytes
    private JPanel contentPane;
    private GridBagLayout baglayout = new GridBagLayout();
    private JLabel firstName, lastName;
    private JTextField fnField, lnField;
    private JButton delButton, backButton;
    
    /**
     * Create the frame.
     */
    public deleteTutor() {

        //frame settings
        setTitle("Delete Tutors");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        //limit to 15 chars user can input
        fnField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
            }

            public void removeUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
            }

            public void insertUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
            }
        });
        ((AbstractDocument) fnField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                int currentLength = fb.getDocument().getLength();
                int overLimit = (currentLength + text.length()) - 15 - length; //15 is limit
                if (overLimit > 0) {
                    text = text.substring(0, text.length() - overLimit);
                }
                if (text.length() > 0) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        }
        );
        contentPane.add(fnField, gbc);

        //last name
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
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
        //limit to 15 chars
        lnField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
                System.out.println(lnField.getDocument().getLength());
                if (lnField.getDocument().getLength() > 15) {
                    lnField.setText(lnField.getText().substring(0, lnField.getDocument().getLength() - 1));
                }
            }

            public void removeUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
            }

            public void insertUpdate(DocumentEvent e) {
                textfieldEditor(lnField);
            }
        });
        ((AbstractDocument) lnField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                int currentLength = fb.getDocument().getLength();
                int overLimit = (currentLength + text.length()) - 15 - length; //15 is limit
                if (overLimit > 0) {
                    text = text.substring(0, text.length() - overLimit);
                }
                if (text.length() > 0) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        }
        );
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
            //get full search string to compare deletion with file
            String searchString1 = String.format("%-15s", fnField.getText().substring(0, Math.min(fnField.getText().length(), 15))) + String.format("%-15s", lnField.getText().substring(0, Math.min(lnField.getText().length(), 15)));;
            try {
             //raf the file
             RandomAccessFile raf = new RandomAccessFile("binary.dat", "rw");
             //insert linear search to delete
             int tempPointer;
             int originLength = (int) (raf.length());
             for(int i = 0; raf.getFilePointer()+143 < raf.length(); i++){
                 if(i == 0)
                     raf.seek(4);
                 else
                    raf.skipBytes(109);
                 String tempName = raf.readUTF() + raf.readUTF();
                 if(tempName.equalsIgnoreCase(searchString1)){
                     tempPointer = (int) (raf.getFilePointer() + 109);
                     raf.seek(tempPointer);
                    //store records over the record to be deleted into bytes array
                    byte[] temp = new byte[(int) (raf.length() - tempPointer)];
                    raf.readFully(temp);
                    //remove the record
                    raf.setLength(tempPointer - 143);
                    raf.seek(raf.length());
                    raf.write(temp); 
                    break;
                 }
             }
             //display appropriate message if a person was deleted, or no one of that name was found
             if(originLength == raf.length()){
                 JOptionPane.showMessageDialog(null, "No one of that name was found.");
             }else
                 JOptionPane.showMessageDialog(null, fnField.getText() + " " + lnField.getText() + " was successfully deleted.");
             //close raf
             raf.close();
             } catch (IOException ex) {
             ex.printStackTrace();
             }
        //user wants to go back    
        } else if (e.getActionCommand().equals("back")) {
            //dispose of this window
            dispose();
            
        }
    }

    public void textfieldEditor(JTextField j) {
        //check if fields are filled and enable/disable the delete button accordingly
        if ((lnField.getText() != null && !lnField.getText().equals("")) && (fnField.getText() != null && !fnField.getText().equals(""))) {
            delButton.setEnabled(true);
        } else if (delButton.isEnabled()) {
            delButton.setEnabled(false);
        }
    }

}
