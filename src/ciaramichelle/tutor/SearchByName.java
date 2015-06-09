
//ciara
package ciaramichelle.tutor;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ciara
 */
public class SearchByName {
    String firstName;
    String lastName;
    int grade;
    boolean semOnePerOne;
    boolean semOnePerTwo;
    boolean semOnePerThree;
    boolean semOnePerFour;
    boolean semOnePerFive;
    boolean semOneMonday;
    boolean semOneTuesday;
    boolean semOneWednesday;
    boolean semOneThursday;
    boolean semOneFriday;
    boolean semTwoPerOne;
    boolean semTwoPerTwo;
    boolean semTwoPerThree;
    boolean semTwoPerFour;
    boolean semTwoPerFive;
    boolean semTwoMonday;
    boolean semTwoTuesday;
    boolean semTwoWednesday;
    boolean semTwoThursday;
    boolean semTwoFriday;
    boolean greadeNineMath;
    boolean greadeNineEnglish;
    boolean greadeNineScience;
    boolean greadeNineGeography;
    boolean greadeNineFrench;
    boolean greadeNineFIFrench;
    boolean greadeNineFIScience;
    boolean greadeNineFIGeography;
    boolean greadeTenMath;
    boolean greadeTenEnglish;
    boolean greadeTenScience;
    boolean greadeTenHistory;
    boolean greadeTenFrench;
    boolean greadeTenFIFrench;
    boolean greadeTenFIScience;
    boolean greadeTenFIHistory;
    boolean greadeElevenMath;
    boolean greadeElevenEnglish;
    boolean greadeElevenBiology;
    boolean greadeElevenChemistry;
    boolean greadeElevenPhysics;
    boolean greadeElevenFrench;
    boolean greadeElevenFIFrench;
    boolean greadeElevenPreAPBiology;
    boolean greadeElevenPreAPMath;

    public SearchByName(String firstName, String lastName, int grade, boolean semOnePerOne, boolean semOnePerTwo, boolean semOnePerThree, boolean semOnePerFour, boolean semOnePerFive, boolean semOneMonday, boolean semOneTuesday, boolean semOneWednesday, boolean semOneThursday, boolean semOneFriday, boolean semTwoPerOne, boolean semTwoPerTwo, boolean semTwoPerThree, boolean semTwoPerFour, boolean semTwoPerFive, boolean semTwoMonday, boolean semTwoTuesday, boolean semTwoWednesday, boolean semTwoThursday, boolean semTwoFriday, boolean greadeNineMath, boolean greadeNineEnglish, boolean greadeNineScience, boolean greadeNineGeography, boolean greadeNineFrench, boolean greadeNineFIFrench, boolean greadeNineFIScience, boolean greadeNineFIGeography, boolean greadeTenMath, boolean greadeTenEnglish, boolean greadeTenScience, boolean greadeTenHistory, boolean greadeTenFrench, boolean greadeTenFIFrench, boolean greadeTenFIScience, boolean greadeTenFIHistory, boolean greadeElevenMath, boolean greadeElevenEnglish, boolean greadeElevenBiology, boolean greadeElevenChemistry, boolean greadeElevenPhysics, boolean greadeElevenFrench, boolean greadeElevenFIFrench, boolean greadeElevenPreAPBiology, boolean greadeElevenPreAPMath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.semOnePerOne = semOnePerOne;
        this.semOnePerTwo = semOnePerTwo;
        this.semOnePerThree = semOnePerThree;
        this.semOnePerFour = semOnePerFour;
        this.semOnePerFive = semOnePerFive;
        this.semOneMonday = semOneMonday;
        this.semOneTuesday = semOneTuesday;
        this.semOneWednesday = semOneWednesday;
        this.semOneThursday = semOneThursday;
        this.semOneFriday = semOneFriday;
        this.semTwoPerOne = semTwoPerOne;
        this.semTwoPerTwo = semTwoPerTwo;
        this.semTwoPerThree = semTwoPerThree;
        this.semTwoPerFour = semTwoPerFour;
        this.semTwoPerFive = semTwoPerFive;
        this.semTwoMonday = semTwoMonday;
        this.semTwoTuesday = semTwoTuesday;
        this.semTwoWednesday = semTwoWednesday;
        this.semTwoThursday = semTwoThursday;
        this.semTwoFriday = semTwoFriday;
        this.greadeNineMath = greadeNineMath;
        this.greadeNineEnglish = greadeNineEnglish;
        this.greadeNineScience = greadeNineScience;
        this.greadeNineGeography = greadeNineGeography;
        this.greadeNineFrench = greadeNineFrench;
        this.greadeNineFIFrench = greadeNineFIFrench;
        this.greadeNineFIScience = greadeNineFIScience;
        this.greadeNineFIGeography = greadeNineFIGeography;
        this.greadeTenMath = greadeTenMath;
        this.greadeTenEnglish = greadeTenEnglish;
        this.greadeTenScience = greadeTenScience;
        this.greadeTenHistory = greadeTenHistory;
        this.greadeTenFrench = greadeTenFrench;
        this.greadeTenFIFrench = greadeTenFIFrench;
        this.greadeTenFIScience = greadeTenFIScience;
        this.greadeTenFIHistory = greadeTenFIHistory;
        this.greadeElevenMath = greadeElevenMath;
        this.greadeElevenEnglish = greadeElevenEnglish;
        this.greadeElevenBiology = greadeElevenBiology;
        this.greadeElevenChemistry = greadeElevenChemistry;
        this.greadeElevenPhysics = greadeElevenPhysics;
        this.greadeElevenFrench = greadeElevenFrench;
        this.greadeElevenFIFrench = greadeElevenFIFrench;
        this.greadeElevenPreAPBiology = greadeElevenPreAPBiology;
        this.greadeElevenPreAPMath = greadeElevenPreAPMath;
    }
    
    
    

    
    
    public SearchByName searchByName(String file, String firstName, String lastName) throws FileNotFoundException, IOException{
        DataInputStream into = new DataInputStream(new FileInputStream("employee.dat"));
                while (true) {
                    try {
                        if (into.readUTF().equalsIgnoreCase(firstName) && into.readUTF().equalsIgnoreCase(lastName)) {
                            SearchByName person = new SearchByName(firstName, lastName, into.readInt(), into.readBoolean(), into.readBoolean(), 
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), 
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), 
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), 
                                    into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), 
                                    into.readBoolean(), into.readBoolean(), into.readBoolean());
                            into.close();
                            return person;
                            
                        } else {
                            into.skipBytes(83);
                        }
                    } catch (EOFException e) {
                        System.out.println("sorry the name you are looking for does not exist");
                        into.close();
                        return null;
                    }
                    catch (FileNotFoundException j){
                        System.out.println("sorry the file you are looking for does not exist");
                        return null;
                    }
                    catch (IOException k){
                        System.out.println("sorry there was an IO error, please try again");
                        return null;
                    }

                }
    }
}
    
    

