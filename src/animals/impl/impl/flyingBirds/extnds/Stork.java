package animals.impl.impl.flyingBirds.extnds;

import animals.impl.impl.flyingBirds.FlyingBird;
import auxiliary.MyDate;

public class Stork extends FlyingBird {
    public Stork(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation, int flightAltitude) {
        super(height, weight, eyesColor, habitat, dateOfLocation, flightAltitude);
    }

    public Stork() {
        super();
    }
    @Override
    public void makeSound() {
        System.out.println("Crrr!!!...");
    }
    @Override
    public String toString() {
        return String.format("id: %s, вид: %s, рост: %s, вес: %s, цвет глаз: %s, место обитания: %s, дата нахождения: " +
                "%s, высота полета: %s", id, this.getType(), height, weight, eyesColor, habitat, dateOfLocation, flightAltitude);
    }
}
