import java.util.Scanner;

public class printing_alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i+=2) {
            char letter = s.charAt(i);
            int x = Character.getNumericValue(s.charAt(i + 1));
            for (int j = 0; j < x; j++) {
                st.append(letter);
            }
        }
        System.out.println(st.toString());
    }

        }


