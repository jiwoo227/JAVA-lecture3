public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "최지우";
        c1.number = 1234;

        c2.name = "쪠지우";
        c2.number = 2345;

        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}
