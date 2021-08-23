package lesson8;

public class Cat implements Uchastnic{
    int maxrun;
    int maxjump;
    String name;
    boolean inplay;

    public Cat(String name,int maxrun, int maxjump) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
        this.name = name;
        this.inplay = true;
    }

    @Override
    public boolean Run(int dist) {
        if(dist<=maxrun){
            System.out.printf("Кот %s пробежал %d метров \n",name,dist);
            return true;
        }
        inplay = false;
        System.out.printf("Кот %s не смог пробежать %d метров \n",name,dist);
        return false;
    }

    @Override
    public boolean Jump(int height) {
        if(height<=maxjump){
            System.out.printf("Кот %s прыгнул на %d метров \n",name,height);
            return true;
        }
        inplay = false;
        System.out.printf("Кот %s не смог прыгнуть на %d метров \n",name,height);
        return false;
    }

    @Override
    public boolean isInplay() {
        return inplay;
    }
}
