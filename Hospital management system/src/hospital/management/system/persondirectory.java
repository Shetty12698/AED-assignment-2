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
public class persondirectory {
    ArrayList<person> personlist;
    
    public persondirectory(ArrayList<person> personlist) {
        this.personlist = personlist;
    }

    public ArrayList<person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<person> personlist) {
        this.personlist = personlist;
    }
    
    public void addnewperson(person persons) {
        personlist.add(persons);
    }
    
    
    
}
