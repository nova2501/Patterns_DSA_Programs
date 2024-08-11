import java.util.Scanner;

public class reverse_array {

    static void reverse(int[] a,int n)
    {
        int j=n-1;
        int i=0;
           while(i<j)
           {
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               j--;
               i++;

           }

        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,2,9,8,7,1};
        reverse(a,a.length);
    }

}
