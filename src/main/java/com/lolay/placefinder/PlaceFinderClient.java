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

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/geocode")
@Consumes(MediaType.WILDCARD)
@Produces(MediaType.TEXT_XML)
public interface PlaceFinderClient {
	public static final String APP_ID = "appid";
	public static final String LOCALE = "locale";
	public static final String START = "start";
	public static final String COUNT = "count";
	public static final String OFFSET = "offset";
	public static final String FLAGS = "flags";
	public static final String GEOCODING_FLAGS = "gflags";
	
	public static final String LOCATION = "location";

	@GET
	PlaceFinderResultSet location(
			@QueryParam(LOCATION) String location,
			@QueryParam(APP_ID) String appId,
			@QueryParam(LOCALE) String locale,
			@QueryParam(START) Integer start,
			@QueryParam(COUNT) Integer count,
			@QueryParam(FLAGS) String flags,
			@QueryParam(GEOCODING_FLAGS) String geocodingflags);
}