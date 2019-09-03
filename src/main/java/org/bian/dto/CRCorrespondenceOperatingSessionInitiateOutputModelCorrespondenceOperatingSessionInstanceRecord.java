package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord
 */
public class CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord   {
  private String correspondenceServiceSessionStatistics = null;

  private String correspondenceServiceSessionReportType = null;

  private Object correspondenceServiceSessionReport = null;

  private String correspondenceServiceSessionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session 
   * @return correspondenceServiceSessionStatistics
  **/

  public String getCorrespondenceServiceSessionStatistics() {
    return correspondenceServiceSessionStatistics;
  }

  public void setCorrespondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
    this.correspondenceServiceSessionStatistics = correspondenceServiceSessionStatistics;
  }


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

