import java.util.*;
import java.io.*;
public class SavingAmount{
	int saving;
	public void setter(int saving){
		this.saving=saving;
	}
	public int getter(){
     return saving;
	}
	public void increment(){
		saving=saving+1000;
	} 
	public void decrement(){
		saving=saving-100;
	}
	public void checkSavings(){
		if(saving>=1000){
			System.out.println("Congratulations!You have saved a good amount");
		}
		else if(saving<1000 && saving>0)
		{
			System.out.println("Insufficient saving!");
		}
		else 
		{
			System.out.println("You are in debt");
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int TotalSavings;
		int s=sc.nextInt();
		SavingAmount o=new SavingAmount();
		o.setter(s);
		o.increment();
		o.decrement();
		o.checkSavings();
		System.out.println("Your current savings are Rs "+o.getter());


	}
}