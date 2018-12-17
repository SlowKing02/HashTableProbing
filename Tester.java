
public class Tester
{
    public static void main(String[] args)
    {
      int q = 120;
      HashMap Tester = new HashMap();
      Tester.put(5, 1);
      System.out.println(Tester.get(5));
      Tester.put(400, 25);
      Tester.put(5, 100);
      for (int i = 0; i < 120; i++)
      {
      System.out.println(Tester.get(i));
      }
           
    }
}