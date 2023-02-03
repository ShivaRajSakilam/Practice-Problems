package Arrays;

public class qn4 {
    public static int MinPostive(int[] a) {
        // int j = 0;
        int s = a[0], l = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < s && a[i] > 0) {
                s = a[i];
            }
            if (a[i] > l) {
                l = a[i];
            }
        }
        if (s >= 2) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > s && s++ >= a[i]) {
                // j = s;
            }
        }
        return s;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 0 };
        System.out.println(MinPostive(a));
    }
}
