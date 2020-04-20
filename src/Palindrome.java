import java.util.Stack;

public class Palindrome {
    public String str = "Able was I ere I saw Elba";
    public char[] charsArray;
    public Stack<Character> characterStack;

    public Palindrome(){
        characterStack = new Stack<>();
        convertToArray();
    }
    public void convertToArray(){
        charsArray = str.toCharArray();
    }

    public boolean isPalindrome(){
        for (char ch : charsArray){
            characterStack.push(ch);
        }
        for (char ch : charsArray){
            if (ch != characterStack.pop()){
                return false;
            }
        }
        return true;
    }

}
