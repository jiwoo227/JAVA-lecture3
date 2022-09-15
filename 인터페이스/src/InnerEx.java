public class InnerEx {
    class Cal{
        int value = 0;
        public void plus(){
            value ++;
        }
    }

    public static void main(String[] args) {
        InnerEx t = new InnerEx();
        InnerEx.Cal cal = t.new Cal();
        System.out.println(cal.value);
    }
}
