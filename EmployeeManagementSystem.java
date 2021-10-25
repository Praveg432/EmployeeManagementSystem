import java.util.Scanner;
import java.io.*;
class Info
{
	boolean flag=false;
	int id;
	String name;
	double bs;
	double da;
	double ta;
	double hra;
	double ts;
	void enterInfo(int id,String name,double bs,double da,double ta,double hra)
	{
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.da=da;
		this.hra=hra;
		this.ta=ta;
		ts=bs+ta+da+hra;
		flag = true;
	}
	void displayRecords(String key)
	{	
		if((key.equals(name))&&flag)
		{System.out.println("\t\t\tEmployee Information : \n\t\t\tid= "+id+"\n\t\t\tname = "+name+"\n\t\t\tSalary = "+bs+"\n\t\t\tHRA = "+hra+"\n\t\t\tTA = "+ta+"\n\t\t\tDA = "+da+"\n\t\t\tTotal Salary = "+ts);}
	}
	void displayRecords(int key)
	{	
		if((key==id)&&(flag==true))
		{System.out.println("\t\t\tEmployee Information : \n\t\t\tid= "+id+"\n\t\t\tname = "+name+"\n\t\t\tSalary = "+bs+"\n\t\t\tHRA = "+hra+"\n\t\t\tTA = "+ta+"\n\t\t\tDA = "+da+"\n\t\t\tTotal Salary = "+ts);}
	}
	void displayRecords()
	{	if(flag==true)
		{System.out.println("\t\t\tEmployee Information : \n\t\t\tid= "+id+"\n\t\t\tname = "+name+"\n\t\t\tSalary = "+bs+"\n\t\t\tHRA = "+hra+"\n\t\t\tTA = "+ta+"\n\t\t\tDA = "+da+"\n\t\t\tTotal Salary = "+ts);}
	}
	void editRecord(int key)
	{
		if((key==id)&&flag)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tEnter Name of Employee ");
		System.out.print("\t\t\t");
		name=sc.next();
		System.out.println("\t\t\tEnter Employee Basic Salary");
		System.out.print("\t\t\t");
		bs=sc.nextDouble();
		System.out.println("\t\t\tEnter Employee DA");
		System.out.print("\t\t\t");
		da=sc.nextDouble();
		System.out.println("\t\t\tEnter TA");
		System.out.print("\t\t\t");
		ta=sc.nextDouble();
		System.out.println("\t\t\tEnter HRA :");
		System.out.print("\t\t\t");
		hra=sc.nextDouble();
		ts=bs+ta+da+hra;
		flag = true;
		}
	}
	void deleteRecord(int key)
	{
		if(key==id&&flag)
		{
		flag=false;
		}
	}
}
class EmployeeManagementSystem extends Info
{	public static void main(String[] arg)throws InterruptedException , IOException
	{
		try
		{
		int c=0,ch;
		Scanner sc1=new Scanner(System.in);
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("\n\n\n\t\t\tWelcome to Employee Management System");
		Info[] ob=new Info[20];
		for(int i=0;i<20;i++)
		{
		ob[i]=new Info();
		}
		do
		{
			System.out.println("\n\n\n\t\t\tEnter : \n\t\t\t1> To enter Employee details\n\t\t\t2>To Display employee info\n\t\t\t3> To Edit Employee Details\n\t\t\t4>To delete Employe Details\n\t\t\t5>To Exit");
			System.out.print("\t\t\t");
			ch=sc1.nextInt();
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			sameid:
			switch (ch)
			{
			case 1:
				System.out.println("\n\n\n\t\t\tEnter id of employee ");
				System.out.print("\t\t\t");
				int idx=sc1.nextInt();
				for(int i=0;i<c;i++)
				{
					if(ob[i].id==idx)
					{
						System.out.println("ID already exists");
						break sameid;
					}
				}
				System.out.println("\n\t\t\tEnter Name of Employee ");
				System.out.print("\t\t\t");
				String namex=sc1.next();
				System.out.println("\n\t\t\tEnter Employee Basic Salary");
				System.out.print("\t\t\t");
				double bsx=sc1.nextDouble();
				System.out.println("\n\t\t\tEnter Employee DA");
				System.out.print("\t\t\t");
				double dax=sc1.nextDouble();
				System.out.println("\n\t\t\tEnter TA");
				System.out.print("\t\t\t");
				double tax=sc1.nextDouble();
				System.out.println("\n\t\t\tEnter HRA :");
				System.out.print("\t\t\t");
				double hrax=sc1.nextDouble();
				ob[c].enterInfo(idx,namex,bsx,tax,dax,hrax);
				c++;
			break;
			case 2:
				System.out.println("\n\n\n\t\t\tEnter 1 to Display info by name \n\t\t\tEnter 2 to display by id \n\t\t\tEnter 3 to display all Employee info");
				System.out.print("\t\t\t");
				int ch2=sc1.nextInt();
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				switch (ch2)
				{
				case 1:
				System.out.println("\n\n\n\t\t\tEnter name of employee");
				System.out.print("\t\t\t");
				String name1=sc1.next();
				for(int i=0;i<c;i++)
				{
					ob[i].displayRecords(name1);
				}
				break;
				case 2:
				System.out.println("\n\n\n\t\t\tEnter id of employee");
				System.out.print("\t\t\t");
				int id1=sc1.nextInt();
				for(int i=0;i<c;i++)
				{
					ob[i].displayRecords(id1);
				}
				break;
				case 3:
				for(int i=0;i<c;i++)
				{
					ob[i].displayRecords();
				}
				break;
				default:
				System.out.println("\n\n\n\t\t\tInvalid Input returning to main screen : ");
				}
			break;
			case 3:
				System.out.println("\n\n\n\t\t\tEnter id of employee");
				System.out.print("\t\t\t");
				int id2=sc1.nextInt();
				for(int i=0;i<c;i++)
				{
					ob[i].editRecord(id2);
				}
			break;
			case 4:
				System.out.println("\n\n\n\t\t\tEnter id of employee");
				System.out.print("\t\t\t");
				int id3=sc1.nextInt();
				for(int i=0;i<c;i++)
				{
					ob[i].deleteRecord(id3);
				}
			break;
			case 5:
			break;
			default:
				System.out.println("\n\n\n\t\t\tInvalid input");
			}
			if(ch!=5)
			{
				System.out.println("\n\n\n\t\t\tEnter :\n\t\t\t1 to return to main screen \n\t\t\t2 to exit");
				System.out.print("\t\t\t");
				ch=sc1.nextInt();
				if(ch==2)
				{
					ch=5;
				}
			}
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}while(ch!=5);
		}//closing try block
		catch(Exception e)
		{}
		finally
		{new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("\n\n\n\t\t\tThank You");
		}
	}
}