public class Leaders2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        int max_from_right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (max_from_right < arr[i]) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
}
