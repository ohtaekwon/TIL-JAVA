package test.shape;
public class Test {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(5);
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		
		Printer out=new Printer();
		out.print((Shape)c);
		out.print(c);
		out.print(c);
		out.print(r);
		out.print(t);
		//out.print("java");
	}
}
