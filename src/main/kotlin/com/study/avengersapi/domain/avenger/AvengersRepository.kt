package com.study.avengersapi.domain.avenger

interface AvengersRepository {
    fun getDetail(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger):Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger):Avenger
}