public class ForeachEx {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        for(int i =0; i<arr.length; i++){
            int value = arr[i];
            System.out.println(value);
        }

        for(int value:arr){ //(받을 타입 : 출력하고 싶은 자료구조)
            System.out.println(value);
        }
    }
}
