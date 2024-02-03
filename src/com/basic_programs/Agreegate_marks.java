package com.basic_programs;
/*/If the marks obtained by a student in five different subjects are input through the keyboard, find out the aggregate marks and percentage marks obtained by the student. 
Assume that the maximum marks that can be obtained by a student in each subject is 100*/
import java.util.*;
public class Agreegate_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter five subject marks:");
int s1=s.nextInt();
int s2=s.nextInt();
int s3=s.nextInt();
int s4=s.nextInt();
int s5=s.nextInt();
int sum=s1+s2+s3+s4+s5;


int per=sum/5;
System.out.println("sum="+sum);

System.out.println("percentage="+per);

	}

}
