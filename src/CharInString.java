import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        String str;
        char character = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        System.out.println("The number of occurrences of " + character +
                " in the sequence: " + str + " is " + count);
    }
}



