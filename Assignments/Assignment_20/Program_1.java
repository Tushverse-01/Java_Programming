import java.util.Scanner;
class Logic
{
    void calculateSumOfEvenNum(int iNum)
    {
        int iSum=0,iCnt=0;

        for(iCnt=1;iCnt<=iNum;iCnt++)
        {
            if((iCnt%2)==0)
            {
                iSum=iSum+iCnt;
            }

        }

        System.out.println("The sum of even numbers upto "+iNum+" is : "+iSum);

    }

}
class Program_1
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number :");
        Scanner sObj= new Scanner(System.in);

        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.calculateSumOfEvenNum(iNumber);

    }
}