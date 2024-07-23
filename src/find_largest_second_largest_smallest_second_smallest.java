public class find_largest_second_largest_smallest_second_smallest {

    public static void find_answer(int n,int[] a)
    {
        if(n==0 || n==1)
        {
            System.out.print(-1);
            System.out.print(" ");
            System.out.println(-1);
            System.out.println(" ");
        }
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        int i;

        for(i=0;i<n;i++)
        {
            small=Math.min(small,a[i]);
            large=Math.max(large,a[i]);
        }

        for(i=0;i<n;i++)
        {
            if(a[i]>secondlarge && a[i]!=large)
            {
                secondlarge=a[i];
            }
            if(a[i]<secondsmall && a[i]!=small)
            {
                secondsmall=a[i];
            }
        }

        System.out.println("first small "+small);
        System.out.println("second small "+secondsmall);
        System.out.println("first large "+large);
        System.out.println("second large "+secondlarge);

    }

    public static void main(String[] args) {
        int a[]={2,5,1,5,8,9,10,4};
        find_answer(a.length,a);
    }
}
