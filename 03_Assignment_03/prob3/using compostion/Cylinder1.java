public class Cylinder1 {
    private Circle base;
    private double height;

    public Cylinder1(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return base.computeArea() * height;
    }

    public double getBaseRadius() {
        return base.getRadius();
    }
}