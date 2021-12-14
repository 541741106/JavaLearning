public class Point
{
	int x;
	int y;
	
	public Point(){
		this.x = 0;//set x to 0
		this.y = 0;//set y to 0
	
	}
	
	public Point(int x,int y){//the same name with Attributes
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point){//Copy Constructor,an object as parament
		this.x = point.x;
		this.y = point.y;
	}	
}