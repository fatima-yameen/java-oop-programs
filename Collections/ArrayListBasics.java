import java.util.ArrayList;
public class Num
{

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("BUS");
		al.add("CIVIC");
		al.add("PRADO");
		al.add("BMW");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(2,"FERRARI");
		System.out.println(al);
		System.out.println(al.size());
		String x=al.get(3);
		System.out.println(x);
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
	}

}
