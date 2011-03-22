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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PlaceFinderInvoker implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(PlaceFinderInvoker.class);

	private Long warningLimit = 10000L;
	private String appId = null;
	private Locale locale = null;
	private Integer start = null;
	private Integer count = null;
	private Integer offset = null;
	private List<String> flags = null;
	private List<String> geocodingFlags = null;
	private Float latitude = null;
	private Float longitude = null;
	
	private String location = null;
	
	public Long getWarningLimit() {
		return warningLimit;
	}
	public void setWarningLimit(Long warningLimit) {
		this.warningLimit = warningLimit;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public List<String> getFlags() {
		return flags;
	}
	public void setFlags(List<String> flags) {
		this.flags = flags;
	}
	public void addFlag(String flag) {
		if (flags == null) {
			flags = new ArrayList<String>();
		}
		flags.add(flag);
	}
	public String getFlagsString() {
		if (getFlags() == null || getFlags().size() == 0) {
			return null;
		}
		
		String flagsString = "";
		for (String flag : getFlags()) {
			flagsString += flag;
		}
		
		return flagsString;
	}
	public List<String> getGeocodingFlags() {
		return geocodingFlags;
	}
	public void setGeocodingFlags(List<String> geocodingFlags) {
		this.geocodingFlags = geocodingFlags;
	}
	public void addGeocodingFlag(String geocodingFlag) {
		if (geocodingFlags == null) {
			geocodingFlags = new ArrayList<String>();
		}
		geocodingFlags.add(geocodingFlag);
	}
	public String getGeocodingFlagsString() {
		if (getGeocodingFlags() == null || getGeocodingFlags().size() == 0) {
			return null;
		}
		
		String flagsString = "";
		for (String flag : getGeocodingFlags()) {
			flagsString += flag;
		}
		
		return flagsString;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	
	public PlaceFinderResultSet location(PlaceFinderClient client) {
		PlaceFinderResultSet response;
		
		Long start = System.currentTimeMillis();

		String locationString = getLocation();
		if (locationString == null) {
			if (getLatitude() != null && getLongitude() != null) {
				locationString = getLatitude() + " " + getLongitude();
			}
		}
		
		String localeString = getLocale() == null ? null : getLocale().toString();
		response = client.location(locationString, getAppId(), localeString, getStart(), getCount(), getFlagsString(), getGeocodingFlagsString());
		
		Long end = System.currentTimeMillis();
		Long diff = end - start;
		
		if (log.isTraceEnabled()) {
			log.trace(String.format("PlaceFinder query took %s milliseconds", diff));
		} else if (log.isWarnEnabled() && diff > getWarningLimit()) {
			log.warn(String.format("PlaceFinder query took %s milliseconds which is longer than the threshold %s milliseconds", diff, getWarningLimit()));
		}
		
		return response;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder implements Serializable {
		private static final long serialVersionUID = 1L;
		private PlaceFinderInvoker instance = new PlaceFinderInvoker();
		private Builder() { }
		
		public Builder warningLimit(Long warningLimit) {
			instance.setWarningLimit(warningLimit);
			return this;
		}
		
		public Builder appId(String appId) {
			instance.setAppId(appId);
			return this;
		}
		
		public Builder locale(Locale locale) {
			instance.setLocale(locale);
			return this;
		}
		
		public Builder start(Integer start) {
			instance.setStart(start);
			return this;
		}
		
		public Builder count(Integer count) {
			instance.setCount(count);
			return this;
		}
		
		public Builder offset(Integer offset) {
			instance.setOffset(offset);
			return this;
		}
		
		public Builder flag(String flag) {
			instance.addFlag(flag);
			return this;
		}
		
		public Builder geocodingFlag(String flag) {
			instance.addGeocodingFlag(flag);
			return this;
		}
		
		public Builder location(String location) {
			instance.setLocation(location);
			return this;
		}
		
		public Builder latitude(Float latitude) {
			instance.setLatitude(latitude);
			return this;
		}
		
		public Builder longitude(Float longitude) {
			instance.setLongitude(longitude);
			return this;
		}
		
		public PlaceFinderInvoker build() {
			return instance;
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
}