import java.util.Scanner;

public class factorial_using_recursion {

    public static int find_fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        int fact=n*find_fact(n-1);

        return fact;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();

        System.out.println("the factorial of given number is:");
        int res=find_fact(n);
        System.out.println(res);


    }
}
