import java.util.Scanner;

public class prind_fibonacci_series_recursion {
    public static int print_fibonacci(int n) {

            if(n==1)
                return 0;
            if(n==2 || n==3)
                return 1;
            int ans=print_fibonacci(n-1)+print_fibonacci(n-2);
            return ans;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number::");
        int n=s.nextInt();
        System.out.println("the fibonacci series is:");
        for(int i=1;i<=n;i++) {
            int res=print_fibonacci(i);
            System.out.println(res);
        }


    }
}
