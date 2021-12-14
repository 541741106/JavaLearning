public class JavaCode {
	public static void main(String[] args){
		StringBuilder s = new StringBuilder
			("\u0435\u0555\u02B5\u0555\u0BB5\u3534\u3525\u352C\u3526\u352B\u3530");
	    int b = s.length();
		int a = b >> 1;
		for (int i = 0; i < a; i++) {
			int j = 0x1175 - s.charAt(i);
			s.setCharAt(i,(char)(j << b ^ j >> a));
		}
		System.console().format("%s%n", System.getProperty(s.toString()));
	}
}