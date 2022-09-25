package com.study.avengersapi.application.web.resource

import com.study.avengersapi.domain.avenger.AvengersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private const val API_PATH = "/v1/api/avenger"

@RestController
@RequestMapping(value = [API_PATH])
class AvengerResource(
    @Autowired private val repository: AvengersRepository
)