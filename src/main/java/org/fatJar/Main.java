package org.fatJar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User("Nazar", "Zabeida", "secret_login", "secret_password");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUser = gson.toJson(user);

        System.out.println(jsonUser);
    }
}