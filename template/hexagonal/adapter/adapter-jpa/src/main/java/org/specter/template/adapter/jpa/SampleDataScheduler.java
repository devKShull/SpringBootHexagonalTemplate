package org.specter.template.adapter.jpa;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.specter.template.adapter.jpa.repository.SampleRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@EnableScheduling
@Component
@AllArgsConstructor
public class SampleDataScheduler {

  private final SampleRepository repository;

  @Scheduled(fixedDelay = 3000)
  public void execute() {
    log.info("Sample select schedule task start");
    repository.findAll().forEach(sampleJpaEntity -> log.info("{}", sampleJpaEntity));
  }
}
