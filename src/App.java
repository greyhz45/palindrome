import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = input.nextLine();

        palindromeCheck(str);
    }

    static void palindromeCheck(String str) {
        int mid = str.length() / 2;
        int last = str.length() - 1;
        String[] arr = str.toUpperCase().split("");
        boolean isPalindrome = true;

        for(int x = 0; x < mid; x++) {
            if(arr[x].equals(arr[last])) {
                last--;
                continue;
            } else {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
