
public class Circle extends Cylinder{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }

}
