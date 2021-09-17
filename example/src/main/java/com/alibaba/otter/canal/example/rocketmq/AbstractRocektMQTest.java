package com.alibaba.otter.canal.example.rocketmq;

import com.alibaba.otter.canal.example.BaseCanalClientTest;

public abstract class AbstractRocektMQTest extends BaseCanalClientTest {

    public static String  topic              = "test-topic";
    public static String  groupId            = "test-group";
    public static String  nameServers        = "192.168.186.222:9876";
    public static String  accessKey          = "";
    public static String  secretKey          = "";
    public static boolean enableMessageTrace = false;
    public static String  accessChannel      = "local";
    public static String  namespace          = "";
}
