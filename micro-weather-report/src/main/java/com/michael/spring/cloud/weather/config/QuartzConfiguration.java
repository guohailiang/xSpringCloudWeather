package com.michael.spring.cloud.weather.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.michael.spring.cloud.weather.job.WeatherDataSyncJob;

/**
 * Quartz Configuration.
 *
 */
@Configuration
public class QuartzConfiguration {

	private static final int TIME = 1800; // 更新频率,default value is 1800s

	/**
	 * Job配置方法根据用户的WeatherDataSyncJob类生成Quartz框架中的指定的Job对象,注册到SpringBoot容器中
	 * 由Quartz core模块根据接口(JobDetail)类型,加载和调用
	 * @return
	 */
	@Bean
	public JobDetail weatherDataSyncJobDetail() {
		return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSyncJob")
				.storeDurably().build();
	}

	/**
	 * Trigger配置类定义了Job在什么时候会被执行,该函数注册到SpringBoot容器中,
	 * 由Quartz core模块根据接口(Trigger)类型,加载和调用
	 * @return
	 */
	@Bean
	public Trigger weatherDataSyncTrigger() {

		SimpleScheduleBuilder schedBuilder = SimpleScheduleBuilder.simpleSchedule()
				.withIntervalInSeconds(TIME).repeatForever();

		return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail())
				.withIdentity("weatherDataSyncTrigger").withSchedule(schedBuilder).build();
	}
}
