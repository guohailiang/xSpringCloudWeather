package com.michael.spring.cloud.weather.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * City.
 *
 */
@XmlRootElement(name = "d") //根节点,将City注册到Spring容器,名称为"d",对应上XML中的元素"d"
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	@XmlAttribute(name = "d1") //将cityId注册到Spring容器,名称为"d1",对应XML元素"d"中的属性(attribute)"d1"
	private String cityId;
	
	@XmlAttribute(name = "d2")
	private String cityName;
	
	@XmlAttribute(name = "d3")
	private String cityCode;
	
	@XmlAttribute(name = "d4")
	private String province;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
