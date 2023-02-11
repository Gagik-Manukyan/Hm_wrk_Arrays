package Arrays10;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        if (num >= 1 && num <= 200) {
            int[] arr = new int[num];
            x.nextLine();
            String line = x.nextLine();
            String[] str1 = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str1[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}