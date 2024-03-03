
import java.util.*;


interface AtmInterface {
	
	public void withDraw(int a);
	public void deposit(int a);
	public long checkBalance();

}

 class AccountDetals implements AtmInterface{
	 int balance;
	 
	 AccountDetals(int a)
	 {
		 balance=a;
	 }
	
	public void withDraw(int a)
	{
		
		if(balance<a)
		{
			System.out.println("******   __ InSufficient Balance__ **********");
			return ;
			
		}
		
		long result=balance -a;
		
		System.out.println("****** _The Balance is_*******:"+result);
	}
	
	public  void deposit(int a)
	{
		long result=balance+a;
		balance+=a;
		
		System.out.println("*****_Total Balance  is_******:"+result);
	}
	public long checkBalance()
	{
		return balance;
	}
}
 
 
 
class Customer{
	 
	 String cutName;
	 int password;
	 int Accountbalance;
	 //constructor
	 public Customer(String name,int pass)
	 {
		 this.cutName=name;
		 this.password=pass;
		 this.Accountbalance=0;
		 
	 }
	 
	 public void custDetails(String name,int pass)
	 {
		
		 String custname=name;
	
		 password=pass;
		 System.out.println("*****_ACCOUNT    CREATED_*****   ");
		 
	 }
	
	 
	 
	 
 }

class Atm{
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
	
		
		System.out.println("__Enter a user name__:");
		
		String name=sc.nextLine();
		System.out.println("__Enter a password__:");
		int pass=sc.nextInt();
		
		Customer ob1=new Customer(name ,pass);
		
		
		
		
		
		//Accountdetais class
		System.out.println("_Enter a Money for Account Open__:");
		int amout=sc.nextInt();
		
		AccountDetals ob=new AccountDetals(amout);
		
		boolean t=true;
		
		while(t) {
		System.out.println("SELECT AN OPtiON   :");
		System.out.println("1:deposit:");
		System.out.println("2:withdraw:");
		System.out.println("3:checkbalance:");
		System.out.println("4:exit:");
		
		
		int ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("__Enter a Amount:__");
		 		int am=sc.nextInt();
		 		ob.deposit(am);
		 		break;
		 		
		 case 2:System.out.println("__Enter a Amount__:");
	 		int am1=sc.nextInt();
	 		ob.withDraw(am1);
	 		break;
	 		
		 case 3:
			 	long c=ob.checkBalance();
			 	System.out.println("****_Total Amount is_*****:"+c);
			 	
			 	break;
			 	
		 case 4:
			 	t=false;
			 	break;
		default:
			System.out.println("__Enter correct option__:");
		 }
		
		
		}
		
		
		
		
		
	}
	
	
}
 

