package animals.impl.impl;

import animals.Speakers;
import animals.impl.WildAnimals;
import auxiliary.MyDate;

public abstract class Bird extends WildAnimals implements Speakers {
    public Bird(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation) {
        super(height, weight, eyesColor, habitat, dateOfLocation);
    }

    public Bird() {
        super();
    }
}
