package com.example.cdr.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "call_detail_records")
public class CallDetailRecord {

  @Id
  @Column(name = "id", nullable = false, length = 150)
  private String id;

  @Column(name = "record_date", nullable = false)
  private LocalDateTime recordDate;

  @Column(name = "msisdn", length = 18)
  private String msisdn;

  @Column(name = "imsi", length = 100)
  private String imsi;

 
  public LocalDateTime getRecordDate() {
    return recordDate;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public String getImsi() {
    return imsi;
  }

 
  public void setRecordDate(LocalDateTime recordDate) {
    this.recordDate = recordDate;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
