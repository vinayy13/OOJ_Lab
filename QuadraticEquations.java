import java.util.*;

class QuadraticEquations{
    public static void main(String args[]){
        int a,b,c,d;
        double r1,r2;
        Scanner s= new Scanner(System.in);
        System.out.println("\nFinding quadratic equations");
        System.out.println("Enter values for a, b, c:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = (b*b)-(4*a*c);
        if(d==0){
            System.out.println("\nRoots are real and equal!");
            r1 = ((-b+Math.sqrt(d))/(2*a));
            System.out.println("Root is : " + r1 + "\n");
        }
        else if(d>0){
            System.out.println("\nRoots are real and distinct!");
            r1 = ((-b+Math.sqrt(d))/(2*a));
            r2 = ((-b-Math.sqrt(d))/(2*a));
            System.out.println("Roots are : " + r1 + " and " + r2 + "\n");
        }
        else {
            System.out.println("\nRoots are imaginary!\n");
        }
    }
}