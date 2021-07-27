package lesson7;

public class Cat {
    String name;
    boolean not_hungry;
    int appetite;

    Cat(String name, int appetite){
        not_hungry = false;
        this.name=name;
        this.appetite=appetite;
    }

    public void Eat(Plate cat_plate){
        not_hungry=cat_plate.GiveFood(appetite);
    }

    public void InfoCat(){
        if (not_hungry) {
            System.out.printf("Кот %s сыт \n",name);
        }
        else{
            System.out.printf("Кот %s голоден \n",name);
        }
    }

}
