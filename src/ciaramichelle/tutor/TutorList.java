//michelle - code
//ciara - gui

package ciaramichelle.tutor;

import java.awt.BorderLayout;
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
import javax.swing.table.DefaultTableModel;

public class TutorList extends JFrame{

	private JPanel contentPane;
	private JTable table;
	/**
	 * Create the frame.
	 */
	public TutorList(ArrayList<SearchByName> stuffOne) {

                  
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (screenSize.width * 0.7), 100,500, 500);
                setLocationRelativeTo(null);
                setTitle("Tutor List");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 0,grow");
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                tableModel stuff = new tableModel(stuffOne);
		table.setModel(stuff);
                table.getColumnModel().getColumn(3).setPreferredWidth(268);
                table.setRowHeight(50);
                table.addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    SpecificTutor st = new SpecificTutor(stuffOne.get(table.getSelectedRow()));
                }});
		scrollPane.setViewportView(table);
                setVisible(true);
	}

    private TutorList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
