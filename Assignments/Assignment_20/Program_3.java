import java.util.Scanner;
class Logic
{
    void checkPerfectNumOrNot(int iNum)
    {
        
        int iCnt=0,iSumOfFactors=0;

        for(iCnt=1;iCnt<=(iNum/2);iCnt++)
        {
            if((iNum%iCnt)==0)
            {
                iSumOfFactors=iSumOfFactors+iCnt;
            }

        }
        if(iNum==iSumOfFactors)
        {
            System.out.println("The number "+iNum+" is perfect.");
        }
        else
        {
            System.out.println("The number "+iNum+" is not perfect.");
        }

    }
    
}
class Program_3
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number : ");
        Scanner sObj = new Scanner(System.in);

        iNumber=sObj.nextInt();

        Logic lObj = new Logic();

        lObj.checkPerfectNumOrNot(iNumber);

    }
}