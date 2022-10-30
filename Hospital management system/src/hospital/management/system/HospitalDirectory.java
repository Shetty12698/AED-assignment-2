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
    
    public static ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
    
//    public HospitalDirectory(){
//        this.hospitalList = new ArrayList<Hospital>();
//    }

    public static ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public static void setHospitalList(ArrayList<Hospital> hospitalList) {
        HospitalDirectory.hospitalList = hospitalList;
    }

    
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital h){
        hospitalList.remove(h);
    }
    
    
}
