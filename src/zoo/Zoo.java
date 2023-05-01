package zoo;

import animals.Animal;
import animals.impl.impl.Wolf;
import animals.impl.impl.flyingBirds.extnds.Chicken;
import animals.impl.impl.flyingBirds.extnds.Stork;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private List<Animal> zooAnimals;

    public Zoo addAnimal(Animal animal){
        zooAnimals.add(animal);
        return this;
    }
    public Zoo(){
        zooAnimals = new LinkedList<Animal>();
    }

    public void getInfo() {
        zooAnimals.forEach(a -> System.out.println(a));
    }
    public void allMakeSound() {
        zooAnimals.forEach(a -> a.makeSound());
    }

    public void removeAnimal(int id){
        for (int i = 0; i < zooAnimals.size(); i++) {
            if(zooAnimals.get(i).getId() == id){
                System.out.printf("%s удален из зоопарка.. ", zooAnimals.get(i).getType());
                zooAnimals.remove(i);
            }
        }

    }
    public void showInfo(int id){
        for (int i = 0; i < zooAnimals.size(); i++) {
            if(zooAnimals.get(i).getId() == id){
                System.out.println(zooAnimals.get(i));
            }
        }

    }
    public void makeSound(int id){
        for (int i = 0; i < zooAnimals.size(); i++) {
            if(zooAnimals.get(i).getId() == id){
                zooAnimals.get(i).makeSound();
            }
        }

    }
    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                "Зоопарк <<Нарния>> приветствует Вас!\n" +
                "************** Меню **************\n" +
                "1. Добавить животное в зоопарк \n" +
                "2. Удалить животное из зоопарка по id\n" +
                "3. Показать информацию о животном по id\n" +
                "4. Заставить животное издать звук по id\n" +
                "5. Напечатать информацию о животных, которые есть на данный момент в зоопарке\n" +
                "6. Заставить всех животных, которые на данный момент есть в зоопарке, издать звук\n" +
                "7. Выход из программы. ");
        int choice = scanner.nextInt();
        if (0 >= choice || choice > 7){
            System.out.println("Введите корректный вариант действия, согласно меню.. ");
            userMenu();
        }
        if (choice == 7){
            System.out.println("До новых встреч! ");
        }
        menuImplementation(choice);
    }
    public void menuImplementation(int usersChoice){
        Scanner scanner = new Scanner(System.in);
        int choice;
        if (usersChoice == 1){
            System.out.println("" +
            "************** Меню **************\n" +
                    "1. Добавить волка в зоопарк \n" +
                    "2. Добавить цаплю в зоопарк \n" +
                    "3. Добавить курицу в зоопарк \n" +
                    "4. Выход из программы. ");
            choice = scanner.nextInt();
            if (choice == 1){
                addAnimal(new Wolf());
                System.out.println("Волк добавлен в зоопарк!");
                userMenu();
            }
            else if (choice == 2){
                addAnimal(new Stork());
                System.out.println("Цапля добавлена в зоопарк!");
                userMenu();
            }
            else if (choice == 3){
                addAnimal(new Chicken());
                System.out.println("Курица добавлена в зоопарк!");
                userMenu();
            }
            else if (choice == 4){
                System.out.println("До новых встреч! ");
            }
            else {
                System.out.println("Введите корректный вариант действия, согласно меню.. ");
                userMenu();
            }

        }
        else if (usersChoice == 2){
            System.out.println("Введите id: ");
            choice = scanner.nextInt();
            if (choice > Animal.counter || choice <= 0){
                System.out.println("Животное с таким индексом не существует...");
                userMenu();
            }
            else{
                removeAnimal(choice);
                userMenu();
            }

        }
        else if (usersChoice == 3){
            System.out.println("Введите id: ");
            choice = scanner.nextInt();
            if (choice > Animal.counter || choice <= 0){
                System.out.println("Животное с таким индексом не существует...");
                userMenu();
            }
            else{
                showInfo(choice);
                userMenu();
            }
        }
        else if (usersChoice == 4){
            System.out.println("Введите id: ");
            choice = scanner.nextInt();
            if (choice > Animal.counter || choice <= 0){
                System.out.println("Животное с таким индексом не существует...");
                userMenu();
            }
            else{
                makeSound(choice);
                userMenu();
            }
        }
        else if (usersChoice == 5){
            if (zooAnimals.isEmpty()){
                System.out.println("В зоопарке больше не осталось животных... ");
                userMenu();
            }
            else{
                getInfo();
                userMenu();
            }
        }
        else if (usersChoice == 6){
            if (zooAnimals.isEmpty()){
                System.out.println("В зоопарке больше не осталось животных... ");
                userMenu();
            }
            else{
                allMakeSound();
                userMenu();
            }
        }
    }
}
