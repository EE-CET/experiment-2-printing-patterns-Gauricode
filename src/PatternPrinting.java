import java.util.Scanner;

public class PatternPrinting {
    public static void main(String args[]){
        System.out.println("Enter the number of stars to print in a line:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }
}
