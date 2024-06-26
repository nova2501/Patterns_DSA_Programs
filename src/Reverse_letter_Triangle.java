public class Reverse_letter_Triangle {
    static void reverse_letter(int n)
    {
        for(int i=n;i>0;i--)
        {
            char c=65;
            for(int j=i;j>0;j--)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverse_letter(5);
    }
}
