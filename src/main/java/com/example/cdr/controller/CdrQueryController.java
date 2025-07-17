package com.example.cdr.controller;

import com.example.cdr.dto.CdrResponse;
import com.example.cdr.dto.QueryRequest;
import com.example.cdr.entity.CallDetailRecord;
import com.example.cdr.service.CdrQueryService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/cdr")
public class CdrQueryController {

  private final CdrQueryService service;

  public CdrQueryController(CdrQueryService service) {
    this.service = service;
  }

  @PostMapping("/query")
  public ResponseEntity<List<CdrResponse>> queryCdrs(
      @Valid @RequestBody QueryRequest req) {

    List<CallDetailRecord> results = service.query(req);
    List<CdrResponse> resp = results.stream()
        .map(CdrResponse::fromEntity)
        .collect(Collectors.toList());
    return ResponseEntity.ok(resp);
  }
}
