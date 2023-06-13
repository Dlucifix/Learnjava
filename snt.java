//chương trình tìm ALL các số nguyên tố trong khoảng từ 2 -> 100
public class snt 
{
    public static void main(String[] args) {
        for(int i=2;i<=100;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int i)
    {
        if(i<=1){
            return false;
        }
        for(int a =2;a<=Math.sqrt(i);a++)
        {
            if(i%a==0)
            {
                return false;
            }
        }
        return true;
    }

}