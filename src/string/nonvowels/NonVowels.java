package string.nonvowels;
public class NonVowels {
    void start(String a){
        int count=0,max=0;
        char [] A= a.toCharArray();
        for (int i=0;i<A.length;i++){ // for replacing vowels and finding largest length of the substring
            if (A[i]=='a'||A[i]=='e'||A[i]=='i'||A[i]=='o'||A[i]=='u'){
                A[i]='*';
                if (count>max) {
                    max=count;  // Storing the substring length in 'max' variable.
                }
                count=0;  // Reseting the count once reaching a vowel.
            }
            else {
                count++;  // length of substring
                if (i==A.length-1){  // On reaching the last element the count must be checked whether it is the largest.
                    if (count>max) max=count;  
                }
            }
        }
        count=0;
        int n=0;
        for (int i=0;i<A.length&&max!=0;i++){ // Printing the largest substrings
            if (A[i]!='*')count++;
            else if (A[i]=='*'){  
                if (count==max) {  // On reaching '*' the lenth of the substring is checked with 'max' and printed if it is the largest.
                    if (n!=0) System.out.print(", ");  // for more than one largest substring, they are separated by ','. 
                    for (int j= i-count;j<i;j++) System.out.print(A[j]);
                    n++;  // The number of substrings printed.
                }
                count=0;  // Reseting the count for checking the length of the next substring.
            }
        }
    }
}
