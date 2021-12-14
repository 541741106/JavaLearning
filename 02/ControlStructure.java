public class ControlStructure
{
	public static void main(String[] args){
	
		System.out.println(product(6,11));//invoke method product
		
		countDown(5,0);//invoke method countDown
		
		numberSequence(1,14);//invoke method numberSequence
		
		System.out.println(insurance(3,3000));//invoke method insurance
	
	} 
	
	public static int product(int n1,int n2){
		
		int pro = 1;//the result of product
		for(;n1 <= n2 ;++n1){
			pro = pro * n1;
		}
		return pro;
	}
	
	public static void countDown(int n1,int n2){
		
		while(n1 >= n2){
			
			System.out.print(n1 + " ");
			n1 = --n1;
			
		};//loop stop when n1 < n2
		
		System.out.println();//new line
	}
	
	public static void numberSequence(int n1,int n2){
		
		for(;n1 <= n2;n1 += 2){
			
			System.out.print(n1 + " ");
			
		}
		System.out.println();//new line
	}
	
	public static double insurance(int g,double w){//g is the amount of accidents,w is the price of the vehicle
		
		double m = 0.5;
		double bP = 0.0;//basic premium
		double iC = 0.0;//insurance charge
		
		switch(g){//select the value of basic premium
			case 1:bP = 33.0;break;
			case 2:bP = 64.0;break;
			case 3:bP = 85.0;break;
			case 4:bP = 112.0;break;
		}
		
		iC = bP + m * w;//VB = G + mW
		
		return iC;
	}
}