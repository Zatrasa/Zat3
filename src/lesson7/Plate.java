package lesson7;

public class Plate {
    private int food;

    Plate(int food){
        this.food=food;
    }

    void AddFood(int amount){
        food+=amount;
    }

    boolean GiveFood(int amount){
        if ((food-amount)<0){
            return false;
        }
        else{
            food-=amount;
            return true;
        }
    }

}
