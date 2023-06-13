//chương trình minh họa về sự ép kiểu
public class CastDemo
{
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        x =10.0;
        y =3.0;
        i = (int) (x/y); //ép kiểu từ double sang int
        System.out.println("Ket qua phan nguyen cua phep chia x/y: " + i);
        i = 100;
        b =(byte) i; //k mất tt ở đây.Một byte có thể lưu giá trị 100
        System.out.println("gia tri cua b la:" + b);
        i = 257;
        b = (byte) i;//mất thông tin. một byte k thể lưu giá trị 257
        System.out.println("Gia tri cua b: " + b);
        b = 88;//mã ASCII của kí tự là X
        ch = (char) b; //ép kiểu giữa hai kiểu data không tương thích
        System.out.println("ch: " + ch);
    }
}