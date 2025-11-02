import java.util.Scanner;
class Logic
{
    void countFactorsOfNum(int iNum)
    {
        int iCnt=0,iCountFact=0;
        for(iCnt=1;iCnt<=(iNum/2);iCnt++)
        {

            if((iNum%iCnt)==0)
            {

                iCountFact++;

            }

        }

        System.out.println("There are "+iCountFact+" factors of the number.");

    }
}
class Program_4
{
    public static void main(String A[])
    {
        int iNumber=0;


        System.out.println("Enter the Number : ");        

        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.countFactorsOfNum(iNumber);

    }
}