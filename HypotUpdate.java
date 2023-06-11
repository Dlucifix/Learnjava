//cai tien chuong trinh tim chieu dai cua canh huyen dung Scanner
import java.util.Scanner;
class HypotUpdate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        System.out.println("Nhap chieu dai canh x: ");
        x = sc.nextDouble();
        System.out.println("Nhap chieu dai canh y: ");
        y = sc.nextDouble();
        z = Math.sqrt(x*x + y*y);
        System.out.println("chieu dai canh huyen la: " + z);
    }
}