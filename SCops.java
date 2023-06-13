//chương trình minh họa về các toán tử tối ưu 
public class SCops
{
    public static void main(String[] args) {
        int n, d, q;
        n = 10;
        d = 2;
        if(d!=0 && (n%d)==0) 
        System.out.println(d + " la uoc so cua n " + n);
        d = 0; //thiết lập giá trị 0 cho d
        //vì d bằng 0, toán hạng thứ hai sẽ k đc đánh giá
        if(d!=0 && (n%d)==0)
        System.out.println(d + " la uoc so cua " + n);
        /*
         bây giờ hãy thử cách khác không dùng toán tử tối ưu.
         Điều này sẽ gây ra lỗi chia cho không
        */
        if(d!=0 & (n%d)==0)
        System.out.println(d + " la uoc so cua " + n);
    }
}