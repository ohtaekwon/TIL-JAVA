package test.shape;
public class Rectangle  extends Shape{
	private int w,h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		if(w>0) {
			this.w = w;
		}else {
			System.out.println("0보다 큰 수 입력 요");
		}
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void area() {
		System.out.println("사각형의 넓이="+(w*h));
	}

}
