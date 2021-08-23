package lesson8;

public class Main {

    public static void main(String[] args) {
        Uchastnic[] uch = {
                new Human("Vasiliy", 5000, 1),
                new Human("Ivan", 3000, 2),
                new Cat("Ozzi",100,2),
                new Robot("Vertor",100000,10)
        };
        Obstacle[] obst = {
                new Wall(1),
                new Road(500),
                new Wall(1),
                new Road(1000),
                new Wall(2),
                new Road(4000),
                new Wall(1)
        };

        for (Uchastnic uch1: uch){
            for (Obstacle obst1: obst
                 ) {
                if (uch1.isInplay()){
                    obst1.Doit(uch1);
                }

            }
        }
    }
}
