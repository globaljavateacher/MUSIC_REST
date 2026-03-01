package com.global.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Music Detail API", description = "음악 상세 정보 CRUD API")
@RestController
@RequestMapping("/api/v1/music-detail")
@RequiredArgsConstructor
public class MusicDetailController {

}
