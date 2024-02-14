package DataObject;
import com.github.javafaker.Faker;


public class RegistrationData {
    static Faker fakerlol = new Faker();
    public static String
        regEmail = fakerlol.bothify("dito??#@gmail.com"),
        regPassword = fakerlol.bothify("???D???");
}
