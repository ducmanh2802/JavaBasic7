import java.util.Scanner;

public class Circle extends Shape implements IDiameter {
    Scanner sc = new Scanner(System.in);
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * this.getRadius());
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double diameter() {
        return 2 * this.getRadius();
    }

    @Override
    public void input() {
        System.out.println("Nhập vào bán kính HT: ");
        this.setRadius(sc.nextDouble());
    }

    @Override
    public void display() {
        System.out.println("Bán kính HT: " + this.radius);
        System.out.println("Chu vi HT: " + this.perimeter());
        System.out.println("Diện tích HT: " + this.area());
        System.out.println("Đường kính HT: " + this.diameter());
    }
}
