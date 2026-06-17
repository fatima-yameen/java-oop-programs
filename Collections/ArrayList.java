import java.util.ArrayList;
public class EvenNumbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> n= new ArrayList<>();
        n.add(10);
        n.add(15);
        n.add(22);
        n.add(33);
        n.add(40);
        System.out.println(n);

        for (int i:n)
        {
            if (i % 2 == 0) 
            {
                System.out.println(i);
            }
    }
    }
}
