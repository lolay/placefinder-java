/*
 * Licensed to Lolay, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Lolay, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://github.com/lolay/placefinder-java/raw/master/LICENSE
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package com.lolay.placefinder;

import java.io.Serializable;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement(name="Result")
@XmlAccessorType(value=XmlAccessType.FIELD)
public class PlaceFinderResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="quality")
	private Integer quality = null;
	@XmlElement(name="latitude")
	private Float latitude = null;
	@XmlElement(name="longitude")
	private Float longitude = null;
	@XmlElement(name="offsetlat")
	private Float offsetLatitude = null;
	@XmlElement(name="offsetlon")
	private Float offsetLongitude = null;
	@XmlElement(name="radius")
	private Integer radius = null;
	@XmlElement(name="boundingbox")
	private PlaceFinderBoundingBox boundingBox = null;
	@XmlElement(name="name")
	private String name = null;
	@XmlElement(name="line1")
	private String line1 = null;
	@XmlElement(name="line2")
	private String line2 = null;
	@XmlElement(name="line3")
	private String line3 = null;
	@XmlElement(name="line4")
	private String line4 = null;
	@XmlElement(name="cross")
	private String cross = null;
	@XmlElement(name="house")
	private String house = null;
	@XmlElement(name="street")
	private String street = null;
	@XmlElement(name="xstreet")
	private String xStreet = null;
	@XmlElement(name="unittype")
	private String unitType = null;
	@XmlElement(name="unit")
	private String unit = null;
	@XmlElement(name="postal")
	private String postal = null;
	@XmlElement(name="neghborhood")
	private String neighborhood = null;
	@XmlElement(name="city")
	private String city = null;
	@XmlElement(name="county")
	private String county = null;
	@XmlElement(name="state")
	private String state = null;
	@XmlElement(name="country")
	private String country = null;
	@XmlElement(name="level4")
	private String level4 = null;
	@XmlElement(name="level3")
	private String level3 = null;
	@XmlElement(name="level2")
	private String level2 = null;
	@XmlElement(name="level1")
	private String level1 = null;
	@XmlElement(name="level0")
	private String level0 = null;
	@XmlElement(name="countycode")
	private String countyCode = null;
	@XmlElement(name="statecode")
	private String stateCode = null;
	@XmlElement(name="countrycode")
	private String countryCode = null;
	@XmlElement(name="level2code")
	private String level2Code = null;
	@XmlElement(name="level1code")
	private String level1Code = null;
	@XmlElement(name="level0code")
	private String level0Code = null;
	@XmlElement(name="timezone")
	@XmlJavaTypeAdapter(value=TimeZoneAdapter.class)
	private TimeZone timezone = null;
	@XmlElement(name="areacode")
	private String areaCode = null;
	@XmlElement(name="uzip")
	private String uniqueZip = null;
	@XmlElement(name="hash")
	private String hash = null;
	@XmlElement(name="woeid")
	private Integer woeId = null;
	@XmlElement(name="woetype")
	private Integer woeType = null;
	
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getOffsetLatitude() {
		return offsetLatitude;
	}
	public void setOffsetLatitude(Float offsetLatitude) {
		this.offsetLatitude = offsetLatitude;
	}
	public Float getOffsetLongitude() {
		return offsetLongitude;
	}
	public void setOffsetLongitude(Float offsetLongitude) {
		this.offsetLongitude = offsetLongitude;
	}
	public Integer getRadius() {
		return radius;
	}
	public void setRadius(Integer radius) {
		this.radius = radius;
	}
	public PlaceFinderBoundingBox getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(PlaceFinderBoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public String getLine4() {
		return line4;
	}
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	public String getCross() {
		return cross;
	}
	public void setCross(String cross) {
		this.cross = cross;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getxStreet() {
		return xStreet;
	}
	public void setxStreet(String xStreet) {
		this.xStreet = xStreet;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLevel4() {
		return level4;
	}
	public void setLevel4(String level4) {
		this.level4 = level4;
	}
	public String getLevel3() {
		return level3;
	}
	public void setLevel3(String level3) {
		this.level3 = level3;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel0() {
		return level0;
	}
	public void setLevel0(String level0) {
		this.level0 = level0;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLevel2Code() {
		return level2Code;
	}
	public void setLevel2Code(String level2Code) {
		this.level2Code = level2Code;
	}
	public String getLevel1Code() {
		return level1Code;
	}
	public void setLevel1Code(String level1Code) {
		this.level1Code = level1Code;
	}
	public String getLevel0Code() {
		return level0Code;
	}
	public void setLevel0Code(String level0Code) {
		this.level0Code = level0Code;
	}
	public TimeZone getTimezone() {
		return timezone;
	}
	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getUniqueZip() {
		return uniqueZip;
	}
	public void setUniqueZip(String uniqueZip) {
		this.uniqueZip = uniqueZip;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public Integer getWoeId() {
		return woeId;
	}
	public void setWoeId(Integer woeId) {
		this.woeId = woeId;
	}
	public Integer getWoeType() {
		return woeType;
	}
	public void setWoeType(Integer woeType) {
		this.woeType = woeType;
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	@Override
	public boolean equals(Object obj) {
	   return EqualsBuilder.reflectionEquals(this, obj);
	}
	@Override
	public String toString() {
	   return ToStringBuilder.reflectionToString(this);
	}
}