import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng tài liệu: ");
        int n = sc.nextInt();
        Sach[] listSach = new Sach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Loại sách nào bạn muốn nhập?(1- SGK, 2 - Đồ án, 3 - Tài liệu điện tử)");
            int selection = sc.nextInt();
            if (selection == 1) {
                //SGK
                listSach[i] = new SachGiaoKhoa();
            } else if (selection == 2) {
                //Đồ án
                listSach[i] = new DoAn();
            } else if (selection == 3) {
                //Tài liệu điện tử
                listSach[i] = new TaiLieuDienTu();
            } else {
                System.out.println("Giá trị ko hợp lệ!");
            }
            listSach[i].input();
            for (int i = 0; i < listSach.length; i++) {
                listSach[i].display();
            }
        }
    }
}
