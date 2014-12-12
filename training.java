import java.lang.Math;
abstract class Figure{
	abstract int area();
	abstract void draw();
}
class Circle extends Figure{
	private int radius;
	private int[] mid;
	Circle(int[] mid, int radius){
		this.mid = mid;
		this.radius = radius;
	}
	public void draw(){
		//drawdrawdrawdrawdraw
	}
	public int area(){
		return (int) (3.1416*Math.pow(radius, 2));
	}
}
class Line extends Figure{
	protected int[] point1,point2;
	Line(int[] point1, int[] point2){
		this.point1 = point1;
		this.point2 = point2;
	}
	public void draw(){
		//drawdrawdrawdrawdraw
	}
	public int area(){
		return 0;
	}
}
class Rectangle extends Figure{
	private int[] leftUp, rightDown;
	Rectangle(int[] leftUp, int[] rightDown){
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public void draw(){
		//Drawdrawdrawdrawdraw
	}
	public int area(){
		return Math.abs((leftUp[0]-rightDown[0])*(leftUp[1]-rightDown[1]));
	}
}


public class training {
	public static void main(String args[]){
		
	}
}
