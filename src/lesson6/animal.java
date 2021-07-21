package lesson6;

public class animal {
    static int count_animal;
    String name;

    public animal(String name){
        this.name=name;
        count_animal++;
    }
    public void run(int distance){
        System.out.printf("%s бежит %d метров \n",this.name,distance);
    }
    public void swim(int distance){
        System.out.printf("%s плывет %d метров \n",this.name,distance);
    }
    public void animal_count(){
        System.out.printf("Создано %d животных \n",count_animal);
    }


}
