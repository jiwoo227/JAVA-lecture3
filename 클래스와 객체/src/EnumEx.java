public class EnumEx {

    public static final String MALE = "MALE";
    public static final String FEMALE="FEMALE";

    public static void main(String[] args) {
        String gender;
        gender = EnumEx.MALE;
        gender = EnumEx.FEMALE;

        gender = "boy";

        Gender gender2;

        gender2 = Gender.FEMALE;
        gender2 = Gender.MALE;
    }
}

enum Gender{
    MALE,FEMALE;
}