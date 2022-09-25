package com.study.avengersapi.application.web.resource.response

data class AvengerResponse(
    val id: Long?,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?,
)
