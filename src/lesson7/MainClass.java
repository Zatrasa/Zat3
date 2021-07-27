package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Кот №1",2);
        cats[1] = new Cat("Кот №2",3);
        cats[2] = new Cat("Кот №3",1);
        cats[3] = new Cat("Кот №4",6);
        cats[4] = new Cat("Кот №5",1);
        Plate plate1 = new Plate(10);

        for (Cat cat:cats){
            cat.Eat(plate1);
        }

        for (Cat cat : cats) {
            cat.InfoCat();
        }

    }
}
