import java.util.*;

public class SumOfZeroes {
    public static void main(String ags[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns");
        int m = sc.nextInt();
        int[][] v = new int[n][m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elwm of " + (i + 1) + "row");
            for (int j = 0; j < m; j++) {

                v[i][j] = sc.nextInt();
                // zeromatrix(v, i, j, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] == 0) {
                    if (i > 0) {
                        if (v[i - 1][j] == 1)
                            ans++;
                    }
                    if (i < n - 1) {
                        if (v[i + 1][j] == 1)
                            ans++;

                    }
                    if (j > 0) {
                        if (v[i][j - 1] == 1)
                            ans++;

                    }
                    if (j < m - 1) {
                        if (v[i][j + 1] == 1)
                            ans++;

                    }

                }
            }
        }
        System.out.println("Ans is " + ans);
        sc.close();
    }

}
