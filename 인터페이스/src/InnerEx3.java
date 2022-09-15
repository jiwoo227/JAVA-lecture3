public class InnerEx3 {
    public void exec(){
        class  Cal{
            int value = 0;
            public void plus(){
                value ++;
            }
        }

        Cal cal = new Cal();
        cal.plus();
    }

    public static void main(String[] args) {
        InnerEx3 ex3 = new InnerEx3();
        ex3.exec();
    }
}
