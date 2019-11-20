package workshopgruppe6;

/**
 *
 * @author Nicos
 */
public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String name, int value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "Type: Temp Sensor. Name: " + getName() + ". Value: " + getValue();
    }

}
