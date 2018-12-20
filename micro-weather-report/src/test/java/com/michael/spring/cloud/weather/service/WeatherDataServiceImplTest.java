package com.michael.spring.cloud.weather.service;

import com.michael.spring.cloud.weather.vo.WeatherResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataServiceImplTest {

    @Autowired
    WeatherDataServiceImpl weatherDataService;

    @Test
    public void getDataByCityId(){
        WeatherResponse weatherResponse = weatherDataService.getDataByCityId("101280101");
        System.out.println(weatherResponse.getData().getWendu());
    }
}
