import java.util.Scanner;

public class reverse_array {

    static void reverse(int[] a,int n)
    {
        int j=n-1;
        for(int i=0;i<n;i++)
        {
           if(i<j)
           {
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               j--;

           }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,2,9,8,7,1};
        reverse(a,a.length);
    }
}
