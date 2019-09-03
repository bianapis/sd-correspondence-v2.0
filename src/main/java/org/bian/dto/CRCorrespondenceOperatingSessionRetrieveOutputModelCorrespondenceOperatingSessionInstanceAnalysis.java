package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis
 */
public class CRCorrespondenceOperatingSessionRetrieveOutputModelCorrespondenceOperatingSessionInstanceAnalysis   {
  private String correspondenceOperatingSessionInstanceAnalysisData = null;

  private String correspondenceOperatingSessionInstanceAnalysisReportType = null;

  private Object correspondenceOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return correspondenceOperatingSessionInstanceAnalysisData
  **/

  public String getCorrespondenceOperatingSessionInstanceAnalysisData() {
    return correspondenceOperatingSessionInstanceAnalysisData;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysisData(String correspondenceOperatingSessionInstanceAnalysisData) {
    this.correspondenceOperatingSessionInstanceAnalysisData = correspondenceOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return correspondenceOperatingSessionInstanceAnalysisReportType
  **/

  public String getCorrespondenceOperatingSessionInstanceAnalysisReportType() {
    return correspondenceOperatingSessionInstanceAnalysisReportType;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysisReportType(String correspondenceOperatingSessionInstanceAnalysisReportType) {
    this.correspondenceOperatingSessionInstanceAnalysisReportType = correspondenceOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return correspondenceOperatingSessionInstanceAnalysisReport
  **/

  public Object getCorrespondenceOperatingSessionInstanceAnalysisReport() {
    return correspondenceOperatingSessionInstanceAnalysisReport;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysisReport(Object correspondenceOperatingSessionInstanceAnalysisReport) {
    this.correspondenceOperatingSessionInstanceAnalysisReport = correspondenceOperatingSessionInstanceAnalysisReport;
  }


}

