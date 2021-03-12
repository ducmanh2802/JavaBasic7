import java.util.Scanner;

public class Rectangle extends Shape implements IDiagonal {
    double length, width;
    Scanner sc = new Scanner(System.in);

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    @Override
    public void input() {
        System.out.println("Nhập vào chiều dài HCN: ");
        this.setLength(sc.nextDouble());
        System.out.println("Nhập vào chiều rộng HCN: ");
        this.setWidth(sc.nextDouble());
    }

    @Override
    public void display() {
        System.out.println("Chiều dài HCN: " + length);
        System.out.println("Chiều rộng HCN: " + width);
        System.out.println("Chu vi HCN: " + perimeter());
        System.out.println("Diện tích HCN: " + area());
        System.out.println("Đường chéo HCN: " + diagonal());
    }
}
