/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SHREYAS
 */
public class EncounterHistory {
    
    public static ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
    
    public EncounterHistory(){
        this.encounterList = new ArrayList<Encounter>();
    }    

    public static ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public static void setEncounterList(ArrayList<Encounter> encounterList) {
        EncounterHistory.encounterList = encounterList;
    }

    

    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter e){
        encounterList.remove(e);
    } 
    
    public Encounter addNewEncounter(int encounterID, Date encounterDate,LocalTime encounterTime, int patientId, int doctorId, String encDiagnosis, String symptoms){
        Encounter enc = new Encounter();
        encounterList.add(enc);
        return enc;
        
    }
    
}
    
