package Arrays9;

public class Main {
    public static void main(String[] args){
        int [] x = new int[]{12,41,31,4,15};
        int y;
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        for (int i=0; i<x.length; i++){
            for (int j=i; j< x.length; j++){
                if (x[i]> x[j]){
                    y = x[i];
                    x[i] = x[j];
                    x[j]= y;
                }
            }
        }
        for (int a: x){
            System.out.println(a);
        }

    }
}
