//chương trình minh họa chuyển đổi kiểu tự động từ long sang double
public class LongToDouble
{
    public static void main(String[] args) {
        Long L;
        double D;
        L = 100123285L;
        D = L;
        System.out.println("L va D: " + L + " " + D);
    }
}
/*
 Mặc dù, có quá trình chuyển đổi tự động từ long sang double, nhưng không 
 có quá trình chuyển đối kiểu tự động từ double sang long, vì đó không phải 
 là chuyển đổi kiểu mở rộng. Vì vậy, phiên bản sau của chương trình không họp lệ
 */
/*
 Chương trình này sẽ không biên dịch
 public class LongToDouble
 {
    public static void main(String args[])
    {
        long L;
        double D;
        D = 100123285.D;
        L = D; //Không hợp lệ //không thể chuyển đổi tự động từ double sang long
        System.out.println("L va D: " + L + " " + D);
    }
 }
 */