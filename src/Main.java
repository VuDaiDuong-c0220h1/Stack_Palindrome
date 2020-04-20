public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome()){
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không là chuỗi Palindrome");
        }
    }
}
