package test.datatype;

import java.util.Date;

public class Test {		
		
	public static void main(String[] args) {		
		int age=32;
		double tall=160.5;
		char gender='여';
		boolean isPretty=true;
		//MemberName name=new MemberName();
		String name=new String("전은수");
		//MyDate birthday=new MyDate();
		Date birthday=new Date(1980,10,3);
		
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isPretty);
		System.out.println(name);	
		System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDate()+"일");
	}
}


