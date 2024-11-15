package com.br.SistemaDePontuacao.Repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.br.SistemaDePontuacao.Model.auth.ImagemCAntigas1;


public interface ImageCarrosselRepositoryImagensAntigas1 extends JpaRepository<ImagemCAntigas1, Long> {
    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "TRUNCATE TABLE imagemcantigas1", nativeQuery = true)
    Integer deleteImagem();
}

