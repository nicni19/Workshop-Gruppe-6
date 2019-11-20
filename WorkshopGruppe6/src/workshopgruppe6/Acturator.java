/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopgruppe6;

/**
 *
 * @author tes_7
 */
public abstract class Acturator extends Thing {
    private int value;
    
    public Acturator(String name,int value)
    {
        setName(name);
        this.value = value;
    }
    
    
    public void setName(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    @Override
    public String toString()
    {
        return getName() + getValue();
    }
    
}
