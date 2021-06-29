/*
Print the largest substring of non-vowels between two vowels.

        Sample input: alphabet
        Sample output: lph

        Sample input: america
        Sample output: m,r,c
*/
package string.nonvowels;
import java.util.Scanner;
public class Test {
    public static void main(String [] abc){
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        new NonVowels().start(a);
    }
}
