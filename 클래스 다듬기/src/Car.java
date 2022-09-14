public class Car {
    String name;
    int number;

    public Car(String n){
        this.name = n;
    }

    public Car(){
//        this.name = "이름 없음";
//        this.number = 0;
        this("이름없음", 0);
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}
