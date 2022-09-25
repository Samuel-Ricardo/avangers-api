package com.study.avengersapi.application.web.resource.request

import com.study.avengersapi.domain.avenger.Avenger
import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class AvengerRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val nick: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val person:String,

    val description: String? = null,
    val history: String? = null
) {
    fun toAvenger() = Avenger(
        nick = nick,
        person = person,
        description = description,
        history = history
    )
}
