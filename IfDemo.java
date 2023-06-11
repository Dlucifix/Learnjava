//chuong trinh chay thu cau lenh if
import javax.sound.midi.SysexMessage;
public class IfDemo {
    public static void main(String[] args) {
        int a , b ,c ;
        a =2;
        b=3;
        if(a<b) System.out.println("a nho hon b");
        if(a==b) System.out.println("Ban se k nhin thay dong nay");
        System.out.println();
        c = a -b;
        System.out.println("c chua gia tri -1");
        if(c>=0) System.out.println("c khong phai la so am");
        if(c<0) System.out.println("c la so am");
        System.out.println();
        c = b -a;
        System.out.println("c chua gia tri 1");
        if(c>=0) System.out.println("c khong phai la so am");
        if(c<0) System.out.println("c la so am");
    }
}
