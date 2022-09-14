public class StringMethodEx {
    public static void main(String[] args) {
//        String str = new String("hello");

        String str = "hello";
        str.length();
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,3));

        str = str.concat("world");
        System.out.println(str);

    }
}
