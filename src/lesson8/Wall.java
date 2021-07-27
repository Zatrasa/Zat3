package lesson8;

public class Wall implements Obstacle{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean Doit(Uchastnic uchastnic) {
        return uchastnic.Jump(height);
    }
}
