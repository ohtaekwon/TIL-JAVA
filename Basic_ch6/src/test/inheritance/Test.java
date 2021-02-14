package test.inheritance;
public class Test extends Object{
	public static void main(String[] args) {
		Object o=new Object();
		System.out.println(o.toString());
		
		Object a=new A();
		//a.i++; shadow effect
		//a.printI();
		System.out.println(a);
		System.out.println(a.toString());//주소값
		
		Object b=new B();
		//b.x++;
		//b.printX();
		//b.i++;
		//b.printI();	
		System.out.println(b);
		System.out.println(b.toString());//주소값

	}

}
