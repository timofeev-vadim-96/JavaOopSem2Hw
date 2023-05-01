package animals.impl.impl.flyingBirds.extnds;

import animals.impl.impl.Bird;
import auxiliary.MyDate;

public class Chicken extends Bird {
    public Chicken(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation) {
        super(height, weight, eyesColor, habitat, dateOfLocation);
    }

    public Chicken() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck!!!...");
    }
    @Override
    public String toString() {
        return String.format("id: %s, вид: %s, рост: %s, вес: %s, цвет глаз: %s, место обитания: %s, дата нахождения: " +
                "%s", id, this.getType(), height, weight, eyesColor, habitat, dateOfLocation);
    }
}
