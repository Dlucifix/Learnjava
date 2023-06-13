//chương trình hiệu ứng phụ có thể quan trọng minh họa toán tử tối ưu hiệu quả hơn
public class SideEffects
{
    public static void main(String[] args) {
        int i;
        i = 0;
        /*
         trong dòng mã dưới đây, i vẫn được tăng giá trị
         ngay cả khi câu lệnh if không được thực hiện
         */
        if(false & (++i < 100))
        System.out.println("dong nay se khong duoc thuc thi");
        System.out.println("cau lenh if duoc thuc thi: " + i); //hiển thị i
        /* 
         trong trường hợp này i không được tăng giá trị
         because toán tử tối ưu bỏ qua phép tăng giá trị
         */
        if(false && (++i < 100))
        System.out.println("dong nay se khong duoc hien thi");
        System.out.println("cau lenh if duoc thuc thi: " + i); //vẫn hiển thị i
    }
}
