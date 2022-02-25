package projectdos;

public class Driver {

    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        Cube c = new Cube(4);
        Cylinder cy = new Cylinder(4,5);

        System.out.println(s);
        System.out.println(c);
        System.out.println(cy);
    }
}
