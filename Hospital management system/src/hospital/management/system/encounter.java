/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */
public class encounter {
    private vitalsigns vitalsigns;
    
    public encounter(vitalsigns vitalsigns) {
        this.vitalsigns = vitalsigns;
        
    }

    public vitalsigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(vitalsigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }
    
    
}
