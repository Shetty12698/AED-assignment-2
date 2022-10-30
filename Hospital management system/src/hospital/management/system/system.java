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
    private PatientDirectory Patientdirectory;
    private PersonDirectory Persondirectory;
    private ArrayList<City> cities;
    
    public system(PatientDirectory Patientdirectory, PersonDirectory Persondirectory, ArrayList<City> cities) {
        this.Patientdirectory = Patientdirectory;
        this.Persondirectory = Persondirectory;
        this.cities = cities;
        
    }

    public PatientDirectory getPatientdirectory() {
        return Patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory Patientdirectory) {
        this.Patientdirectory = Patientdirectory;
    }

    public PersonDirectory getPersondirecory() {
        return Persondirectory;
    }

    public void setPersondirecory(PersonDirectory Persondirecory) {
        this.Persondirectory = Persondirecory;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    
    
    
    
}
