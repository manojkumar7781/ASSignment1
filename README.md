# ASSignment1
1) import java.util.*;
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






2)import java.util.*;
interface op{
void X(String a,String b);
}
public class opertion{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String A,B;int c;
A=sc.nextLine();
B=sc.nextLine();
c=sc.nextInt();
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
default:{
System.out.println("Invalid Operation");
break;
}
}
}
}










3)import java.util.*;
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
