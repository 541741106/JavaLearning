public class Rectangle
{
	int a;
	int b;//the two side length of the rectangle 
	
	public Rectangle(int a,int b){//constructor rectangle defined
		this.a = a;
		this.b = b;
	}
	public int surface(){//object method with out parament 
		int sur;//variable surface
		sur = this.a * this.b;
		return sur;
	}
	
	//overload of class method and object method
	public static int surface(Rectangle r){//class method overload with object as paraments
		int sur;//variable surface
		sur = r.a * r.b;
		return sur;
	}
}
