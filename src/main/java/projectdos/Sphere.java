package projectdos;

public class Sphere {

    int radius;

    public Sphere(int radius) {
        super();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    int surfaceArea() {
        return 4*22/7*radius*radius;
    }

    int volume() {
        return 4/3*22/7*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere [surfaceArea=" + surfaceArea() + ", volume=" + volume() + "]";
    }
}
