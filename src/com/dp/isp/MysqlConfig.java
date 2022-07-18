package com.dp.isp;


import java.util.Map;

public class MysqlConfig implements Viewer{
    private String address;
    private int timeout;
    private int maxTotal;
    //省略其他配置: maxWaitMillis,maxIdle,minIdle...

    public MysqlConfig() {

    }

    public String getAddress() {
        return this.address;
    }
    //...省略其他get()、init()方法...

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}

