package test.stmt;

public class DoWhileTest {

	public static void main(String[] args) {
		int i=100;
		do{
			System.out.println(i);
			i++;
		}while(i<100);
		System.out.println("i="+i);
	}

}
