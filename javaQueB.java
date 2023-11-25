import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);

        if (result == -1) {
            System.out.println("Invalid Roman numeral entered.");
        } else {
            System.out.println("Integer representation: " + result);
        }
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentDigitValue = getValue(s.charAt(i));

            if (currentDigitValue == -1) {
                return -1;        }

            if (i < s.length() - 1) {
                int nextDigitValue = getValue(s.charAt(i + 1));

                if (nextDigitValue > currentDigitValue) {
                    result += (nextDigitValue - currentDigitValue);
                    i++; 
                } else {
                    result += currentDigitValue;
                }
            } else {
                result += currentDigitValue;
            }
        }

        return result;
    }

    public static int getValue(char romanDigit) {
        switch (romanDigit) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
