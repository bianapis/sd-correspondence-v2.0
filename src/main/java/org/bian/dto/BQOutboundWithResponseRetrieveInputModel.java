package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis;
import org.bian.dto.BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveInputModel
 */
public class BQOutboundWithResponseRetrieveInputModel   {
  private Object outboundWithResponseRetrieveActionTaskRecord = null;

  private String outboundWithResponseRetrieveActionRequest = null;

  private BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport outboundWithResponseInstanceReport = null;

  private BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis outboundWithResponseInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return outboundWithResponseRetrieveActionTaskRecord
  **/

  public Object getOutboundWithResponseRetrieveActionTaskRecord() {
    return outboundWithResponseRetrieveActionTaskRecord;
  }

  public void setOutboundWithResponseRetrieveActionTaskRecord(Object outboundWithResponseRetrieveActionTaskRecord) {
    this.outboundWithResponseRetrieveActionTaskRecord = outboundWithResponseRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return outboundWithResponseRetrieveActionRequest
  **/

  public String getOutboundWithResponseRetrieveActionRequest() {
    return outboundWithResponseRetrieveActionRequest;
  }

  public void setOutboundWithResponseRetrieveActionRequest(String outboundWithResponseRetrieveActionRequest) {
    this.outboundWithResponseRetrieveActionRequest = outboundWithResponseRetrieveActionRequest;
  }


  /**
   * Get outboundWithResponseInstanceReport
   * @return outboundWithResponseInstanceReport
  **/

  public BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport getOutboundWithResponseInstanceReport() {
    return outboundWithResponseInstanceReport;
  }

  public void setOutboundWithResponseInstanceReport(BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport outboundWithResponseInstanceReport) {
    this.outboundWithResponseInstanceReport = outboundWithResponseInstanceReport;
  }


  /**
   * Get outboundWithResponseInstanceAnalysis
   * @return outboundWithResponseInstanceAnalysis
  **/

  public BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis getOutboundWithResponseInstanceAnalysis() {
    return outboundWithResponseInstanceAnalysis;
  }

  public void setOutboundWithResponseInstanceAnalysis(BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis outboundWithResponseInstanceAnalysis) {
    this.outboundWithResponseInstanceAnalysis = outboundWithResponseInstanceAnalysis;
  }


}

