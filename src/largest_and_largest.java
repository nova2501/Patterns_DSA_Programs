import java.util.Arrays;
import java.util.Scanner;

public class largest_and_largest {

    static void find_two(int[] a,int n,int k)
    {
        Arrays.sort(a);
        int small=a[k-1];
        int large=a[n-k];

        System.out.println(small+" "+large);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={4,6,8,1,14,15,17};
        int k=3;
        find_two(a,a.length,k);
    }
}
