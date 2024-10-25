package org.specter.template.aplication.inport;

import lombok.AllArgsConstructor;
import org.specter.template.aplication.outport.SampleOutPort;
import org.specter.template.domain.SampleDomain;


@AllArgsConstructor
public class SampleInPortImpl implements SampleInPort {

  private final SampleOutPort outPort;

  @Override
  public boolean sampleInAction(SampleDomain domain) {
    outPort.sampleOutAction(domain);

    return true;
  }
}
