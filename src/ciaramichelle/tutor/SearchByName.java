//ciara
package ciaramichelle.tutor;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Objects;

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
    boolean[] availiability = new boolean[60];
    String subjects = "";

    public SearchByName(String firstName, String lastName, int grade, boolean semOnePerOne, boolean semOnePerTwo, boolean semOnePerThree, boolean semOnePerFour, boolean semOnePerFive, boolean semOneMonday, boolean semOneTuesday, boolean semOneWednesday, boolean semOneThursday, boolean semOneFriday, boolean semTwoPerOne, boolean semTwoPerTwo, boolean semTwoPerThree, boolean semTwoPerFour, boolean semTwoPerFive, boolean semTwoMonday, boolean semTwoTuesday, boolean semTwoWednesday, boolean semTwoThursday, boolean semTwoFriday, boolean greadeNineMath, boolean greadeNineEnglish, boolean greadeNineScience, boolean greadeNineGeography, boolean greadeNineFrench, boolean greadeNineFIFrench, boolean greadeNineFIScience, boolean greadeNineFIGeography, boolean greadeTenMath, boolean greadeTenEnglish, boolean greadeTenScience, boolean greadeTenHistory, boolean greadeTenFrench, boolean greadeTenFIFrench, boolean greadeTenFIScience, boolean greadeTenFIHistory, boolean greadeElevenMath, boolean greadeElevenEnglish, boolean greadeElevenBiology, boolean greadeElevenChemistry, boolean greadeElevenPhysics, boolean greadeElevenFrench, boolean greadeElevenFIFrench, boolean greadeElevenPreAPBiology, boolean greadeElevenPreAPMath, boolean[] avab) {
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
        this.availiability = avab;
        
        //set subject string to match what subjects tutors teach
        if(greadeNineMath)
            subjects += "9 Math, ";
        if(greadeNineEnglish)
            subjects += "9 English, ";
        if(greadeNineScience)
            subjects += "9 Science, ";
        if(greadeNineGeography)
            subjects += "Geography, ";
        if(greadeNineFrench)
            subjects += "9 French, ";
        if(greadeNineFIFrench)
            subjects += "9 FI French, ";
        if(greadeNineFIScience)
            subjects += "9 FI Science, ";
        if(greadeNineFIGeography)
            subjects += "FI Geography, ";
        if(greadeTenMath)
            subjects += "10 Math, ";
        if(greadeTenEnglish)
            subjects += "10 English, ";
        if(greadeTenScience)
            subjects += "10 Science, ";
        if(greadeTenHistory)
            subjects += "History, ";
        if(greadeTenFrench)
            subjects += "10 French, ";
        if(greadeTenFIFrench)
            subjects += "10 FI French, ";
        if(greadeTenFIScience)
            subjects += "10 FI Science, ";
        if(greadeTenFIHistory)
            subjects += "FI History, ";
        if(greadeElevenMath)
            subjects += "11 Math, ";
        if(greadeElevenEnglish)
            subjects += "11 English, ";
        if(greadeElevenBiology)
            subjects += "11 Biology, ";
        if(greadeElevenChemistry)
            subjects += "11 Chemistry, ";
        if(greadeElevenPhysics)
            subjects += "11 Physics, ";
        if(greadeElevenFrench)
            subjects += "11 French, ";
        if(greadeElevenFIFrench)
            subjects += "11 FI French, ";
        if(greadeElevenPreAPBiology)
            subjects += "11 Pre-AP Bio, ";
        if(greadeElevenPreAPMath)
            subjects += "11 Pre-AP Math, ";
        subjects = subjects.substring(0, subjects.length() - 2);
    }

    public static SearchByName searchByName(String file, String firstName, String lastName) throws FileNotFoundException, IOException {
        DataInputStream into = new DataInputStream(new FileInputStream("binary.dat"));
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
                            into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            new boolean[]{into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean()});
                    into.close();
                    return person;

                } else {
                    into.skipBytes(109);
                }
            } catch (EOFException e) {
                System.out.println("sorry the name you are looking for does not exist");
                into.close();
                return null;
            } catch (FileNotFoundException j) {
                System.out.println("sorry the file you are looking for does not exist");
                return null;
            } catch (IOException k) {
                System.out.println("sorry there was an IO error, please try again");
                return null;
            }

        }
    }

    public static ArrayList<SearchByName> searchBySubject(String file, int position) throws FileNotFoundException, IOException {

        RandomAccessFile into = new RandomAccessFile("binary.dat", "rw");
        into.seek(position + 4);
        ArrayList<SearchByName> persons = new ArrayList<>();
        while (into.getFilePointer() + 143 - position <= into.length()) {
            try {
                if (into.readBoolean() == true) {
                    into.seek(into.getFilePointer() - 1 - position);
                    
                    SearchByName person = new SearchByName(into.readUTF(), into.readUTF(), into.readInt(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            into.readBoolean(), into.readBoolean(), into.readBoolean(),
                            new boolean[]{into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(),
                                into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean(), into.readBoolean()});
                    persons.add(person);
                    into.skipBytes(position);

                } else {
                    into.skipBytes(142);
                }

            } catch (EOFException e) {
                System.out.println("sorry the name you are looking for does not exist");
                into.close();
                return null;
            } catch (FileNotFoundException j) {
                System.out.println("sorry the file you are looking for does not exist");
                return null;
            } catch (IOException k) {
                System.out.println("sorry there was an IO error, please try again");
                return null;
            }

        }
        return persons;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.firstName);
        hash = 43 * hash + Objects.hashCode(this.lastName);
        hash = 43 * hash + this.grade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SearchByName other = (SearchByName) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (this.grade != other.grade) {
            return false;
        }
        return true;
    }

}
