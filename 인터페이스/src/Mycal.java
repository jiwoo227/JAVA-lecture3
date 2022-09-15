public class Mycal {
    public static void main(String[] args) {
        Calculator cal = new Mycla();
        cal.plus(3,4);
        cal.exec(5,6);

        int i = cal.exec(5,6); //default
        System.out.println(i);

        Calculator.exec2(3,4); //static
    }
}
