public class NXN_star_pattern {
        public static void getStarPattern(int n) {
            for(int i=0;i<n;i++)
            {
                if(i==0 || i==n-1)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                else
                {
                    for(int j=0;j<=0;j++)
                    {
                        System.out.print("* ");
                    }
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<=0;j++)
                    {
                        System.out.print(" *");
                    }
                    System.out.println();

                }
            }
        }

    public static void main(String[] args) {
        getStarPattern(5);
    }
    }

