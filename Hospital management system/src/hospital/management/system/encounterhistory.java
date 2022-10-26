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
public class encounterhistory {
    private ArrayList<encounter> encounters;
    
    public encounterhistory(ArrayList<encounter> encounters){
        this.encounters = encounters;
    }

    public ArrayList<encounter> getEncounters() {
        return encounters;
    }

    public ArrayList<encounter> getencounterhistory() {
        return encounters;
    
    }
    public void setencounterhistory(ArrayList<encounter> encounterhistory) {
        this.encounters = encounterhistory;
        
    }
}
    
    
