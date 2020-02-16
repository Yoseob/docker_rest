package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * DeviceController 2019-10-20
 *
 * Copyright Naver Webtoon Corp. All rights Reserved.
 * Naver Webtoon Corp. PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author jumi.jeong@webtoonscorp.com
 * @since 2019-10-20
 * https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/
 */
@Slf4j
@RestController
public class ApiController {

	@DeleteMapping("/test")
	public Mono<String> deleteDevice() {
		return Mono.just("[DELETE TEST]");
	}

	@PutMapping("/test")
	public Mono<String> updateDevice() {
		return Mono.just("[PUT TEST]");
	}

	@PostMapping("/test")
	public Mono<String> addDevice() {
		return Mono.just("[POST TEST]");
	}

	@GetMapping("/test")
	public Mono<String> findDeviceGroup() {
		return Mono.just("[GET TEST]");
	}

}
