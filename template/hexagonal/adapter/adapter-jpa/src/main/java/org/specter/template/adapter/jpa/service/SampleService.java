package org.specter.template.adapter.jpa.service;

import lombok.AllArgsConstructor;
import org.specter.template.adapter.jpa.mapper.SampleJpaMapper;
import org.specter.template.adapter.jpa.repository.SampleRepository;
import org.specter.template.aplication.outport.SampleOutPort;
import org.specter.template.domain.SampleDomain;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SampleService implements SampleOutPort {
  private final SampleRepository repository;
  private final SampleJpaMapper mapper;

  @Override
  public void sampleOutAction(SampleDomain domain) {
    repository.save(mapper.domain2Entity(domain));

  }
}
