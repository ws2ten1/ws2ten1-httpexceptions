/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ws2ten1.httpexceptions;

import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception to respond HTTP status 401.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class HttpUnauthorizedException extends HttpResponseException {
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 * @param cause the cause
	 */
	public HttpUnauthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 */
	public HttpUnauthorizedException(String message) {
		super(message);
	}
	
	/**
	 * Create instance.
	 *
	 * @param cause the cause
	 */
	public HttpUnauthorizedException(Throwable cause) {
		super(cause);
	}
}
