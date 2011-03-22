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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;

public class PlaceFinderIntegration extends TestCase {
	private static final Log testWhereLog = LogFactory.getLog(PlaceFinderIntegration.class.getName() + ".testWhere");
	private static final Log testReverseLog = LogFactory.getLog(PlaceFinderIntegration.class.getName() + ".testReverse");
	private static final String baseUrl = "http://where.yahooapis.com";
	private static final String appId = "yourappid";

	public void testWhere() throws Exception {
		final Log log = testWhereLog;
		log.trace("enter");
		
		PlaceFinderClient client = new PlaceFinderFactory(baseUrl).getPlaceFinder();
		
		PlaceFinderInvoker invoker = PlaceFinderInvoker.builder().appId(appId).count(1).location("484 Los Angeles Ave., Moorpark, CA").flag("C").build();
		PlaceFinderResultSet response = null;
		try {
			long start = System.currentTimeMillis();
			response = invoker.location(client);
			long end = System.currentTimeMillis();
			log.trace(String.format("Query took %s ms", end - start));
		} catch (Exception e) {
			log.error(e);
			fail();
		}
		
		assertNotNull(response);
		assertEquals((Integer)0, response.getError());
		
		PlaceFinderResult result = response.getResult();
		assertNotNull(result);
		assertNotNull(result.getLatitude());
		assertNotNull(result.getLongitude());
		assertTrue(result.getLatitude() > 0);
		assertTrue(result.getLongitude() < 0);
	}

	public void testReverse() throws Exception {
		final Log log = testReverseLog;
		log.trace("enter");
		
		PlaceFinderClient client = new PlaceFinderFactory(baseUrl).getPlaceFinder();
		
		PlaceFinderInvoker invoker = PlaceFinderInvoker.builder().appId(appId).count(1).latitude(37.787082F).longitude(-122.400929F).geocodingFlag("R").build();
		PlaceFinderResultSet response = null;
		try {
			long start = System.currentTimeMillis();
			response = invoker.location(client);
			long end = System.currentTimeMillis();
			log.trace(String.format("Query took %s ms", end - start));
		} catch (Exception e) {
			log.error(e);
			fail();
		}
		
		assertNotNull(response);
		assertEquals((Integer)0, response.getError());
		
		PlaceFinderResult result = response.getResult();
		assertNotNull(result);
		assertNotNull(result.getCounty());
		assertNotNull(result.getCity());
		assertNotNull(result.getState());
		assertNotNull(result.getStateCode());
	}
}