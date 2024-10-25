package org.specter.template.adapter.rest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.specter.template.adapter.rest.entity.SampleEntity;
import org.specter.template.adapter.rest.mapper.SampleMapper;
import org.specter.template.aplication.inport.SampleInPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class SampleController {

  private final SampleInPort inPort;
  private final SampleMapper mapper;

  @Operation(
      summary = "sample action",
      description = "sample 입니다.",
      requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
          content = {
              @Content(
                  mediaType = MediaType.APPLICATION_JSON_VALUE,
                  schema = @Schema(implementation = SampleEntity.class)
              )
          }
      )
  )
  @PostMapping("/api/v1/sample")
  public ResponseEntity<String> sampleAction(
      @RequestBody SampleEntity entity
  ) {

    final boolean result = inPort.sampleInAction(mapper.entity2Domain(entity));

    if (result) {
      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.badRequest().build();
    }
  }
}
