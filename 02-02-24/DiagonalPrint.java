import java.util.*;

public class DiagonalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows or col ");
        int n = sc.nextInt();

        int[][] v = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter elwm of " + (i + 1) + " row");
            for (int j = 0; j < n; j++) {

                v[i][j] = sc.nextInt();
            }
        }
        int k = 0, t = n;
        while (t > 0) {
            for (int i = 0; (i + k) < n; i++) {
                System.out.print(v[i][i + k] + " ");
            }
            t--;
            k++;

            System.out.println('\n');
        }
        sc.close();

    }

}
