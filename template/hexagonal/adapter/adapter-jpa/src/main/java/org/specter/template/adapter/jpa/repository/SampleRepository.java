package org.specter.template.adapter.jpa.repository;

import org.specter.template.adapter.jpa.entity.SampleJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleJpaEntity, Long> {

}
