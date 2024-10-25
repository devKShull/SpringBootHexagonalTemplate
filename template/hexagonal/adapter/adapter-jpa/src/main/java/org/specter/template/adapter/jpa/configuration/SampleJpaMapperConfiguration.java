package org.specter.template.adapter.jpa.configuration;

import org.mapstruct.factory.Mappers;
import org.specter.template.adapter.jpa.mapper.SampleJpaMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleJpaMapperConfiguration {

  @Bean
  public SampleJpaMapper getSampleJpaMapper() {
    return Mappers.getMapper(SampleJpaMapper.class);
  }
}
