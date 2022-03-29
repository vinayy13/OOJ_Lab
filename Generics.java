import java.util.Scanner;

class MultiGen<T,U,V>{

T obj1;
U obj2;
V obj3;

	MultiGen (T obj1,U obj2, V obj3 ){
	this.obj1=obj1;
	this.obj2=obj2;
	this.obj3=obj3;
	}

	void display(){
	System.out.println("\n Value of obj1  :>"+obj1);
	System.out.println("\t Type  of "+ obj1+ " is " + obj1.getClass().getName());
	System.out.println("\n Value of obj2  :>"+obj2);
	System.out.println("\t Type  of "+ obj2+ " is " + obj2.getClass().getName());
	System.out.println("\n Value of obj3  :>"+obj3);
	System.out.println("\t Type  of "+ obj3+ " is " + obj3.getClass().getName());
	}
}

class generics{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

	System.out.println("\n enter the Integer value -->");
	int val1=sc.nextInt();
	System.out.println("\n enter the String value -->");
	String val2=sc.next();
	System.out.println("\n enter the double value -->");
	Double val3=sc.nextDouble();
	System.out.println("\n enter the Integer value -->");
	int val4=sc.nextInt();
	System.out.println("\n enter the String value -->");
	String val5=sc.next();
	System.out.println("\n enter the double value -->");
	Double val6=sc.nextDouble();
	
	MultiGen <Integer,String,Double> g1 =new MultiGen <Integer,String,Double>(val1,val2,val3);
	MultiGen <Integer,String,Double> g2 =new MultiGen <Integer,String,Double>(val4,val5,val6);
	g1.display();
	g2.display();
 
 }
}
