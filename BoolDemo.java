//chương trình minh họa về các giá trị kiểu boolean
class BoolDemo
{
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b la " + b);
        b = true;
        System.out.println("b la " + b);
        //giá trị boolean có thể dùng để điều khiển câu lệnh if
        if(b) System.out.println("Cau lenh nay duoc thuc thi");
        b = false;
        if(b) System.out.println("cau lenh nay khong duoc thuc thi");
        //kết quả của toán tử quan hệ là một giá trị kiểu boolean
        System.out.println("10 > 9 la " + (10>9));
    }
}