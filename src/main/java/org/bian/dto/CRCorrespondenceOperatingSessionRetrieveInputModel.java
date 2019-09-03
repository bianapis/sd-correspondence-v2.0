package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveInputModel
 */
public class CRCorrespondenceOperatingSessionRetrieveInputModel   {
  private Object correspondenceOperatingSessionRetrieveActionTaskRecord = null;

  private String correspondenceOperatingSessionRetrieveActionRequest = null;

  private CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord correspondenceOperatingSessionInstanceReportRecord = null;

  private CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis correspondenceOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return correspondenceOperatingSessionRetrieveActionRequest
  **/

  public String getCorrespondenceOperatingSessionRetrieveActionRequest() {
    return correspondenceOperatingSessionRetrieveActionRequest;
  }

  public void setCorrespondenceOperatingSessionRetrieveActionRequest(String correspondenceOperatingSessionRetrieveActionRequest) {
    this.correspondenceOperatingSessionRetrieveActionRequest = correspondenceOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get correspondenceOperatingSessionInstanceReportRecord
   * @return correspondenceOperatingSessionInstanceReportRecord
  **/

  public CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord getCorrespondenceOperatingSessionInstanceReportRecord() {
    return correspondenceOperatingSessionInstanceReportRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceReportRecord(CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord correspondenceOperatingSessionInstanceReportRecord) {
    this.correspondenceOperatingSessionInstanceReportRecord = correspondenceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get correspondenceOperatingSessionInstanceAnalysis
   * @return correspondenceOperatingSessionInstanceAnalysis
  **/

  public CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis getCorrespondenceOperatingSessionInstanceAnalysis() {
    return correspondenceOperatingSessionInstanceAnalysis;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysis(CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis correspondenceOperatingSessionInstanceAnalysis) {
    this.correspondenceOperatingSessionInstanceAnalysis = correspondenceOperatingSessionInstanceAnalysis;
  }


}

