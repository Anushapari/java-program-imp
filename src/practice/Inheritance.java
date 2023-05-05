package practice;
class Language
{
	public static void lan()
	{
		System.out.println("kannada and english subjects");
	}
}
class Science extends Language
{
	public static void Pcmb()
	{
		System.out.println(" pcmb subjects");
	}
}
class Arts extends Language
{
	public static void heps()
	{
		System.out.println("HEPs subjects");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Science s1=new Science();
		s1.Pcmb();
		Arts a1=new Arts();
		a1.heps();

	}

}
