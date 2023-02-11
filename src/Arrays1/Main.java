package Arrays1;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {21, 9, -7, -4, -3, 12, -16};
        for (int x : positiveNumbers(numbers)) {
            System.out.println(x);
        }
    }
    public static int[] positiveNumbers(int[] num) {
        int count = 0;
        for (int x : num) {
            if (x > 0) {
                count++; }
        }
        int[] nums = new int[count];
        int i = 0;
        for (int n : num) {
            if (n > 0){
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }
}
