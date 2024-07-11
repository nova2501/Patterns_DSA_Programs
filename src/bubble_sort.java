public class bubble_sort {


    public static int[] bubble_sort_ans(int[] a)
    {
        int n=a.length;
        int temp;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={5,3,2,1,8,9,4,7};

        int ans[]=bubble_sort_ans(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
