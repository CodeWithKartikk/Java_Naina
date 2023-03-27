package Programs;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,19};
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int i;
        for(i=0; i<arr.length-1; i++){
            if(arr[i] == ele){
                System.out.println("Element Found at index " + i);
                break;
            }
        }
        // if(i==arr.length)
        //     System.out.println("Element Not Found");
    }
}

// camelCase - nextInt