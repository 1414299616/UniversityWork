package com.example.finalwork.vo;

import java.util.HashMap;
import java.util.Map;

public class Response {

    private int code;

    private String message;

    private Map<String,Object> data = new HashMap<>();

    public Response(){}
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }


    public Response(int code,String message){
        this.code = code;
        this.message = message;
    }

    public static Response SUCCESS(){
        Response result = new Response();
        result.setCode(200);
        result.setMessage("Success");
        return result;
    }

    public static Response SUCCESS(String message){
        Response result = new Response();
        result.setCode(200);
        result.setMessage(message);
        return result;
    }

    public static Response SUCCESS(String key, Object value){
        Response result = new Response();
        result.setCode(200);
        result.setMessage("Success");
        result.getData().put(key,value);
        return result;
    }

    public static Response SUCCESS(HashMap map){
        Response result = new Response();
        result.setCode(200);
        result.setMessage("Success");
        result.setData(map);
        return result;
    }

    public static Response UnImplement(){
        return new Response(501,"Not Implemented");
    }

    public static Response FAIL(){
        return new Response(400,"BAD_REQUEST");
    }

    public static Response FAIL(int code,String message){
        return new Response(code,message);
    }
}