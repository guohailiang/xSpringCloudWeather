package com.michael.spring.cloud.weather.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.JobDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzConfigurationTest {

    @Autowired
    JobDetail jobDetail;

    @Test
    public void weatherDataSyncTrigger() {
        System.out.println("the name is:"+ jobDetail.getJobClass().getName());
    }
}