package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord
 */
public class CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord   {
  private Object correspondenceServiceSessionReport = null;

  private String correspondenceServiceSessionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session activity report 
   * @return correspondenceServiceSessionReport
  **/

  public Object getCorrespondenceServiceSessionReport() {
    return correspondenceServiceSessionReport;
  }

  public void setCorrespondenceServiceSessionReport(Object correspondenceServiceSessionReport) {
    this.correspondenceServiceSessionReport = correspondenceServiceSessionReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times for the session 
   * @return correspondenceServiceSessionDate
  **/

  public String getCorrespondenceServiceSessionDate() {
    return correspondenceServiceSessionDate;
  }

  public void setCorrespondenceServiceSessionDate(String correspondenceServiceSessionDate) {
    this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
  }


}

