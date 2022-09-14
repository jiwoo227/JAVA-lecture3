public class VariableScopeEx {
    int globalScope = 10;

    static int scope = 1;

    public void ScopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
//        System.out.println(localScope);
    }

    public static void main(String[] args) {
        System.out.println(scope);
        //static한 변수 (클래스변수)

        VariableScopeEx v1 = new VariableScopeEx();
        System.out.println(v1.globalScope);

    }
}
