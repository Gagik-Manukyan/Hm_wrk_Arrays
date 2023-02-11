package Arrays4;

public class Main {
    static float arr[] = {10, 14, 2, 510, 12};
    static float Smaller()
    {
        int i;
        float min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + Smaller());
    }
}

