package com.study.avengersapi.resource.avenger

import com.study.avengersapi.domain.avenger.Avenger
import com.study.avengersapi.domain.avenger.AvengersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class AvengerRepositoryImpl(
    @Autowired private val repository: AvengerEntityRepository
): AvengersRepository {

    override fun getDetail(id: Long) = repository.findByIdOrNull(id)?.toAvenger();

    override fun getAvengers(): List<Avenger> =
        repository.findAll().map { it.toAvenger() }

    override fun create(avenger: Avenger): Avenger =
        repository.save(AvengerEntity.from(avenger)).toAvenger()

    override fun delete(id: Long) = repository.deleteById(id)

    override fun update(avenger: Avenger) = repository.save(AvengerEntity.from(avenger)).toAvenger()
}