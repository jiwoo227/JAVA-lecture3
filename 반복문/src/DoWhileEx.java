import java.util.Scanner;
public class DoWhileEx {
    public  static void main(String[] args){
        
        int value = 0;
        Scanner scan = new Scanner(System.in);
        
        do{
             //반복할 문장들 꼭 한번은 실행됨
            value = scan.nextInt();
            System.out.println("입력받은값" + value);
        }while(value != 10);
        System.out.println("반복문 종료");


    }
}
