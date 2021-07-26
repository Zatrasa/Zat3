package lesson6;

public class Cat extends animal{
    static int count_cat;
    public Cat(String name){
        super(name);
        count_cat++;
    }
    public void cat_count(){
        System.out.printf("Создано %d котов \n",count_cat);
    }

    @Override
    public void run(int distance) {
        if (distance>200){
            System.out.print("Кот столько не бежит \n");
        }
        else {
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s утонул \n",this.name);
    }
}
