package com.hito.demo;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import rxhttp.wrapper.annotation.Parser;
import rxhttp.wrapper.entity.ParameterizedTypeImpl;
import rxhttp.wrapper.exception.ParseException;
import rxhttp.wrapper.parse.AbstractParser;

//通过@Parser注解，为解析器取别名为Response，此时就会在RxHttp类生成asResponse(Class<T>)方法
@Parser(name = "Response", wrappers = {List.class})
public class HttpResponseParser<T> extends AbstractParser<T> {

    protected HttpResponseParser() {
        super();
    }

    public HttpResponseParser(@NotNull Type type) {
        super(type);
    }

    //省略构造方法
    @Override
    public T onParse(okhttp3.Response response) throws IOException {
        final Type type = ParameterizedTypeImpl.get(HttpResponse.class, mType); //获取泛型类型
        HttpResponse<T> data = convert(response, type);
        T t = data.getResult(); //获取data字段

        if (t == null && mType == String.class) {
            //判断我们传入的泛型是String对象，就给t赋值""字符串，确保t不为null
            t = (T) "";
        }

        if ((data.getCode() != 0 && data.getCode() != 200) || t == null) {//这里假设code不等于0，代表数据不正确，抛出异常
            throw new ParseException(String.valueOf(data.getCode()), data.getMessage(), response);
        }
        return t;
    }

}
