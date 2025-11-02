import java.util.Scanner;

class Logic
{
    void countEvensAndOddsUptoNum(int iNum)
    {
        int iCnt=0,iCountEvens=0,iCountOdds=0;
        
        for(iCnt=1;iCnt<=iNum;iCnt++)
        {
            if((iCnt%2)==0)
            {
                iCountEvens++;
            }
            else
            {
                iCountOdds++;
            }
        }

        System.out.println("There are "+iCountEvens+" even Numbers upto "+iNum+".");
        System.out.println("There are "+iCountOdds+" odd Numbers upto "+iNum+".");

    }

}
class Program_2
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number : ");

        Scanner sObj = new Scanner(System.in);

        iNumber =sObj.nextInt();

        Logic lObj =new Logic();
        lObj.countEvensAndOddsUptoNum(iNumber);

    }
}