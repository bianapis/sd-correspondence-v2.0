package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis
 */
public class CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceAnalysis   {
  private String correspondenceOperatingSessionInstanceAnalysisReference = null;

  private String correspondenceOperatingSessionInstanceAnalysisReportType = null;

  private String correspondenceOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return correspondenceOperatingSessionInstanceAnalysisReference
  **/

  public String getCorrespondenceOperatingSessionInstanceAnalysisReference() {
    return correspondenceOperatingSessionInstanceAnalysisReference;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysisReference(String correspondenceOperatingSessionInstanceAnalysisReference) {
    this.correspondenceOperatingSessionInstanceAnalysisReference = correspondenceOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return correspondenceOperatingSessionInstanceAnalysisParameters
  **/

  public String getCorrespondenceOperatingSessionInstanceAnalysisParameters() {
    return correspondenceOperatingSessionInstanceAnalysisParameters;
  }

  public void setCorrespondenceOperatingSessionInstanceAnalysisParameters(String correspondenceOperatingSessionInstanceAnalysisParameters) {
    this.correspondenceOperatingSessionInstanceAnalysisParameters = correspondenceOperatingSessionInstanceAnalysisParameters;
  }


}

