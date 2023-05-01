package animals.impl;

import animals.Animal;
import auxiliary.MyDate;

public abstract class WildAnimals extends Animal {
    protected String habitat;
    protected MyDate dateOfLocation;

    public WildAnimals(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }

    public WildAnimals() {
        super();
    }
}
