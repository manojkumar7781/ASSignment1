import java.util.*;
class Secret{
	void Asia(String w)
	{
		for(int i=0;i<w.length();i++){System.out.println((char)(w.charAt(i)+2));}
	}
	void US(String w)
	{
		for(int i=0;i<w.length();i++){System.out.print((((int)w.charAt(i))+2)+".");}
		System.out.println();
	}
	void Dubai(String w)
	{
		StringBuilder res = new StringBuilder();
        res.append(w); 
        res=res.reverse();
        System.out.println(res);
	}
}
public class SecretOp extends Secret {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> S=new ArrayList<String>();
		for(int i=0;i<n;i++){String s=sc.nextLine();S.add(s);}
		int[] L=new int[n];
		for(int i=0;i<n;i++){L[i]=sc.nextInt();}
		Secret s=new Secret();
		for(int i=0;i<n;i++)
		{
			switch(L[i])
			{
			case (0):{
				s.Asia(S.get(i));
				break;
			}
			case (1):{
				s.US(S.get(i));
				break;
			}
			case(2):{
				s.Dubai(S.get(i));
				break;
			}
			default:{
				System.out.println("Invalid Locale");
				break;
			}
			}
		}
		sc.close();
	}
}