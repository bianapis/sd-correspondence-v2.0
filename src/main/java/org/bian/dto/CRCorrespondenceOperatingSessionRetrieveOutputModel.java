package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveOutputModel
 */
public class CRCorrespondenceOperatingSessionRetrieveOutputModel   {
  private CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionRetrieveActionTaskReference = null;

  private Object correspondenceOperatingSessionRetrieveActionTaskRecord = null;

  private String correspondenceOperatingSessionRetrieveActionResponse = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord correspondenceOperatingSessionInstanceReportRecord = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis correspondenceOperatingSessionInstanceAnalysis = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence Operating Session instance retrieve service call 
   * @return correspondenceOperatingSessionRetrieveActionTaskReference
  **/

  public String getCorrespondenceOperatingSessionRetrieveActionTaskReference() {
    return correspondenceOperatingSessionRetrieveActionTaskReference;
  }

  public void setCorrespondenceOperatingSessionRetrieveActionTaskReference(String correspondenceOperatingSessionRetrieveActionTaskReference) {
    this.correspondenceOperatingSessionRetrieveActionTaskReference = correspondenceOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondenceOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getCorrespondenceOperatingSessionRetrieveActionTaskRecord() {
    return correspondenceOperatingSessionRetrieveActionTaskRecord;
  }

  public void setCorrespondenceOperatingSessionRetrieveActionTaskRecord(Object correspondenceOperatingSessionRetrieveActionTaskRecord) {
    this.correspondenceOperatingSessionRetrieveActionTaskRecord = correspondenceOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return correspondenceOperatingSessionRetrieveActionResponse
  **/

  public String getCorrespondenceOperatingSessionRetrieveActionResponse() {
    return correspondenceOperatingSessionRetrieveActionResponse;
  }

  public void setCorrespondenceOperatingSessionRetrieveActionResponse(String correspondenceOperatingSessionRetrieveActionResponse) {
    this.correspondenceOperatingSessionRetrieveActionResponse = correspondenceOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get correspondenceOperatingSessionInstanceReportRecord
   * @return correspondenceOperatingSessionInstanceReportRecord
  **/

  public CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord getCorrespondenceOperatingSessionInstanceReportRecord() {
    return correspondenceOperatingSessionInstanceReportRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceReportRecord(CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord correspondenceOperatingSessionInstanceReportRecord) {
    this.correspondenceOperatingSessionInstanceReportRecord = correspondenceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get correspondenceOperatingSessionInstanceAnalysis
   * @return correspondenceOperatingSessionInstanceAnalysis
  **/

  public CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis getCorrespondenceOperatingSessionInstanceAnalysis() {
    return correspondenceOperatingSessionInstanceAnalysis;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysis(CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis correspondenceOperatingSessionInstanceAnalysis) {
    this.correspondenceOperatingSessionInstanceAnalysis = correspondenceOperatingSessionInstanceAnalysis;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


}

