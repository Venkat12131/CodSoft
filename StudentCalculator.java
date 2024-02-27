package Student;
import java.util.*;
public class StudentCalculator {
	static int subject;

	public StudentCalculator(int n) {
		this.subject=n;
		
	}
	static int sum=0;
	static Scanner sc=new Scanner(System.in);
	public static void Marks()
	{
		for(int i=1;i<=subject;i++)
		{
			System.out.println("Enter the marks for "+i+" "  +"Subject:");
			int marks=sc.nextInt();
			sum=sum+marks;			
		}
		//total sum of marks
		System.out.println("----------Total Marks is ---------"+sum);
		
	}
	static int Avg=0;
	//this method print the average of the marks
	public static int  Avearage()
	{
		 Avg=sum/subject;
		System.out.println("---------The Average  Percentage is---------"+Avg);
		return Avg;
		
	}
	//this method returns the grade
	public static void Grade(int Avg)
	{
		int ch=Avg;
		if(Avg>89)
		{
			System.out.println("----A+ GRADE----");
		}
		else if(Avg>=80 && Avg<89){
			System.out.println("---A GRADE---");	
		}
		else if(Avg>=75&& Avg<80)
		{
			System.out.println("---B+ GRADE---");
		}
		else if(Avg>=75 && Avg<=70)
		{
			System.out.println("---B GRADE---");
		}
		else if(Avg>75  && Avg<=60)
		{
			System.out.println("---C GRADE---");
		}
			
		else if(Avg>50 && Avg<=60)
		{
			System.out.println("---D GRADE---");
		}
		else if(Avg>45 && Avg<50)
		{
			System.out.println("---PASS---");
		}
		else 
		{
			System.out.println("---FAIL---");
			
		}
	}

		
		
		
		
	

	public static void main(String[] args) {
		
		StudentCalculator ob=new StudentCalculator(6);
		ob.Marks();
		int n=ob.Avearage();
		ob.Grade(n);

	}

}
