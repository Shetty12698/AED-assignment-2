/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;
import java.util.ArrayList;

/**
 *
 * @author SHREYAS
 */
public class PersonDirectory {
    public static ArrayList<Person>personDir = new ArrayList<Person>();

    public static ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public static void setPersonDir(ArrayList<Person> personDir) {
        PersonDirectory.personDir = personDir;
    }

    
    
    
}
