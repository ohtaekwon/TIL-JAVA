package test1;

public class Test {

	public static void main(String[] args) {
		MyProfile m1=new MyProfile();
		m1.setProfile("전은수", 32, 160.5, '여', true);//호출
		System.out.println(m1);
		m1.printProfile();
		
		MyProfile m2=new MyProfile();
		m2.setProfile("홍길동", 28, 180.5, '남', true);//호출
		System.out.println(m2);
		m2.printProfile();

	}

}
