package com.hito.demo;

public class NewVersionConstant {

    public static final String BASE_URL;
    public static final String BASE_JAVA_URL;
    public static final String BASE_PARKING_URL;
    public static final String BASE_H5URL;

    static {
        int isdebug = 0;
        switch (isdebug) {
            default:
            case 0:
                BASE_URL = "https://apiadl2.hitotech.cn/api/";
                BASE_H5URL = "https://h5adl.hitotech.cn/";
                BASE_JAVA_URL = "https://march.hitotech.cn/";
                BASE_PARKING_URL = "http://march.idoru.cn/parking/";
                break;
            case 1:
                BASE_URL = "http://api.release.idoru.cn/api/";
                BASE_H5URL = "http://h5.release.idoru.cn/";
                BASE_JAVA_URL = "http://march.release.hitotech.cn/";
                BASE_PARKING_URL = "http://march.release.idoru.cn/parking/";
                break;
            case 2:

                BASE_URL = "http://api.test.idoru.cn/api/";
                BASE_H5URL = "http://h5.test.idoru.cn/";
//                BASE_JAVA_URL = "http://192.168.20.211:8000/";
                BASE_JAVA_URL = "http://march.test.hitotech.cn/";
                BASE_PARKING_URL = "https://march.hitotech.cn/";
                break;
            case 3:
                BASE_URL = "http://192.168.10.161:8088/api/";
                BASE_H5URL = "http://dev.h5.idoru.cn/";
                BASE_JAVA_URL = "http://192.168.20.211:8000/";
                BASE_PARKING_URL = "https://march.hitotech.cn/";
                break;
        }
    }


}
