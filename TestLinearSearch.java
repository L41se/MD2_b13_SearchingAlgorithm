

public class TestLinearSearch {
    public static int search(int arr[], int n, int x){
        for (int i = 0; i < n; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10};
        int x = 8;
        int result = search(arr, arr.length, x);
        if (result == -1){
            System.out.println("Search failed");
        } else {
            System.out.println("Result found at index number: " + result);
        }
    }
}
