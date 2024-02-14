package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
    static Faker fakerlol = new Faker();

    public static String

    correctUsername = "dito18@gmail.com",
    correctPassword = "1MeMiyvars@Java1",

    incorUsername = fakerlol.bothify("ditodito"),
    incorPassword = fakerlol.bothify("A???A??##");
}

