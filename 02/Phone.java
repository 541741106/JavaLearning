public class Phone
{
	int screen;
	int cpu;
	int mem;
	
	public Phone(int screen,int cpu,int mem){
		System.out.println("s");
		if (screen < 3){
			screen = 3;
		}
		System.out.println(screen + " " + cpu + " " + mem);
	}
}