package animals.impl.impl;

import animals.impl.AmenableToTraining;
import animals.impl.Pets;
import auxiliary.MyDate;

public class Dog extends Pets implements AmenableToTraining {
    protected boolean trained;

    public Dog(int height, int weight, String eyesColor, String nickname, String breed,
               boolean availabilityOfVaccinations, String coatColor, MyDate birthDay, boolean trained) {
        super(height, weight, eyesColor, nickname, breed, availabilityOfVaccinations, coatColor, birthDay);
        this.trained = trained;
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Woofff!!!...");
    }

    @Override
    public void takeCare() {
        System.out.println("The dog wants to be petted!!!...");
    }

    @Override
    public void train() {
        System.out.println("The dog obediently listens to you...");
    }

    @Override
    public String toString() {
        return String.format("id: %s, вид: %s, рост: %s, вес: %s, цвет глаз: %s, кличка: %s, порода: %s, " +
                        "наличие вакцинаций: %s, цвет шерсти: %s, дата рождения: %s, наличие дрессировки: " +
                        "%s", id, this.getType(), height, weight, eyesColor, nickname, breed, availabilityOfVaccinations,
                coatColor, birthDay, trained);
    }
}
