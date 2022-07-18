package com.dp.isp;

public class Application {


    static ScheduledUpdater scheduledUpdater;
    static SimpleHttpServer simpleHttpServer;

    public static void main(String[] args) {
        final RedisConfig redisConfig = new RedisConfig();
        final KafkaConfig kafkaConfig = new KafkaConfig();
        final MysqlConfig mysqlConfig = new MysqlConfig();
        scheduledUpdater = new ScheduledUpdater(redisConfig, 3, 3);
        scheduledUpdater.run();
        ScheduledUpdater kafkaConfigUpdater = new ScheduledUpdater(kafkaConfig, 60, 60);
        scheduledUpdater.run();

        simpleHttpServer = new SimpleHttpServer("127.0.0.1", 1080);
        simpleHttpServer.addViewer("/config", redisConfig);
        simpleHttpServer.addViewer("/config", mysqlConfig);
        simpleHttpServer.run();

    }
}
