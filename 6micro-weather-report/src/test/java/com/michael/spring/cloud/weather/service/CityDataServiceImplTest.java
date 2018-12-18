package com.michael.spring.cloud.weather.service;


import com.michael.spring.cloud.weather.vo.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试CityDataServiceImpl功能，导入城市数据信息列表
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityDataServiceImplTest{

    @Autowired
    CityDataServiceImpl cityDataService;

    @Test
    public void listCity() throws Exception{
        List<City> cityList = cityDataService.listCity();
        for (City city : cityList){
            System.out.println(city.getCityName());
        }
    }

}
