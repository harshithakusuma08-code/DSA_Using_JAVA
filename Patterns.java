class Solution {
    int i,j;
    public void pattern1(int n){
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void pattern5(int n) {
        for( i=0;i<n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public void pattern6(int n) {
        for( i=0;i<n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
    public void pattern7(int n){
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=2*i;j++){
                System.out.print("*");
            }
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern9(int n){
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=n;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern10(int n){
        for(i=0;i<=n;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(j=n;j>=i;j--){
                System.out.print("* ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Function to print the erect (upright) pyramid
    public void erectPyramid(int N) {
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Patterns {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.pattern1(5);
        System.out.println();
        s.pattern2(5);
        System.out.println();
        s.pattern3(5);
        System.out.println();
        s.pattern4(5);
        System.out.println();
        s.pattern5(5);
        System.out.println();
        s.pattern6(5);
        System.out.println();
        s.pattern7(5);
        System.out.println();
        s.pattern8(5);
        System.out.println();
        s.pattern9(5);
        System.out.println();
        s.pattern10(5);
        System.out.println();
        s.erectPyramid(5);
        System.out.println();

    }
}