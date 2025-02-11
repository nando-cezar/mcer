package br.com.mcer.backend.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryLocationJpaRepository extends JpaRepository<HistoryLocationEntity, Long> {}
