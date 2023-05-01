package animals.impl.impl;

import animals.Speakers;
import animals.impl.WildAnimals;
import auxiliary.MyDate;

public class Wolf extends WildAnimals implements Speakers {
    protected boolean isAlpha;

    public Wolf(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation, boolean isAlpha) {
        super(height, weight, eyesColor, habitat, dateOfLocation);
        this.isAlpha = isAlpha;
    }

    public Wolf() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Woofff!!!...");
    }

    @Override
    public String toString() {
        return String.format("id: %s, вид: %s, рост: %s, вес: %s, цвет глаз: %s, место обитания: %s, дата нахождения: " +
                "%s, является ли вожаком стаи: %s", id, this.getType(), height, weight, eyesColor, habitat, dateOfLocation, isAlpha);
    }
}
