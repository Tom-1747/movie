package com.movie.demo.endpoint.rest.controller;

import com.movie.demo.endpoint.rest.model.MovieDto;
import com.movie.demo.endpoint.rest.model.MovieInputDto;
import com.movie.demo.service.MovieService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MovieController {

  private final MovieService movieService;

  @PutMapping("/movies")
  @PreAuthorize("hasRole('MANAGER')")
  public ResponseEntity<MovieDto> createOrUpdateMovie(
      @RequestParam(required = false) UUID movieId, @RequestBody MovieInputDto input) {
    var result = movieService.createOrUpdateMovie(movieId, input);
    return ResponseEntity.ok(result);
  }
}
