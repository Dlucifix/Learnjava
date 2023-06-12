//chương trình minh họa về toán tử quan hệ và toán tử logic
public class RelLogOps
{
    public static void main(String[] args) {
        int i,j;
        boolean b1,b2;
        i = 10;
        j = 11;
        if(i<j) System.out.println(" i<j ");
        if(i<=j) System.out.println("i<=j");
        if(i!=j) System.out.println("i != j");
        if(i==j) System.out.println("cau lenh nay khong duoc thuc thi");
        if(i>=j) System.out.println("cau lenh nay khong duoc thuc thi");
        if(i>j) System.out.println("cau lenh nay khong duoc thuc thi");
        b1 = true;
        b2 = false;
        if(b1&b2) System.out.println("Cau lenh nay khong duoc thuc hien");
        if(!(b1&b2)) System.out.println("!(b1&b2) bang true");
        if(b1 | b2) System.out.println("b1 | b2 bang true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 bang true");
    }
}