package animals.impl.impl;


import animals.impl.Pets;
import auxiliary.MyDate;


public class Cat extends Pets {
    protected boolean presenceOfCoat;
    protected boolean isATiger;

    public Cat(int height, int weight, String eyesColor, String nickname, String breed,
               boolean availabilityOfVaccinations, String coatColor, MyDate birthDay,
               boolean presenceOfCoat, boolean isATiger) {
        super(height, weight, eyesColor, nickname, breed, availabilityOfVaccinations, coatColor, birthDay);
        this.presenceOfCoat = presenceOfCoat;
        this.isATiger = isATiger;
    }

    public Cat(String nickname) {
        super(nickname);
    }

    public Cat() {
        super();
    }
    @Override
    public void makeSound() {
        System.out.println("Meowww!!!...");
    }

    @Override
    public void takeCare() {
        System.out.println("The cat wants to handle!!!...");
    }
    @Override
    public String toString() {
        return String.format("id: %s, вид: %s, рост: %s, вес: %s, цвет глаз: %s, кличка: %s, порода: %s, " +
                        "наличие вакцинаций: %s, цвет шерсти: %s, дата рождения: %s, наличие шерсти: %s, " +
                        "является ли тигром: %s", id, this.getType(), height, weight, eyesColor, nickname, breed,
                availabilityOfVaccinations, coatColor, birthDay, presenceOfCoat, isATiger);
    }
}
