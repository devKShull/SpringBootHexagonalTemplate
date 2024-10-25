package org.specter.template.adapter.rest.configuration;

import org.mapstruct.factory.Mappers;
import org.specter.template.adapter.rest.mapper.SampleMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

  @Bean
  public SampleMapper getSampleMapper() {
    return Mappers.getMapper(SampleMapper.class);
  }
}
