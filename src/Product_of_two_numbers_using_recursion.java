import java.util.Scanner;

public class Product_of_two_numbers_using_recursion {


    public static int sum_of_two_numbers(int a,int b)
    {
        if(b==0)
            return a;
        return sum_of_two_numbers(a+1,b-1);


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int ans=sum_of_two_numbers(a,b);
        System.out.println(ans);
    }
}
