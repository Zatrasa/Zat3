package lesson6;

public class Dog extends animal{
    static int count_dog;
    public Dog(String name){
        super(name);
        count_dog++;
    }
    public void dog_count(){
        System.out.printf("Создано %d собак \n",count_dog);
    }

    @Override
    public void run(int distance) {
        if (distance>500){
            System.out.print("Собака столько не бежит \n");
        }
        else {
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        if (distance>10){
            System.out.printf("Пес %s утонул \n",this.name);
        }
        else{
            super.swim(distance);
        }


    }
}
