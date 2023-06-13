//chương trình sử dụng minh họa ép kiểu
public class UseCast
{
    public static void main(String args[])
    {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println(i + " /3: " + i/3);
            System.out.println(i + " /3 co phan thap phan la: " + (double) i/3);
            System.out.println();
        }
    }
}