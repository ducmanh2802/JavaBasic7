import java.util.Scanner;

public abstract class Book {
    Scanner sc = new Scanner(System.in);
    int ID;
    String name;
    String pulisher;
    int yearPulish;
    int amount;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    public int getYearPulish() {
        return yearPulish;
    }

    public void setYearPulish(int yearPulish) {
        this.yearPulish = yearPulish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void input() {
        System.out.println("Nhập vào tài liệu bạn muốn luw trữ(1. SGK 2. Đồ án 3. Tài liệu điện tử)");

    }

    public void display() {
    }
}
