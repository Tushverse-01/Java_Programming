import java.util.Scanner;
class Logic
{
    void calculateMultiOfDigits(int iNum)
    {
        int iMultAns=0,iDigit=0;
        iMultAns=1;

        while(iNum!=0)
        {
            iDigit=iNum%10;

            iMultAns=iMultAns*iDigit;

            iNum=iNum/10;
        }

        System.out.println("The Multiplication of Digits of the number is : "+iMultAns);
        
    }

}
class Program_1
{
    public static void main(String A[])
    {
        int iNumber=0;

        System.out.println("Enter the number : ");
        Scanner sObj = new Scanner(System.in);
        iNumber=sObj.nextInt();

        Logic lObj = new Logic();
        lObj.calculateMultiOfDigits(iNumber);


    }
}