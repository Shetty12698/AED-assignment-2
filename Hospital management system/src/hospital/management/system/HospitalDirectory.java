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
public class HospitalDirectory {
    
    public static ArrayList<Hospital> hospitalDir = new ArrayList<Hospital>();
    


    public static ArrayList<Hospital> getHospitalDir() {
        return hospitalDir;
    }

    public static void setHospitalDir(ArrayList<Hospital> hospitalList) {
        HospitalDirectory.hospitalDir = hospitalDir;
    }

    
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospitalDir.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital h){
        hospitalDir.remove(h);
    }
    
    
}
