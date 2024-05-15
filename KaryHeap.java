K - ary heap
import java.util.ArrayList;


public class k_aryheap {
    private static int n;
    private static ArrayList<Integer> arl = new ArrayList<Integer>();
   
    public static int getMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return arl.get(0);
    }


    public static boolean isEmpty() {
        return (arl.size() == 0);
    }


    public static void insert(int value) {
       
        arl.add(value);


        int childrenIndex = arl.size() - 1;
        int parentIndex = (childrenIndex - 1) / n;
        while (parentIndex >= 0 && arl.get(childrenIndex) > arl.get(parentIndex)) {
            int temp = arl.get(childrenIndex);
            arl.set(childrenIndex, arl.get(parentIndex));
            arl.set(parentIndex, temp);


            childrenIndex = parentIndex;
            parentIndex = (childrenIndex - 1) / n;
        }
    }


    public static void removeMax() {
        arl.set(0, arl.get(arl.size() - 1));
        arl.remove(arl.size() - 1);


        int parentIndex = 0;


        while (true) {
            int largestValueIndex = parentIndex;


            for (int i = n * parentIndex + 1; i <= (n * parentIndex + n) && i < arl.size(); i++) {
                if (arl.get(largestValueIndex) < arl.get(i)) {
                    largestValueIndex = i;
                }
            }


            if (largestValueIndex == parentIndex) {
                break;
            }
            else {
                int temp = arl.get(parentIndex);
                arl.set(parentIndex, arl.get(largestValueIndex));
                arl.set(largestValueIndex, temp);


                parentIndex = largestValueIndex;
            }
        }
    }


    public static void main(String[] args) {
        n=3;


        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);


        for (int i = 0; i < arr.size(); i++) {
            insert(arr.get(i));
        }


        System.out.println("The maximum Element in the heap is: " + getMax());


        removeMax();


        System.out.println("The maximum Element in the heap is: " + getMax());
    }
}
