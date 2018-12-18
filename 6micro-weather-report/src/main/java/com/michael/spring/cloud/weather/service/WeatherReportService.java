package com.michael.spring.cloud.weather.service;

import com.michael.spring.cloud.weather.vo.Weather;

/**
 * Weather Report Service.
 */
public interface WeatherReportService {

	/**
	 * 根据城市ID查询天气信息
	 * @param cityId
	 * @return
	 */
	Weather getDataByCityId(String cityId);
}
