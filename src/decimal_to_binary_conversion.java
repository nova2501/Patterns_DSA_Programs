import java.util.Scanner;

public class decimal_to_binary_conversion {

    static int decimal_to_binary(int a)
    {
        if(a==0)
            return 0;

        return (a%2+10*(decimal_to_binary(a/2)));
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the decimal valu:");
        int a=s.nextInt();
        int ans= decimal_to_binary(a);
        System.out.println("The binary value of given number:");
        System.out.println(ans);

    }
}
