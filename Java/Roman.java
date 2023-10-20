import java.util.HashMap;
import java.util.Scanner;

public class Roman {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0; // Initialize the previous value to zero

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue; // Update the previous value
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumber ;
        Scanner sc= new Scanner(System.in );
        romanNumber= sc.next();
        int integerEquivalent = romanToInt(romanNumber);
        System.out.println("Roman numeral " + romanNumber + " is equivalent to " + integerEquivalent);
    }
}

