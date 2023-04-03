package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;

import pageobject.homepage;
import pageobject.signin;
import pageobject.Array;
import pageobject.Datastructure;
import pageobject.Graphpage;
import pageobject.Linkedlist;
import pageobject.Queue;
import pageobject.Register;
import pageobject.Stack;
import pageobject.Treepage;
import pageobject.getstart;

public class Testcase extends BaseClass {
	getstart gs = new getstart();
	homepage hp =new homepage();
	Register rg = new Register();
	signin sg = new signin();
	Array as = new Array();
	Stack sk = new Stack();
	Treepage tp =new Treepage();
	Graphpage gp = new Graphpage();
    Datastructure ds = new Datastructure();
    Linkedlist ll =new Linkedlist();
    Queue qu = new Queue();
    
		
	@Test(priority=1)
	public void setup()
	{
		Launch();
		
		gs.Getstart();
		
	}
	

	//@Test(priority=2)
	 public void Register() {
		 rg.Reg();
	 }
	
	
	@Test(priority=3)
	public void home() {
		
		//hp.Register();
		
		hp.singin();
		
		hp.dropdown();
		
		hp.Arrays();
		
		hp.stack();
		
	}
	
	@Test(priority=4)
	public void signin() throws InterruptedException, IOException {
		sg.Signin();
		System.out.println("completed sign");
		/*sg.logoutonly();
		System.out.println("completed logout");
		sg.signInValid();
		System.out.println("completed invalid sign");
		sg.logout();
		System.out.println("completed logout");
		sg.signinExcel();
		System.out.println("completed excel");
		*/
		
		
	}

	
	@Test(priority=5)
	public void Datastructure () throws Exception
	{
		//ds.dropdown();
		ds.datastructureopen();
		ds.PracticeQ();
		
	}
	
	@Test(priority=6)
	public void Array () throws IOException
	{
		as.dropdown();
		as.performarray();
		as.practiceQsearcharray();
		//as.maxconsecutiveone();
		//as.findnumbers();
		//as.square();
		
	}

	
	@Test(priority=7)
	public void Linkedlist () throws Exception
	{
		ll.dropdown();
		ll.LList1();
		ll.PracticeQ();
	}
	
	@Test(priority=8)
	
	public void Stack () throws IOException 
	{
		sk.dropdown();
		sk.performancestack();
	}
	
	@Test(priority=9)
	public void Queue () throws Exception
	{
	 qu.dropdown();
	 qu.Quesel();
	 qu.performQueue();
	 qu.practiceQ();
	}
	
	
	@Test(priority=10)
	public void Treepage () throws IOException, InterruptedException
	
	{
		tp.clickTree();
		tp.Tree();
		tp.PracticeQ();
		
	}
	
	@Test(priority=11)
	public void Graphpage () throws IOException, InterruptedException
	{
		gp.clickGraph();
		gp.AccessGraph();
		gp.practiceQ();
		
	}
	
	
	
	
	
	
/*
	@Test(priority=4)
	public void teardown()
	{
		driver.quit();
	}
*/
}

