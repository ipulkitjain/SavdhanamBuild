package com.example.pulkitjjain.savdhanambuild;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pulkitj.jain on 24-03-2018.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://www.getpostman.com/collections/c279c319cd81e51bc01b";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String email, int contact, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("email", email);
        params.put("contact", contact + "");
        params.put("password", password);
    }



    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
