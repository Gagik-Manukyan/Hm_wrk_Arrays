package Arrays3;

public class Main {
    static long arr[] = {100000020, 33, 15, 40, 22};
    static long largest()
    {
        int i;
        long max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }
}

