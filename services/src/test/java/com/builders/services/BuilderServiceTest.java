package com.builders.services;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BuilderServiceTest {

    @Test
    public void testHello() {
        InputStream stream = BuilderServiceTest.class.getClassLoader().getResourceAsStream("service_config_test.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(properties.getProperty("test_hello"));
    }

}
