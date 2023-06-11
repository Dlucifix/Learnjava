//chuong trinh doi gallons sang lit update
class GalToLitTable
{
    public static void main(String[] args) {
        double Gallons, liters;
        int count = 0;
        for(Gallons =1; Gallons<=100;Gallons++)
        {
            liters=Gallons*3.7854;
            System.out.println(Gallons + " Gallons bang " + liters + " lit");
            count++;
            if(count==10)
            {
                System.out.println();
                count=0;
            }
        }
    }
}