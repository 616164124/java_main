package com.github_snippet;

import java.io.InputStream;
import java.util.Properties;

/**
 * 获取abc.properties文件里面的值（注意：文件放在resources文件下面）
 */
public class BProperty {

    private static BProperty instance = null;
    //放在resources文件下
    private String fileName = "/abc.properties";

    private Properties dbProps = null;

    private BProperty() {
        InputStream is = getClass().getResourceAsStream(fileName);
        if (dbProps == null) {
            dbProps = new Properties();
        }
        try {
            dbProps.load(is);
        } catch (Exception e) {
            System.err.println("不能读取属性文件. " +
                    "请确保properties在CLASSPATH指定的路径中");
            return;
        }
    }

    public static BProperty getInstance() {
        if (instance == null) {
            instance = new BProperty();
        }
        return instance;
    }

    public String getProperty(String name, String defaultValue) {
        return dbProps.getProperty(name, defaultValue);
    }

    public String getPool(String b) {
        return dbProps.getProperty(b);
    }

    public Properties getDbProps() {
        return dbProps;
    }

    public void setDbProps(Properties dbProps) {
        this.dbProps = dbProps;
    }

    public static void main(String[] args) {
        BProperty bProperty = new BProperty();
        System.out.println(bProperty.getPool("pwd"));

    }
}