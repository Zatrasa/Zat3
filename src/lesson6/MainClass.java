package lesson6;

public class MainClass {

    public static void main(String[] args) {
        animal an1 = new animal("Животное №1");
        Cat cat1 = new Cat("Барс");
        Cat cat2 = new Cat("Мурз");
        Cat cat3 = new Cat("Котик");
        Dog dog1 = new Dog("Рудольф");
        Dog dog2 = new Dog("Боб");

        an1.run(150);
        an1.swim(100);

        cat1.run(230);
        cat2.run(20);
        cat3.swim(3);

        dog1.swim(100);
        dog2.run(200);
        an1.animal_count();
        cat1.cat_count();
        dog1.dog_count();
    }
}
