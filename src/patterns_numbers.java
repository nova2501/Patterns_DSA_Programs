public class patterns_numbers {

    public static void printing_number_patter(int n)
    {
        int b=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.print(0);
                }
                else
                {
                    if(j==0 || j==n-1)
                        System.out.print(0);
                    else
                    {
                        System.out.print(b);
                        b++;
                    }

                }

            }System.out.println();


        }
    }
    public static void main(String[] args) {
        printing_number_patter(5);
    }
}
