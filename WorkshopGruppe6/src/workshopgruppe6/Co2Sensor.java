package workshopgruppe6;

/**
 *
 * @author Nicos
 */
public class Co2Sensor extends Sensor {

    public Co2Sensor(String name, int value) {
        super(name, value);
    }
    
    public String toString(){
        return "Type: Co2 Sensor. Name: " + getName() + ". Value: " + super.getValue();
    }
}
