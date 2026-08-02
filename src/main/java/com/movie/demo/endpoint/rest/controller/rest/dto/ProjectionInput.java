package com.movie.demo.endpoint.rest.controller.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectionInput {
  private UUID id;

  @NotNull private Instant datetime;

  @NotNull private BigDecimal seatPrice;

  @NotNull private UUID movieId;

  @NotNull private UUID roomId;
}
