package com.study.avengersapi.resource.avenger

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy
import javax.persistence.*

@Entity
@Table(name = "avenger")
data class AvengerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(nullable = false)
    val nick: String,
    @Column(nullable = false)
    val person: String,

    val description: String?,

    val history: String?
)