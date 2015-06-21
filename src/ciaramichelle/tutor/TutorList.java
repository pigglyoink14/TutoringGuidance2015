//michelle - code
//ciara - gui
package ciaramichelle.tutor;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TutorList extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Create the frame.
     *
     * @param filteredList list of people that pertain to the boxes checked in
     * findTutor class
     */
    public TutorList(ArrayList<SearchByName> filteredList) {
        //set frame properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (screenSize.width * 0.7), 100, 500, 500);
        setLocationRelativeTo(null);
        setTitle("Tutor List");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
        
        //set table properties and table
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, "cell 0 0,grow");

        table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableModel stuff = new tableModel(filteredList);
        table.setModel(stuff);
        table.getColumnModel().getColumn(3).setPreferredWidth(268);
        table.setRowHeight(50);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SpecificTutor st = new SpecificTutor(filteredList.get(table.getSelectedRow()));
            }
        });
        scrollPane.setViewportView(table);
        setVisible(true);
    }
}
