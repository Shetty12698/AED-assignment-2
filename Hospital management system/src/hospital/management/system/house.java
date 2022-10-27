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
public class house {
    private String housename;
    private ArrayList<person> persons;
    
    
    public house(String housename, ArrayList<person> persons) {
        this.housename = housename;
        this.persons = persons;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public ArrayList<person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<person> persons) {
        this.persons = persons;
    }
    
    

    
}
