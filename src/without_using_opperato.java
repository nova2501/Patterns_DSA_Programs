public class without_using_opperato {
    public static void main(String[] args) {
        int a=5,b=3;

        while(b!=0)
        {
            int sum=a^b;
            String binary = Integer.toBinaryString(sum);
            System.out.println(" sum= "+binary);
            int ca=(a&b)<<1;
            String biy = Integer.toBinaryString(ca);
            System.out.println(" carry= "+biy);
            a=sum;
            b=ca;
            System.out.println();

        }
        System.out.println(a);

    }
}
