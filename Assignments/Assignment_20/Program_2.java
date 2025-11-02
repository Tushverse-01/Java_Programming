import java.util.Scanner;
class Logic
{
    void displayRevFromNum(int iNum)
    {
        int iCnt=0;
        for(iCnt=iNum;iCnt>=1;iCnt--)
        {

            System.out.println(iCnt);

        }
    }

}
class Program_2
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number : ");
        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.displayRevFromNum(iNumber);
    }
}