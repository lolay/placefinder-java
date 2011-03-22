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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement(name="boundingbox")
@XmlAccessorType(value=XmlAccessType.FIELD)
public class PlaceFinderBoundingBox implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="north")
	private Float north = null;
	@XmlElement(name="south")
	private Float south = null;
	@XmlElement(name="east")
	private Float east = null;
	@XmlElement(name="west")
	private Float west = null;
	
	public Float getNorth() {
		return north;
	}
	public void setNorth(Float north) {
		this.north = north;
	}
	public Float getSouth() {
		return south;
	}
	public void setSouth(Float south) {
		this.south = south;
	}
	public Float getEast() {
		return east;
	}
	public void setEast(Float east) {
		this.east = east;
	}
	public Float getWest() {
		return west;
	}
	public void setWest(Float west) {
		this.west = west;
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