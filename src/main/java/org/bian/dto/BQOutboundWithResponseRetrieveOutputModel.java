package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundWithResponseRetrieveOutputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis;
import org.bian.dto.BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord;
import org.bian.dto.BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveOutputModel
 */
public class BQOutboundWithResponseRetrieveOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQOutboundWithResponseRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord = null;

  private String outboundWithResponseRetrieveActionTaskReference = null;

  private Object outboundWithResponseRetrieveActionTaskRecord = null;

  private String outboundWithResponseRetrieveActionResponse = null;

  private BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport outboundWithResponseInstanceReport = null;

  private BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis outboundWithResponseInstanceAnalysis = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundWithResponseRetrieveOutputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundWithResponseRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * Get outboundWithResponseInstanceRecord
   * @return outboundWithResponseInstanceRecord
  **/

  public BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord getOutboundWithResponseInstanceRecord() {
    return outboundWithResponseInstanceRecord;
  }

  public void setOutboundWithResponseInstanceRecord(BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord) {
    this.outboundWithResponseInstanceRecord = outboundWithResponseInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Outbound With Response instance retrieve service call 
   * @return outboundWithResponseRetrieveActionTaskReference
  **/

  public String getOutboundWithResponseRetrieveActionTaskReference() {
    return outboundWithResponseRetrieveActionTaskReference;
  }

  public void setOutboundWithResponseRetrieveActionTaskReference(String outboundWithResponseRetrieveActionTaskReference) {
    this.outboundWithResponseRetrieveActionTaskReference = outboundWithResponseRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return outboundWithResponseRetrieveActionResponse
  **/

  public String getOutboundWithResponseRetrieveActionResponse() {
    return outboundWithResponseRetrieveActionResponse;
  }

  public void setOutboundWithResponseRetrieveActionResponse(String outboundWithResponseRetrieveActionResponse) {
    this.outboundWithResponseRetrieveActionResponse = outboundWithResponseRetrieveActionResponse;
  }


  /**
   * Get outboundWithResponseInstanceReport
   * @return outboundWithResponseInstanceReport
  **/

  public BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport getOutboundWithResponseInstanceReport() {
    return outboundWithResponseInstanceReport;
  }

  public void setOutboundWithResponseInstanceReport(BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport outboundWithResponseInstanceReport) {
    this.outboundWithResponseInstanceReport = outboundWithResponseInstanceReport;
  }


  /**
   * Get outboundWithResponseInstanceAnalysis
   * @return outboundWithResponseInstanceAnalysis
  **/

  public BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis getOutboundWithResponseInstanceAnalysis() {
    return outboundWithResponseInstanceAnalysis;
  }

  public void setOutboundWithResponseInstanceAnalysis(BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis outboundWithResponseInstanceAnalysis) {
    this.outboundWithResponseInstanceAnalysis = outboundWithResponseInstanceAnalysis;
  }


}

