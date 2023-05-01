package animals.impl.impl.flyingBirds;

import animals.impl.impl.Bird;
import auxiliary.MyDate;

public abstract class FlyingBird extends Bird{
    protected int flightAltitude;

    public FlyingBird(int height, int weight, String eyesColor, String habitat, MyDate dateOfLocation, int flightAltitude) {
        super(height, weight, eyesColor, habitat, dateOfLocation);
        this.flightAltitude = flightAltitude;
    }

    public FlyingBird() {
        super();
    }
    public void fly(){
        System.out.printf("%s летит на высоте %s метров", this.getType(), flightAltitude);
    }
}
