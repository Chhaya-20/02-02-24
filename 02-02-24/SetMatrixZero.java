import java.util.*;

public class SetMatrixZero {

    public static void main(String ags[]) {
        // Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
        // Vector<Vector<String>> s = new Vector<Vector<String>>();
        // Scanner sc = new Scanner();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns");
        int m = sc.nextInt();
        int[][] v = new int[n][m];
        // Vector v[][] = new Vector[n][m];
        // Scanner sc = new Scanner(System.in);

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
                    // zeromatrix(v, i, j, n, m);
                    for (int c = 0; c < m; c++) {
                        v[i][c] = 'a' - '0';
                    }
                    for (int c = 0; c < n; c++) {
                        v[c][j] = 'a' - '0';
                    }

                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] == ('a' - '0')) {
                    v[i][j] = 0;
                }
                System.out.print(v[i][j] + " ");

            }
            System.out.println('\n');
        }

        sc.close();
    }

}
