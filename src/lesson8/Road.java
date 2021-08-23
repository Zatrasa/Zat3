package lesson8;

public class Road implements Obstacle{
    int distans;

    public Road(int distans) {
        this.distans = distans;
    }

    public boolean Doit(Uchastnic uchastnic) {
        return uchastnic.Run(distans);
    }
}
