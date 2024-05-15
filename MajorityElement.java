import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3 };
        int n = arr.length;
        int index = 0, max = 0, count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        if (max > n / 2)
            System.out.println("Majority element " + arr[index]);
        else
            System.out.println("No majority element");

        sc.close();    
    }
    
}
