package Arrays8;
public class Main {
    public static void main(String[] args){
        int[] arr = {21,3,4,3,2,3,56,23};
        for (int i=0; i< arr.length; ++i){
            int x = arr[i];
            int count = 0;
            for (int j=0; j<arr.length; ++j){
                if (arr[j]==x){
                    ++count;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }
    }
}