package com.study.avengersapi.resource.avenger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Repository

@Repository
@EnableJpaRepositories
interface AvengerEntityRepositorylmlm: JpaRepository<AvengerEntity, Long>