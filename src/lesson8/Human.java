package lesson8;

public class Human implements Uchastnic {
    int maxrun;
    int maxjump;
    String name;
    boolean inplay;

    public Human(String name,int maxrun, int maxjump) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
        this.name = name;
        this.inplay = true;
    }

    @Override
    public boolean Run(int dist) {
        if(dist<=maxrun){
            System.out.printf("Человек %s пробежал %d метров \n",name,dist);
            return true;
        }
        inplay = false;
        System.out.printf("Человек %s не смог пробежать %d метров \n",name,dist);
        return false;
    }

    @Override
    public boolean Jump(int height) {
        if(height<=maxjump){
            System.out.printf("Человек %s прыгнул на %d метров \n",name,height);
            return true;
        }
        inplay = false;
        System.out.printf("Человек %s не смог прыгнуть на %d метров \n",name,height);
        return false;
    }

    @Override
    public boolean isInplay() {
        return inplay;
    }
}
