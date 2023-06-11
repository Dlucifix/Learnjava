//chuong trinh chuyen doi inch sang met
class InchToMetTable
{
    public static void main(String[] args) {
        double inch, meter;
        int count = 0;
        for(inch=1;inch<=100;inch++)
        {
            meter = inch *1.0 / 39.37;
            System.out.println(inch + " inch bang " + meter + " met ");
            count++;
            if(count==12)
            {
                System.out.println();
                count=0;
            }
        }
    }
}