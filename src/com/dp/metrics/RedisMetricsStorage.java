package com.dp.metrics;

import com.google.gson.Gson;

import java.util.*;

public class RedisMetricsStorage implements MetricsStorage {
    //... 省略属性和构造函数等...
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

}
