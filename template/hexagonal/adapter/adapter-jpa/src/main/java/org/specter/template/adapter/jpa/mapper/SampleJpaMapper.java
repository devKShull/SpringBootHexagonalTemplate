package org.specter.template.adapter.jpa.mapper;

import org.mapstruct.Mapper;
import org.specter.template.adapter.jpa.entity.SampleJpaEntity;
import org.specter.template.domain.SampleDomain;

@Mapper
public interface SampleJpaMapper {

  SampleJpaEntity domain2Entity(SampleDomain domain);

  SampleDomain entity2Domain(SampleJpaEntity domain);
}
