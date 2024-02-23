package myjava;
import java.util.Random;
import java.util.Scanner;

public class Project {
	
	

		public static void main(String[] args) {
			Random ob=new Random();
			int n;
			Scanner sc=new Scanner(System.in);
			int guess;
			int limit=15;
			int times=0;
			int score=0;
			while(true)
			{
				n=ob.nextInt(100);
				System.out.print("Enter the number for guess:\n");
				guess=sc.nextInt();
				if(n==guess)
				{
					System.out.println("You Won.!");
					score++;
				}
				else if(n>guess)
				{
					System.out.println("Too Low.. and System Number is:\n"+n);
					times++;
				}
				else
				{
					System.out.println("Too Hign.. and System Number is:"+n);
					times++;
				}
				
				if(limit==times)
				{
					System.out.println("Your Limit is Completed.. Try Again  ..and Your score is:"+score);
					break;
				}
			}

		}

	}

