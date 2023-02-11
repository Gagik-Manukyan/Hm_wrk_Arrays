package Arrays7;

public class Main {
    public static void main(String[] args){
        int counter = 0;
        int [] number = {2,1,2,3,3,4,5,2,4,5,12,5,5,};
        for (int x: number){
            if (x == 5){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
