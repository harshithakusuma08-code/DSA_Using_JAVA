import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter a number:");
        int x=sc.nextInt();
        Solution s=new Solution();
        System.out.print("Number of digits: " + s.countdigits(n));
        System.out.print("\nReverse of the number : " + s.Reverse(n));
        System.out.println();
        s.Palindrome(x);
        s.GCD(n,x);
        s.LCM(n,x);
        s.Armstrong(n);
        s.Divisor(n);
        s.prime(x);
    }
}
class Solution{
    public int countdigits(int n){
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
    public int Reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public void Palindrome(int x){
        int rev=0;
        int temporary=x;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temporary==rev){
            System.out.println(temporary + " is a palindrome");
        }
        else{
            System.out.println(temporary + " is not a Palindrome");
        }
    }
    public void GCD(int n, int x){
        int gcd=1;
        for(int i=1;i<=Math.min(n,x);i++){
            if(n%i==0&&x%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of " +n+ " and "+x+ " is: "+gcd);
    }
    public void LCM(int n, int x){
        int lcm=1;
        for(int i=Math.max(n,x);i<=n*x;i++){
            if(i%n==0&&i%x==0){
                lcm=i;
                break;

            }
        }
        System.out.println("LCM of " +n+ " and "+x+ " is: "+lcm);
    }
    public void Armstrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp +  " is an Armstrong number");
        }
        else{
            System.out.println(temp + " is not an Armstrong number");
        }
    }
    public void Divisor(int n){
        System.out.println("Divisors of " +n+ " are :");
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }
    public void prime(int x){
        int count=0;
        for (int i=1;i<=x;i++){
            if(x%i==0){
                count=count+1;
            }

        }
        if (count==2){
            System.out.println(x + " is a prime number");
        }
        else{
            System.out.println(x + " is a composite number");
        }
    }
 }


