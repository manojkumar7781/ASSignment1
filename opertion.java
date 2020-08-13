/*import java.util.*;
import java.io.*;
public class opertion{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String A,B;
		int c;
		A=sc.nextLine();
		B=sc.nextLine();
		c=sc.nextInt();
		if(c==1){
			int sum=0,sum1=0;
			for(int i=0; i<A.length(); i++)
    {
      int a= A.charAt(i);
      sum = sum+a;
    }
    for(int i=0; i<B.length(); i++)
    {
      int b=B.charAt(i);
      sum1=sum1+b;
     
    }
     System.out.println(sum+sum1);
		}


		else if(c==2){
			System.out.println(A+B);
		}

		else if(c==3){
			int sum=0,sum1=0;
			for(int i=0; i<A.length(); i++)
    {
      int a= A.charAt(i);
      sum = sum+a;
    }
    for(int i=0; i<B.length(); i++)
    {
      int b=B.charAt(i);
      sum1=sum1+b;
     
    }
     System.out.println(sum+sum1);

		}


		else{
			System.out.println("Not valid");
		}

	}

}*/


import java.util.*;
interface op{
	void X(String a,String b);
}
public class opertion{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A,B;int c;
		A=sc.nextLine();B=sc.nextLine();c=sc.nextInt();
		op X1=(String a,String b)->{System.out.println((Integer.parseInt(a)+Integer.parseInt(b)));};
		op X2=(String a,String b)->{System.out.println(a+b);};
		op X3=(String a,String b)->{
			int ascii=0;
			for(int i=0;i<b.length();i++){ascii+=b.charAt(i);}
			System.out.println((Integer.parseInt(a)+ascii));
		};
		switch(c)
		{
		case (1):
			X1.X(A,B);
			break;
		case (2):
			X2.X(A,B);
			break;
		case (3):
			X3.X(A,B);
		}
	}
}