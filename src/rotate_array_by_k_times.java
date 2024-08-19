import java.util.Scanner;

public class rotate_array_by_k_times {

    static void rotated_array(int n,int[] a,int k)
    {
        int[] res=new int[n];
        int j=0;
        for(int i=k;i<n;i++)
        {
            res[j++]=a[i];
        }
        for(int i=0;i<k;i++)
        {
            res[j++]=a[i];
        }
        System.out.println("The result is");
        for (int i = 0; i < n; i++) {

            System.out.print(res[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the k values");
        int k=sc.nextInt();

        rotated_array(n,a,k);

    }
}
