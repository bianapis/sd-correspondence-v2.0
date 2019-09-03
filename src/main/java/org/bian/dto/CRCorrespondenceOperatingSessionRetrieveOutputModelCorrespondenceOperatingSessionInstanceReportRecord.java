package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord
 */
public class CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceReportRecord   {
  private String correspondenceOperatingSessionInstanceReportData = null;

  private String correspondenceOperatingSessionInstanceReportType = null;

  private Object correspondenceOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return correspondenceOperatingSessionInstanceReportData
  **/

  public String getCorrespondenceOperatingSessionInstanceReportData() {
    return correspondenceOperatingSessionInstanceReportData;
  }

  public void setCorrespondenceOperatingSessionInstanceReportData(String correspondenceOperatingSessionInstanceReportData) {
    this.correspondenceOperatingSessionInstanceReportData = correspondenceOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return correspondenceOperatingSessionInstanceReportType
  **/

  public String getCorrespondenceOperatingSessionInstanceReportType() {
    return correspondenceOperatingSessionInstanceReportType;
  }

  public void setCorrespondenceOperatingSessionInstanceReportType(String correspondenceOperatingSessionInstanceReportType) {
    this.correspondenceOperatingSessionInstanceReportType = correspondenceOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return correspondenceOperatingSessionInstanceReport
  **/

  public Object getCorrespondenceOperatingSessionInstanceReport() {
    return correspondenceOperatingSessionInstanceReport;
  }

  public void setCorrespondenceOperatingSessionInstanceReport(Object correspondenceOperatingSessionInstanceReport) {
    this.correspondenceOperatingSessionInstanceReport = correspondenceOperatingSessionInstanceReport;
  }


}

