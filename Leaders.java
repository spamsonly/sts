public class Leaders {
    public static void main(String[] args) {
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
}
