package string.nonvowels;
import java.util.Scanner;
public class Test {
    public static void main(String [] abc){
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        new NonVowels().start(a);
    }
}
