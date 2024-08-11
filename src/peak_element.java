import java.util.Scanner;

public class peak_element {

    static void find_peak_element(int[] a,int n)
    {
        for(int i=1;i<n-1;i++)
        {
            if(a[i-1]<a[i] && a[i]>a[i+1])
            {
                System.out.println("peak element "+a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={7,1,1,1,5,1,1,1,10};
        find_peak_element(a,a.length);

    }
}
