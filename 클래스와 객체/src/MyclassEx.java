public class MyclassEx {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(2);
        myclass.method3();
        int value = myclass.method3();
        System.out.println("m3이 리턴한 값" + value);

    }
}
