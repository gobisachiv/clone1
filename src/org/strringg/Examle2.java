package org.strringg;

public class Examle2 {
public static void main(String[] args) {
	String s1="hai";
	String s2="helo";
	String con=s1.concat(s2);
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(con));
	
	
	StringBuffer s3=new StringBuffer("hai");
	StringBuffer s4=new StringBuffer("helo");
	StringBuffer app=s3.append(s4);
	
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(app));
	
}
}
