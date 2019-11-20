/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopgruppe6;

import java.util.ArrayList;

/**
 *
 * @author tes_7
 */
public class Building extends Thing {
    
    ArrayList<Sensor> sensorList = new ArrayList<>();
    ArrayList<Acturator> acturatorList = new ArrayList<>();
    
    public Building(String name, ArrayList<Sensor> sensorList, ArrayList<Acturator> actuatorList)
    {
        setName(name);
        this.sensorList = sensorList;
        this.acturatorList = actuatorList;
    }
    
    public String toString()
    {
        return getName();
    }
    
    public void addSensor(Sensor sensor)
    {
        sensorList.add(sensor);
    }
    
    public void removeSensor(Sensor sensor)
    {
        sensorList.remove(sensor);
    }
    
    public void addAcurator(Acturator acurator)
    {
        acturatorList.add(acurator);
    }
    
    public void removeActurator(Acturator acturator)
    {
        acturatorList.remove(acturator);
    }
    
    
    public void printActurator()
    {
        System.out.println("Acturators: \n");
        super.listToString(acturatorList);
                
    }
    
    public void printSensor()
    {
        System.out.println("Sensors: \n");
        listToString(sensorList);
    }
    
}
