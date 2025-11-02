import java.util.Scanner;
class Logic
{
    void displayFactors(int iNum)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=(iNum/2);iCnt++)
        {
            if((iNum%iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }

    }
}
class Program_3
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the Number : ");

        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();

        lObj.displayFactors(iNumber);

    }
}