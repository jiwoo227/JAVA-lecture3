public class Array2Ex {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][1] = 10;

        int[][] arr1 = new int[3][];
        arr1[0] = new int[1];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[0][0] = 10;

        int[][] arr3 = {{1}, {1,2}, {1,2,3}};
        System.out.println(arr3);
    }
}
