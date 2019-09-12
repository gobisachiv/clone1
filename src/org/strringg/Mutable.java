package org.strringg;

public class Mutable {
public static void main(String[] args) {
	String s1="kalai";
	String s2="kalai";
String con=s1.concat(s2);

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(con));

StringBuffer s3=new StringBuffer("kalai");
StringBuffer s4=new StringBuffer("kalai");
StringBuffer app=s3.append(s4);

System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));
System.out.println(System.identityHashCode(app));



}

}
