package exercise3;

import java.util.Arrays;


public class BinaryDS {

    public static void main(String str[]){
        int arr[] = {-1,2,3,4,5,6,7,8,9,12,12,12,14,15};
        int target = 12;
        //System.out.println(search(arr, target));
        System.out.println(searchViaCollections(arr, target));
    }

    // Return the index value of the target from the list
    // 1,2,3,4,5,6
    static int search(int [] arr, int target) {
        // Left pointer
        int left = 0;

        // Right pointer
        int right = arr.length -1;
        //System.out.println("Right -->"+right);

        // Mid index value
        //int mid=0;
        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("Value of Mid "+mid);
            System.out.println("Value of L "+left);
            System.out.println("Value of R "+right);
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }

    static int searchViaCollections(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));
        System.out.println(target);
        return Arrays.binarySearch(arr, target);
    }

    
}