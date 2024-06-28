public class Cylinder {
    private double height ;
    private double radius ;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public Cylinder() {

    }


    public double getHeight() {
        return height;
    }
    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }
}
