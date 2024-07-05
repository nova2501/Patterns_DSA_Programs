import java.util.Scanner;

public class fibanacci_series_recursion {

    public static int find_fibonacci(int n)
    {
        if(n==1)
            return 0;
        if(n==2 || n==3)
            return 1;
        int ans=find_fibonacci(n-1)+find_fibonacci(n-2);

        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the which postion to find fibanacci number::");
        int n=s.nextInt();

        int res=find_fibonacci(n);
        System.out.println("The result is");
        System.out.println(res);

    }
}
