//chương trình minh họa một sự nâng kiểu data khá ngạc nhiên
public class PromDemo
{
    public static void main(String[] args) {
        byte b;
        int i;
        b=10;
        i=b*b;//<-phép toán này ổn, không cần ép kiểu
        /*
         Không cần ép kiểu bởi vì kết quả đã là 
         giá trị kiểu int khi đánh giá biểu thức
         */
        b = 10;
        b = (byte) (b*b);//<-việc ép kiểu là cần thiết
        /*
         lệnh này cần ép kiểu để gán một value 
         kiểu int cho 1 biến kiểu byte
         */
        System.out.println("i va b: " + i +    " " + b);

    }
}