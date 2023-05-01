//Домашнее задание ко 2 семинару
import animals.impl.impl.Wolf;
import animals.impl.impl.flyingBirds.extnds.Stork;
import auxiliary.MyDate;
import zoo.Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Wolf(120, 45, "Gray", "Siberia", new MyDate(02,05,2023), true));
        zoo.addAnimal(new Wolf(105, 50, "Black", "Siberia", new MyDate(01,05,2023), false));
        zoo.addAnimal(new Wolf(108, 47, "White", "Siberia", new MyDate(28,04,2023), false));
        zoo.addAnimal(new Stork(200, 2, "Brown", "Shri-Lanka", new MyDate(23, 04, 2023), 2000));
        zoo.userMenu();
    }
}