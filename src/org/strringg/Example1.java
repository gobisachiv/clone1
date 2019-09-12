package org.strringg;

public class Example1 {
public static void main(String[] args) {
	String s1="hai";
String s2="hai";
	
System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));


String s3=new String("hai");
String s4=new String("hai");

System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));







}
}
