import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(fact(number));
    }
    public static int fact(int number)
    {
        if(number==0)
        {
            return 1;
        }
        if(number==1)
        {
            return 1;
        }
        return fact(number-1)*number;
    }
}
