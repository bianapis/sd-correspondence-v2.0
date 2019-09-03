package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord
 */
public class CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord   {
  private String correspondenceServiceSessionReportType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return correspondenceServiceSessionReportType
  **/

  public String getCorrespondenceServiceSessionReportType() {
    return correspondenceServiceSessionReportType;
  }

  public void setCorrespondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
    this.correspondenceServiceSessionReportType = correspondenceServiceSessionReportType;
  }


}

