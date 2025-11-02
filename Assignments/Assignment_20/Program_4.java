import java.util.Scanner;
class Logic
{
    void displayGreaterDigOfNum(int iNum)
    {
        int iDigit=0,iMaxDigit=0;
        iMaxDigit=-1;

        while(iNum!=0)
        {
            iDigit=iNum%10;

            if(iDigit>iMaxDigit)
            {

                iMaxDigit=iDigit;

            }

            iNum=iNum/10;

        }
        System.out.println("The Greater digit in the Number is : "+iMaxDigit);

    }

}
class Program_4
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the Number :");
        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.displayGreaterDigOfNum(iNumber);


    }
}