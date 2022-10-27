/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHREYAS
 */
public class system {
    private patientdirectory Patientdirectory;
    private persondirectory Persondirectory;
    private ArrayList<city> cities;
    
    public system(patientdirectory Patientdirectory, persondirectory Persondirectory, ArrayList<city> cities) {
        this.Patientdirectory = Patientdirectory;
        this.Persondirectory = Persondirectory;
        this.cities = cities;
        
    }

    public patientdirectory getPatientdirectory() {
        return Patientdirectory;
    }

    public void setPatientdirectory(patientdirectory Patientdirectory) {
        this.Patientdirectory = Patientdirectory;
    }

    public persondirectory getPersondirecory() {
        return Persondirectory;
    }

    public void setPersondirecory(persondirectory Persondirecory) {
        this.Persondirectory = Persondirecory;
    }

    public ArrayList<city> getCities() {
        return cities;
    }

    public void setCities(ArrayList<city> cities) {
        this.cities = cities;
    }
    
    
    
    
}
