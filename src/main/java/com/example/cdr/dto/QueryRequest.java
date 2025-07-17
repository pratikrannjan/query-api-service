package com.example.cdr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record QueryRequest(
    @JsonProperty("record_date_start")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime recordDateStart,

    @JsonProperty("record_date_end")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime recordDateEnd,

    @JsonProperty("msisdn")
    String msisdn,

    @JsonProperty("imsi")
    String imsi
) {}
