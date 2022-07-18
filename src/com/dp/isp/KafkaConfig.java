package com.dp.isp;


public class KafkaConfig implements Updater {
    private String address;
    private int timeout;
    private int maxTotal;
    //省略其他配置: maxWaitMillis,maxIdle,minIdle...

    public KafkaConfig() {
    }

    public String getAddress() {
        return this.address;
    }
    //...省略其他get()、init()方法...

    public void update() {
        System.out.println("Redis update...");
        //从configSource加载配置到address/timeout/maxTotal...
    }

}
