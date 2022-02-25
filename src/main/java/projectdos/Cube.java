package projectdos;

public class Cube extends Sphere{

    public Cube(int length) {
        super(length);
        //constructor
    }

     int surfaceArea() {
        return 6 * radius * radius;
    }

    int volume() {
        return radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Cube [surfaceArea=" + surfaceArea() + ",  volume=" + volume() + "]";
    }
}
