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
public class BuildingSystem  extends Thing{
    ArrayList<Building> buildingList = new ArrayList<>();
    
    public BuildingSystem(ArrayList<Building> builingList)
    {
        this.buildingList = buildingList;
    }
    
    public void addBuilding(Building building)
    {
        buildingList.add(building);
    }
    
    public void removeBuilding(Building building)
    {
        buildingList.remove(building);
    }
    
    public void printBuiling()
    {
        System.out.println("Buildings: \n");
        listToString(buildingList);
    }
    
}
