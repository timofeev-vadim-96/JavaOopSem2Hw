package animals.impl;

import animals.Animal;
import auxiliary.MyDate;

public abstract class Pets extends Animal implements Сaressing{
    protected String nickname;
    protected String breed;
    protected boolean availabilityOfVaccinations;
    protected String coatColor;
    protected MyDate birthDay;

    public Pets(int height, int weight, String eyesColor, String nickname, String breed,
                boolean availabilityOfVaccinations, String coatColor, MyDate birthDay) {
        super(height, weight, eyesColor);
        this.nickname = nickname;
        this.breed = breed;
        this.availabilityOfVaccinations = availabilityOfVaccinations;
        this.coatColor = coatColor;
        this.birthDay = birthDay;
    }
    public Pets(String nickname){
        this.nickname = nickname;
    }
    public Pets(){
        super();
    }

}
