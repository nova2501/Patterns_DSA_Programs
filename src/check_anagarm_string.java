import java.util.Arrays;
import java.util.Scanner;

public class check_anagarm_string {

    public static boolean check_anagram(String n1,String n2)
    {
        char[] a=n1.toCharArray();
        char[] b=n2.toCharArray();

        if(a.length!=b.length)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
                return false;
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string a:::");
        String a=s.next();
        System.out.println("Enter the string b:::");
        String b=s.next();
        if(check_anagram(a,b))
            System.out.println("It is anagram");
        else
            System.out.println("It is not anagram");
    }
}
