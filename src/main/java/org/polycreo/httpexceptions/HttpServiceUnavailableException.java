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
package org.polycreo.httpexceptions;

import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception to respond HTTP status 503.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class HttpServiceUnavailableException extends HttpResponseException {
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 * @param cause the cause
	 */
	public HttpServiceUnavailableException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Create instance.
	 *
	 * @param message the detail message
	 */
	public HttpServiceUnavailableException(String message) {
		super(message);
	}
	
	/**
	 * Create instance.
	 *
	 * @param cause the cause
	 */
	public HttpServiceUnavailableException(Throwable cause) {
		super(cause);
	}
}
