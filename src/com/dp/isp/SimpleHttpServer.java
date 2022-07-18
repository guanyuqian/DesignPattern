package com.dp.isp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

//将配置中心的配置信息保存在http server中
public class SimpleHttpServer {

    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    private String host;
    private int port;
    private List<Viewer> viewers = new ArrayList<Viewer>();

    public SimpleHttpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewer(String urlDirectory, Viewer viewer) {

    }


    public void run() {
        viewers.get(0).outputInPlainText();
    }
}
