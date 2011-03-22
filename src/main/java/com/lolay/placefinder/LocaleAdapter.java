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

import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocaleAdapter extends XmlAdapter<String, Locale> {
	@Override
	public String marshal(Locale value) throws Exception {
		if (value == null) {
			return null;
		}
		
		return value.toString();
	}

	@Override
	public Locale unmarshal(String value) throws Exception {
		if (value == null || value.isEmpty()) {
			return null;
		}
		
		return new Locale(value);
	}
}