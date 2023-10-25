public class TestBinarySearch {
    public static int BinarySearch(int[] arr, int x, int i){
        int start = 0;
        int end = arr.length- 1;
        while (start < end){
            int mid = (int) Math.floor((end-start));
            if (arr[mid] == x){
                return mid;
            } else if (arr[mid] < x){
                return mid + 1;
            } else return mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {34,23,525,5325,43431,543,131,1313,423};
        int x = 423;
        int ketqua = BinarySearch(arr, arr.length, x);
        if (ketqua == -1){
            System.out.println("Error");
        } else
            System.out.println("Result found at: " + ketqua);
    }
}
