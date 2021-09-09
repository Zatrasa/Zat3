package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void AddFruit(T... somefruits) {
        fruits.addAll(Arrays.asList(somefruits));
    }

    public float GetSumWeight() {
        float sumw = 0f;
        for (T wh : fruits) {
            sumw += wh.getWeight();
        }
        return sumw;
    }

    public boolean Compare(Box OtherB) {
        if (GetSumWeight() - OtherB.GetSumWeight() < 0.000001f) {
            return true;
        } else {
            return false;
        }
    }

    public void MoveBox(Box OtherB){
        if (this==OtherB){
            return;
        }
        else{
            this.fruits.addAll(OtherB.fruits);
            OtherB.fruits.clear();
        }
    }

}
