package Arrays11;

public class Main {
    public static void main(String[] args){
        int x[] = {21,0,1,4,0,2,6,0,1,0};
        int y = x.length;
        int count = 0;
        for (int i= 0; i<y; i++){
            if(x[i] !=0){
                x[count++] = x[i];
                System.out.println(x[i]);
            }
        }
    }
}
