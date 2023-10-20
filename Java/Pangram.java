import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String str) {
       
        str = str.replaceAll(" ", "").toLowerCase();
        
        HashSet<Character> set = new HashSet<>();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        
     
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String input ;
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine();
        boolean result = isPangram(input);
        
        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

