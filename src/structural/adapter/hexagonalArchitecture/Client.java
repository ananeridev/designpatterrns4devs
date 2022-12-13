package structural.adapter.hexagonalArchitecture;


import java.util.HashMap;
import java.util.Map;

import structural.adapter.hexagonalArchitecture.application.UserRest;

public class Client {


    public static void main(String[] args) {
        UserRest userRestApi = new UserRest();
        Map<String, String> body = new HashMap<String, String>();
        body.put("email", "user1@email.com");
        body.put("name", "User 1");
        body.put("password", "passwd");
        Integer statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);

        body.put("email", "teste@teste.com");
        body.put("name", "User 2");
        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);

        body.put("email", "teste2@teste.com");
        body.put("name", "User 2");
        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);
    }

}
