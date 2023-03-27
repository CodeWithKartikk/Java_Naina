package Programs;
// Most Important
public class BubbleSort{
    public static void main(String[] args) {
        // definiton of variables
        int arr[] = {3,60,35,2,45,320,5};
        int n = 20;

        // Array Before Bubble Sort
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic of Bubble Sort Asc
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < (10-i) ; j++) {
                if(arr[j-1]>arr[j]){
                    // swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        // Logic of Bubble Sort Desc
        for (int i = 10; i < 20; i++) {
            for (int j = 11; j < (20-i) ; j++) {
                if(arr[j-1]<arr[j]){
                    // swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        // Array After Bubble Sort
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}