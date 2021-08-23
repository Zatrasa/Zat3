package lesson8;

public class Robot implements Uchastnic{
    int maxrun;
    int maxjump;
    String name;
    boolean inplay;

    public Robot(String name,int maxrun, int maxjump) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
        this.name = name;
        this.inplay = true;
    }

    @Override
    public boolean Run(int dist) {
        if(dist<=maxrun){
            System.out.printf("Робот %s пробежал %d метров \n",name,dist);
            return true;
        }
        inplay = false;
        System.out.printf("Робот %s не смог пробежать %d метров \n",name,dist);
        return false;
    }

    @Override
    public boolean Jump(int height) {
        if(height<=maxjump){
            System.out.printf("Робот %s прыгнул на %d метров \n",name,height);
            return true;
        }
        inplay = false;
        System.out.printf("Робот %s не смог прыгнуть на %d метров \n",name,height);
        return false;
    }

    @Override
    public boolean isInplay() {
        return inplay;
    }
}
