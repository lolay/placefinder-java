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

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

public class PlaceFinderFactory {
	private String baseUrl = null;
	private PlaceFinderClient placefinder = null;
	
	public PlaceFinderFactory(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	private <R> R getResource(Class<R> type) {
		return JAXRSClientFactory.create(baseUrl, type);
	}
	
	public synchronized PlaceFinderClient getPlaceFinder() {
		if (placefinder == null) {
			placefinder = getResource(PlaceFinderClient.class);
		}
		return placefinder;
	}
}