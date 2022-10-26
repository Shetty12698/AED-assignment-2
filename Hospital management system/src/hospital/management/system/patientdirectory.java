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
public class patientdirectory {
    private ArrayList<patient> patientList;
    
    
    public patientdirectory(ArrayList<patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addnewPatient(patient patient) {
        patientList.add(patient);
    }
    
}
    

