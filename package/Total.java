import CIE.*;
import SEE.*;
import java.util.*;
class Total{
    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        int total[]=new int[5];
        System.out.println("Enter number of students: ");
        n=sc.nextInt();
        CIE.Student s[]=new CIE.Student[n]; 
        CIE.Internals ci[]=new CIE.Internals[n];
        SEE.Externals se[]=new SEE.Externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter student "+(i+1)+" details");
            s[i]=new CIE.Student();
            s[i].accept();
            ci[i]=new CIE.Internals();
            ci[i].accept();
            se[i]=new SEE.Externals();
            se[i].accept();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nDetails of student "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks in subject "+(j+1)+": "+total[j]);
            }
            System.out.println();
        }
    }
}