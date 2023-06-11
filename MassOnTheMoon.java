//chuong trinh tinh khoi luong thuc o mat trang
import java.util.Scanner;
class MassOnTheMoon
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoi luong cua ban khi o trai dat: ");
        double massTD = sc.nextDouble();
        double tyle_trongluc = 17.0 / 100;
        double massMT = massTD*tyle_trongluc;
        System.out.println("Khoi luong thuc cua ban khi o mat trang: " + massMT);
    }
}