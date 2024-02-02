import java.util.*;

public class SortedMatrix {
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

        // 1ST APPPROACH

        // int ans[] = new int[n * n];
        // int k = 0;
        // for (int i = 0; i < n; i++) {

        // for (int j = 0; j < n; j++) {
        // ans[k++] = v[i][j];
        // // k++;

        // }
        // }
        // Arrays.sort(ans);
        // System.out.println("Sorted matrix is ");
        // for (int i = 0; i < (n * n); i++) {
        // System.out.print(ans[i] + " ");
        // }

        // 2ND APPROACH
        PriorityQueue<int[]> hp = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            hp.offer(new int[] { v[i][0], i, 0 });

        }
        int ans[] = new int[n * n];
        int k = 0;
        // while (!hp.isEmpty()) {
        // int[] curr = hp.poll();
        // System.out.println(curr[0] + " " + curr[1] + " " + curr[2]);
        // }
        while (!hp.isEmpty()) {
            int[] curr = hp.poll();
            ans[k++] = curr[0];
            int i = curr[1];
            int j = curr[2];
            if (j < (n - 1)) {
                hp.offer(new int[] { v[i][j + 1], i, j + 1 });

            }

        }

        for (int i : ans) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}
