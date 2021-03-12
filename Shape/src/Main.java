import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hình muốn nhập là(1. Hinh tròn 2. Hình chữ nhật)");
        int n = sc.nextInt();

        if (n == 1) {
            Circle circle = new Circle();
            circle.input();
            circle.display();
        } else if (n == 2) {
            Rectangle rectangle = new Rectangle();
            rectangle.input();
            rectangle.display();
        } else {
            System.out.println("Giá trị không hợp lệ !");
        }
    }
}
