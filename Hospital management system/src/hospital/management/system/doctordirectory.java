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

    public class DoctorDirectory {
    
    public static ArrayList<Doctor> doctorrecords = new ArrayList<Doctor>();
   

public static Doctor doctor1(){
        
        return new Doctor("Vipul", 28, 87907, "doctor@gmail.com","M", "NewYork", "25", "Northeastern", 02215, "Boston", "Boston", "Vipul_R", 022155, "Northeastern Hospital", "MBBS","Paedetrician", 9);
        
    }

    public static ArrayList<Doctor> getDoctorrecords() {
        return doctorrecords;
    }

    public static void setDoctorList(ArrayList<Doctor> doctorList) {
        DoctorDirectory.doctorrecords = doctorList;
    }

    public Doctor addNewDoctor(){
        
        Doctor newDr = new Doctor();
        //System.out.println("hereeeeeeeeee");
        //System.out.println(newEmployee);
        doctorrecords.add(newDr);
        return newDr;
    }
    
    public void deleteDoctor(Doctor d){
        doctorrecords.remove(d);
    }
    
    public boolean checkDID(int dID){
        int flag = 0;
        for(Doctor d: doctorrecords){
            if(d.getDoctorID() == dID)
                flag = 1;
            else
                flag = 0;
        }
        if(flag>0)
            return true;
        else
            return false;
    } 
}
    

