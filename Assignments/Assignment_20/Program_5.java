import java.util.Scanner;
class Logic
{
    void displaySmallerDigOfNum(int iNum)
    {
        int iDigit=0,iMinDigit=0;
        iMinDigit=10;
        

        while(iNum!=0)
        {
            iDigit=iNum%10;

            if(iDigit<iMinDigit)
            {

                iMinDigit=iDigit;

            }

            iNum=iNum/10;

        }

            System.out.println("The Smaller digit in the Number is : "+iMinDigit);
        
        

    }

}
class Program_5
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the Number :");
        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.displaySmallerDigOfNum(iNumber);


    }
}