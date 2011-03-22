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
import java.util.Locale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement(name="ResultSet")
@XmlAccessorType(value=XmlAccessType.FIELD)
public class PlaceFinderResultSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name="version",required=true)
	private String version = null;
	@XmlElement(name="Error",required=true)
	private Integer error = null;
	@XmlElement(name="ErrorMessage",required=true)
	private String errorMessage = null;
	@XmlElement(name="Locale",required=true)
	@XmlJavaTypeAdapter(value=LocaleAdapter.class)
	private Locale locale = null;
	@XmlElement(name="Quality",required=true)
	private Integer quality = null;
	@XmlElement(name="Found",required=true)
	private Integer found = null;
	@XmlElement(name="Result",required=true)
	private PlaceFinderResult result = null;

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public Integer getFound() {
		return found;
	}
	public void setFound(Integer found) {
		this.found = found;
	}
	public PlaceFinderResult getResult() {
		return result;
	}
	public void setResult(PlaceFinderResult result) {
		this.result = result;
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