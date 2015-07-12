package com.example.aravinda.smscandroid_app;


/**
 * Created by Aravinda on 11-Jul-15.
 */
//POJO - Plain Old Java Object
public class JsonDecoder {
//    private String ip;
//    private String address;
    private String object_or_array;
    private String empty;
    private String parse_time_nanoseconds;
    private String validate;
    private String size;

//    private List<String> ipList = new ArrayList<String>();

    @Override
    public String toString() {
        return "IP address" + object_or_array+" "+empty +" "+parse_time_nanoseconds +" "+validate +" "+size;
    }

    public String getObject_or_array() {
        return object_or_array;
    }

    public void setObject_or_array(String object_or_array) {
        this.object_or_array = object_or_array;
    }
}
