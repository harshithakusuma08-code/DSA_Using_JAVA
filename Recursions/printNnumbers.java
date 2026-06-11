import java.util.*;
class Solution{
    public void printNumbers(int count,int n){
        if(count==n+1){
            return;
        }
        System.out.println(count);
        printNumbers(count+1,n);

    }
    public void printNumbersReverse(int count,int n){
        if(count==0){
            return;
        }
        System.out.println(count);
        printNumbersReverse(count-1,n);

    }
}
public class printNnumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=1;
        Solution s=new Solution();
        s.printNumbers(count,n);
        System.out.println("Numbers in reverse order:");
        s.printNumbersReverse(n,n);


    }

}