package com.michael.spring.cloud.weather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherReportServiceImplTest {
    @Autowired
    WeatherReportServiceImpl weatherReportService;

    @Test
    public void getDataByCityId(){
        System.out.println(weatherReportService.getDataByCityId("101280101").getGanmao());
    }
}
