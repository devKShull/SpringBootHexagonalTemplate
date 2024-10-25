package org.specter.template.adapter.rest.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Sample")
public class SampleEntity {
  private String sample1;
  private String sample2;
}
