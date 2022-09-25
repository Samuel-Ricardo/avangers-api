package com.study.avengersapi.resource.avenger

import com.study.avengersapi.domain.avenger.Avenger
import com.study.avengersapi.domain.avenger.AvengersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class AvengerRepositoryImpl(
    @Autowired private val repository: AvengerEntityRepository
): AvengersRepository {

    override fun getDetail(id: Long) = repository.findByIdOrNull(id)?.toAvenger();

    override fun getAvengers(): List<Avenger> =
        repository.findAll().map { it.toAvenger() }


}