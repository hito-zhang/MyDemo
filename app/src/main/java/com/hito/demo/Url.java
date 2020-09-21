package com.hito.demo;


import rxhttp.wrapper.annotation.DefaultDomain;
import rxhttp.wrapper.annotation.Domain;

public class Url {

    @DefaultDomain() //设置为默认域名
    public static String BASE_URL = NewVersionConstant.BASE_URL;

    @Domain(name = "BaseUrlH5") //非默认域名
    public static String H5URL = NewVersionConstant.BASE_H5URL;

    @Domain(name = "BaseUrlJava") //非默认域名
    public static String JAVAURL = NewVersionConstant.BASE_JAVA_URL;

    @Domain(name = "BaseUrlParking") //非默认域名
    public static String ParkingURL = NewVersionConstant.BASE_PARKING_URL;

    @Domain(name = "TestUrlJava") //非默认域名
    public static String TEST_JAVA_URL = "http://192.168.20.209:34308/";
}
