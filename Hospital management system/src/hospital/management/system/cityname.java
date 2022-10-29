/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author SHREYAS
 */
public class cityname {
    
    select item austin,seattle,boston;
    
    public static List<String> getCitiesList(){
       
        return Stream.of(cityname.values()).map(cityname::name).collect(Collectors.toList());
    }
    
    public static String[] getCitiesArray() {
        
        return Arrays.stream(cityname.values()).map(cityname::name).toArray(String[]::new);
    }

}
    

