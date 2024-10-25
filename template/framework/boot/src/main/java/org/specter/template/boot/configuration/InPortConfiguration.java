package org.specter.template.boot.configuration;

import org.specter.template.aplication.inport.SampleInPort;
import org.specter.template.aplication.inport.SampleInPortImpl;
import org.specter.template.aplication.outport.SampleOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InPortConfiguration {

  @Bean
  public SampleInPort getSampleInPort(SampleOutPort outPort) {
    return new SampleInPortImpl(outPort);
  }
}
