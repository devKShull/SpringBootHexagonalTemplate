package org.specter.template.adapter.rest.mapper;


import org.mapstruct.Mapper;
import org.specter.template.adapter.rest.entity.SampleEntity;
import org.specter.template.domain.SampleDomain;

@Mapper
public interface SampleMapper {

  SampleEntity domain2Entity(SampleDomain domain);

  SampleDomain entity2Domain(SampleEntity domain);

}
