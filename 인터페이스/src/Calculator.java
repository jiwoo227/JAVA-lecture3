public interface Calculator {
    public int plus(int i, int j);
    public int multipe(int i, int j);

    default int exec(int i, int j){
        return i + j;
    }

    public static int exec2(int i, int j){
        return i*j;
    }
}
