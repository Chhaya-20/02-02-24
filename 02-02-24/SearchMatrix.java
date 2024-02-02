import java.util.*;

public class SearchMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns");
        int m = sc.nextInt();
        int[][] v = new int[n][m];
        // int ans = 0;
        boolean f = false;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elwm of " + (i + 1) + "row");
            for (int j = 0; j < m; j++) {

                v[i][j] = sc.nextInt();
                // zeromatrix(v, i, j, n, m);
            }
        }
        System.out.println("Enter search elemnt ");
        int s = sc.nextInt(), i = 0, j = 0;
        if (s == v[0][m - 1]) {
            System.out.println("Index is  " + 0 + (m - 1));
        } else {
            if (s < v[0][m - 1]) {
                i = 0;
                j = m - 2;
                while (i < n && i >= 0 && j >= 0 && j < m) {
                    System.out.println();
                    if (s == v[i][j]) {

                        System.out.println("Index is  " + i + " " + j);
                        f = true;
                        break;

                    } else if (s < v[i][j]) {
                        j--;
                    } else {
                        i++;
                    }
                }

            } else {
                i = 1;
                j = m - 1;
                System.out.println(i + " " + j);
                while (i < n && i >= 0 && j >= 0 && j < m) {
                    // System.out.println();
                    if (s == v[i][j]) {
                        f = true;
                        System.out.println("Index is  " + i + " " + j);
                        break;

                    } else if (s < v[i][j]) {
                        j--;
                    } else {
                        i++;
                    }
                }

            }

        }
        if (!f) {
            System.out.println("Not found");
        }
        sc.close();
    }

}
