/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciaramichelle.tutor;


import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;


@SuppressWarnings("serial")
public class tableModel extends AbstractTableModel {

    public ArrayList<SearchByName> records;

    public tableModel(ArrayList<SearchByName> people){
        records = people;
    }
    

    @Override
    /**
     * sets the column titles
     */
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "First Name";
            case 1:
                return "Last Name";
            case 2:
                return "Grade";
            case 3:
                return "Subject";
            
            default:
                break;
        }
        return null;

    }

    @Override
    /**
     * gets the number of columns
     */
    public int getColumnCount() {

        return 4;
    }

    @Override
    //gets the number of rows
    public int getRowCount() {
        return records.size();
    }

    @Override
    /**
     * gets the value at a given cell in order to display it
     */
    public Object getValueAt(int row, int column) {
        SearchByName CurrentRecord = records.get(row);
        switch (column) {
            case 0:
                return CurrentRecord.firstName;
            case 1:
                return CurrentRecord.lastName;
            case 2:
                return CurrentRecord.grade;
            case 3:
                return CurrentRecord.subjects;

            default:
                break;
        }
        return null;
    }

    
}
