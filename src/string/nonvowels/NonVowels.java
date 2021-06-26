package string.nonvowels;
public class NonVowels {
    void start(String a){
        int count=0,max=0;
        char [] A= a.toCharArray();
        for (int i=0;i<A.length;i++){// for replacing vowels and dinging largest length of substring
            if (A[i]=='a'||A[i]=='e'||A[i]=='i'||A[i]=='o'||A[i]=='u'){
                A[i]='*';
                if (count>max) {
                    max=count;
                }
                count=0;
            }
            else {
                count++;// length of substring
                if (i==A.length-1){
                    if (count>max) max=count;
                }
            }
        }
        count=0;
        int n=0;
        for (int i=0;i<A.length&&max!=0;i++){// Printing the largest substrings
            if (A[i]!='*')count++;
            else if (A[i]=='*'){
                if (count==max) {
                    if (n!=0) System.out.print(", ");
                    for (int j= i-count;j<i;j++) System.out.print(A[j]);
                    n++;
                }
                count=0;
            }
        }
    }
}
