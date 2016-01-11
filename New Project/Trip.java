public class Trip
{
    private static int sum;
    public static int distance(int...list)
    {
        sum = 0;
        
        for (int i = 0; i < list.length; i++)
            sum = sum + list[i];
            
        return sum;
    }
}