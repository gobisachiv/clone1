package org.strringg;

public class LitString {
public static void main(String[] args) {
	String s1="sachiv";
	String s2="sachiv";

	System.out.println("literal string");
	System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));

String s3=new String("sachiv");
String s4=new String("sachiv");

System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));







}
} 
