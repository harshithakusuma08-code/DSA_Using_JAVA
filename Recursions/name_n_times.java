import java.util.*;
class Solution{
    public void printName(String name,int count,int n){
        if(count==n){
            return;
        }
        System.out.println(name);
        printName(name,count+1,n);

    }
}
public class name_n_times{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name:");
        String name=sc.next();
        System.out.print("Enter no.of times the name to be printed:");
        int n=sc.nextInt();
        int count=0;
        Solution s=new Solution();
        s.printName(name,count,n);

    }
}