package com.br.SistemaDePontuacao.Repository.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.br.SistemaDePontuacao.Model.auth.Produto;

public interface Repositoryoo extends CrudRepository<Produto, Long> {
    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros SET fatordivisao = ?1", nativeQuery = true)
    Integer fatordivisao(String fatordivisao);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros SET dtfim = ?1", nativeQuery = true)
    Integer fim(String dtfim);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros SET dtinicio = ?1", nativeQuery = true)
    Integer inicio(String dtinicio);

    @Query(value = " SELECT * FROM parametros", nativeQuery = true)
    Optional<Produto> select();



    @Query(value = " SELECT * FROM parametros1 where id=?1", nativeQuery = true)
    Optional<Produto> selectParametros(String id);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros1 SET fatordivisao = ?1 where id=?1", nativeQuery = true)
    Integer fatordivisaoParametros(String fatordivisao, String id);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros1 SET dtfim = ?1 where id= ?1", nativeQuery = true)
    Integer fimParametros(String dtfim, String id);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE parametros1 SET dtinicio = ?1 where id=?1", nativeQuery = true)
    Integer inicioParametros(String dtinicio, String id);

}
