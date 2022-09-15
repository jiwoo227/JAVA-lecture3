public class Actionex {
    public static void main(String[] args) {
//        Action ac = new MyAction();
//        ac.exec();

        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
