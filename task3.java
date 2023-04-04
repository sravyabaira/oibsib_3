import java.util.*;
class ATM
{
	int amount=1000,c=-1;
	String s[]=new String[10];
	int a[]=new int[10];
	void TransactionHistory()
	{
		for(int i=0;i<=c;i++)
		{
			System.out.println(s[i]+"   "+a[i]);
			System.out.println( );
		}
	}
	void withdraw(int am)
	{
		if(am>amount) 
		{
			System.out.println("Insufficient Balance");
			System.out.println( );
		}
		else
		{
			amount=amount-am;
			c++;
			s[c]="withdraw";
			a[c]=am;	
		}
	}
	void Deposit(int am)
	{
		amount=amount+am;
		c++;
		s[c]="Deposit";
		a[c]=am;
	}
	void Transfer(int am)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id TO Transfer: ");
		int id1=sc.nextInt();
		amount=amount-am;
		c++;
		s[c]="Transfer";
		a[c]=am;
	}
	void Quit()
	{
		System.out.println("you are successfully Quit!!!");
		System.exit(0);
	}
}
class main
{
	public static void main(String[] args)
	{
		ATM a=new ATM();
		Scanner sc=new Scanner(System.in);
		int id[]=new int[5];
		int password[]=new int[5];
		id[0]=23457;
		password[0]=1234;
		id[1]=34357;
		password[1]=1445;
		id[2]=46257;
		password[2]=3674;

		int id1,password1;
		System.out.println("Enter your Id: ");
		id1=sc.nextInt();
		System.out.println( );
		System.out.println("Enter your password: ");
		password1=sc.nextInt();
		System.out.println( );
		int f=0;
		for(int i=0;i<5;i++)
		{
			if(id1==id[i] && password1==password[i])
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
			if(f==0)
			{
				System.out.println("invalid login!!");
				System.out.println( );
			}
			else
			{
				System.out.println("you are successfully logged in!!!");
				System.out.println( );
				int s=1;
				while(s==1)
				{
					int opt;
					System.out.println("Enter your option");
					System.out.println( );
					System.out.print("1.TransactionHistory\n2.withdraw\n3.Deposit\n4.Transfer\n5.Quit\n");
					System.out.println( );
					opt=sc.nextInt();
					switch(opt)
					{
						case 1:
							a.TransactionHistory();
							break;
						case 2:
							int am;
							System.out.println("Enter the withdraw amount:");
							am=sc.nextInt();
							a.withdraw(am);
							break;
						case 3:
							int amo;
							System.out.println("Enter the Deposit amount:");
							amo=sc.nextInt();
							a.Deposit(amo);
							break;
						case 4:
							int amu;
							System.out.println("Enter the Transfer amount:");
							amu=sc.nextInt();
							a.Transfer(amu);
							break;
						case 5:
							a.Quit();
							break;
				}
			}
		}
	}
}