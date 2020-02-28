import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Intdao implements  Interface_dao1{
	static ArrayList<pojo>b2=new ArrayList<pojo>();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<pojo>appointmentlist=new ArrayList<pojo>();
	static ArrayList<pojo>bl=new ArrayList<pojo>();
	
	@Override
	public void Display(ArrayList<pojo> bl) {
		// TODO Auto-generated method stub
		System.out.println("-----------DETAILS----------");
		
		Iterator<pojo> it = bl.iterator();
		while(it.hasNext())
		{
		pojo s=it.next();
			System.out.println("                     ");
        	System.out.println("User id is : "+s.getUserId());
        	System.out.println("Appointment id is : "+s.getAppointmentId());
        	System.out.println("Date is : "+s.getDate());
        	
        	System.out.println("time is : "+(s.getTime()).toString());
        	System.out.println();
        	
        }
		
	}
	@Override
		public void appointmentfix(BigInteger appointmentid) {
			// TODO Auto-generated method stub
			ArrayList<Appointment> al=new ArrayList<Appointment>();
			Scanner sc = new Scanner(System.in); 
			int n;
		Intdao obj1=new Intdao();
			do
			{   
				System.out.println(" Select the diagnostic centre ");
				System.out.println(" 1 : Kidwai Nagar ");
				System.out.println(" 2 : KANPUR ");
				System.out.println(" 3 : Delhi ");
				System.out.println(" Enter Your Choice : ");
				n = sc.nextInt();
				switch(n)
				{
				case 1: obj1.centreKidwaiNagar1(appointmentid);
			        break;
				
			    case 2:
			    obj1.centreKanpur(appointmentid);
				break;
				
				case 3:
				obj1.centreDelhi(appointmentid);
				break;
			    default :
			    	{System.out.println(" Invalid Choice ");}
				}
			} while(n<=4);
			}

	
	public 	void centreKidwaiNagar1(BigInteger appointmentid) 
	{
		String test1="Blood Test";
		String test2="Urine Test";
		String test3="CT Scan";
		String test4="MRI";
		pojo pojoobj=new pojo();
		try {
		System.out.println("1. "+test1+"\n2. "+test2+"\n3. "+test3+"\n4. "+test4);
		
			int choice=Integer.parseInt(br.readLine());
			System.out.println("Are you sure to make appointment");
			String confirm=br.readLine();
			if(confirm.equalsIgnoreCase("yes"))
			{
				pojoobj.setCentre("KidWaiNagar");
				if(choice==1)
					pojoobj.setTest(test1);
				else if(choice ==2)
					pojoobj.setTest(test2);
				else if(choice ==3)
					pojoobj.setTest(test3);
				else 
					pojoobj.setTest(test4);
				pojoobj.setAppointmentId(appointmentid);
				appointmentlist.add(pojoobj);
			}
//			Intdao o=new Intdao();
//			o.userDetails();
		
		System.out.println("0. for appointment list");
		int choice1=Integer.parseInt(br.readLine());
		if(choice1==0)
		{
			Intdao o=new Intdao();
			o.display();
		}}catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public 	void centreKanpur(BigInteger appointmentid) 
		{
		String test1="Blood Test";
		String test2="Urine Test";
		String test3="CT Scan";
		String test4="MRI";
		pojo pojoobj=new pojo();
		try {
		System.out.println("1. "+test1+"\n2. "+test2+"\n3. "+test3+"\n4. "+test4);
		
			int choice=Integer.parseInt(br.readLine());
			System.out.println("Are you sure to make appointment");
			String confirm=br.readLine();
			if(confirm.equalsIgnoreCase("yes"))
			{
				pojoobj.setCentre("Kanpur");
				if(choice==1)
					pojoobj.setTest(test1);
				else if(choice ==2)
					pojoobj.setTest(test2);
				else if(choice ==3)
					pojoobj.setTest(test3);
				else 
					pojoobj.setTest(test4);
				pojoobj.setAppointmentId(appointmentid);
				appointmentlist.add(pojoobj);
			}
//			Intdao o=new Intdao();
//			o.userDetails();
		
			System.out.println("0. for appointment list");
			int choice1=Integer.parseInt(br.readLine());
			if(choice1==0)
			{
				Intdao o=new Intdao();
				o.display();
			}
			} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public void centreDelhi(BigInteger appointmentid) 
			{

		String test1="Blood Test";
		String test2="Urine Test";
		String test3="CT Scan";
		String test4="MRI";
		pojo pojoobj=new pojo();
		try {
		System.out.println("1. "+test1+"\n2. "+test2+"\n3. "+test3+"\n4. "+test4);
		
			int choice=Integer.parseInt(br.readLine());
			System.out.println("Are you sure to make appointment");
			String confirm=br.readLine();
			if(confirm.equalsIgnoreCase("yes"))
			{
				pojoobj.setCentre("Delhi");
				if(choice==1)
					pojoobj.setTest(test1);
				else if(choice ==2)
					pojoobj.setTest(test2);
				else if(choice ==3)
					pojoobj.setTest(test3);
				else 
					pojoobj.setTest(test4);
				pojoobj.setAppointmentId(appointmentid);
				appointmentlist.add(pojoobj);
				
			}
			System.out.println("0. for appointment list");
			int choice1=Integer.parseInt(br.readLine());
			if(choice1==0)
			{
				Intdao o=new Intdao();
				o.display();
			}
//			Intdao o=new Intdao();
//			o.userDetails();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		}	
	public void display()
	{
		Iterator<pojo> it=appointmentlist.iterator();
		Iterator<pojo> uit=bl.iterator();
		while(uit.hasNext())
		{
			pojo s=(pojo) uit.next();
			System.out.println("UserID: "+s.getUserId());
			System.out.println("AppointmentId: "+s.getAppointmentId());
			System.out.println("Date: "+s.getDate());
			System.out.println("Time: "+s.getTime());
		while(it.hasNext())
		{
			pojo k=(pojo) it.next();
			if(k.getAppointmentId().equals(s.getAppointmentId()))
			{
				System.out.println("Centre Name: "+k.getCentre());
				System.out.println("Test Name: "+k.getTest());
			
			}
		}
		System.out.println();
		}
		
	}
	
	public void userDetails() {
	try {	
	BigInteger appointmentid=null;
	long x=101;
	System.out.println("Enter the userId : ");
	String uid;
	uid = br.readLine();
	System.out.println("Enter the Date as dd/mm/yyyy: ");
	String[] a=br.readLine().split("/");
	LocalDate date = LocalDate.of(Integer.valueOf(a[2]),Integer.valueOf(a[1]),Integer.valueOf(a[0]));
	System.out.println("Enter the Time as HH:M   : ");
	String []dt =br.readLine().split(":");  //default format: hh:mm:ss
	LocalTime lt=LocalTime.of(Integer.valueOf(dt[0]), Integer.valueOf(dt[1]));
	System.out.println(lt);
    appointmentid=BigInteger.valueOf(x);
	pojo obj=new pojo();
	 obj.setUserId(uid);
	 obj.setAppointmentId(appointmentid);
	 obj.setDate(date);
	 obj.setTime(lt);
	 bl.add(obj);
	 x++;
	 
	 Intdao d1 = new  Intdao();
	d1.Display(bl);
	d1.appointmentfix(appointmentid);
	
	System.out.println("Main");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}




	}
	
