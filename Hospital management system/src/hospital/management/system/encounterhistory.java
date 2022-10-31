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
    
    public static ArrayList<Encounter> encounterHist = new ArrayList<Encounter>();
    
    public EncounterHistory(){
        this.encounterHist = new ArrayList<Encounter>();
    }    

    public static ArrayList<Encounter> getEncounterHist() {
        return encounterHist;
    }

    public static void setEncounterHist(ArrayList<Encounter> encounterList) {
        EncounterHistory.encounterHist = encounterList;
    }

    

    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterHist.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter e){
        encounterHist.remove(e);
    } 
    
    public Encounter addNewEncounter(int encounterID, Date encounterDate,LocalTime encounterTime, int patientId, int doctorId, String encDiagnosis, String symptoms){
        Encounter enc = new Encounter();
        encounterHist.add(enc);
        return enc;
        
    }
    public Encounter addNewEncounter(int encounterID, Date encounterDate, LocalTime encounterTime,  int patientId, int doctorID){
        Encounter enc = new Encounter( encounterID,  encounterDate,  encounterTime,   patientId, doctorID);
        encounterHist.add(enc);
        return enc;
    }
    
}
    
