package Arrays5;
public class Main {
    public static void main(String[] args) {
        int[] n = {5, 4, 3, 2, 1};
        int[] m = new int[n.length-1];
        System.arraycopy(n,0, m,0,n.length-1);
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
        System.out.println("После копирования содержимое скопированного массива будет следующим:");
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + " ");
    }
}

