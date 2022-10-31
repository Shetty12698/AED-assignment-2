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
public class State {
     public static String stateName = "Massachusetts";
    public static ArrayList<City> cityDir = new ArrayList<>();

    public static String getStateName() {
        return stateName;
    }

    public static void setStateName(String stateName) {
        State.stateName = stateName;
    }

    public static ArrayList<City> getCityDir() {
        return cityDir;
    }

    public static void setCityDir(ArrayList<City> cityDir) {
        State.cityDir = cityDir;
    }
}
