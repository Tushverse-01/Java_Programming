import java.util.Scanner;
class Logic
{
    void divisibleByTwoNThree(int iNum)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNum;iCnt++)
        {
            if( ((iCnt%2)==0) || ((iCnt%3)==0) )
            {
                System.out.println(iCnt);
            }

        }

    }
}
class Program_5
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number : ");

        Scanner sObj = new Scanner (System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();

        lObj.divisibleByTwoNThree(iNumber);

    }
}