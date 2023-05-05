package stringPrograms;

public class PrintStringMultipleTimes {

	public static void main(String[] args) {
		String name="anusha";
		String s="i";
		s=s.replaceAll("i","iiiiiiiiii");//10
		s=s.replaceAll("i", "iiiiiiiiiii");//10*10=100
		s=s.replaceAll("i", name +"\n");
		System.out.println(s);
	}

}
