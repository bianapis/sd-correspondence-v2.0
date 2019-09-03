package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord
 */
public class CRCorrespondenceOperatingSessionRetrieveInputModelCorrespondenceOperatingSessionInstanceReportRecord   {
  private String correspondenceOperatingSessionInstanceReportReference = null;

  private String correspondenceOperatingSessionInstanceReportType = null;

  private String correspondenceOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return correspondenceOperatingSessionInstanceReportReference
  **/

  public String getCorrespondenceOperatingSessionInstanceReportReference() {
    return correspondenceOperatingSessionInstanceReportReference;
  }

  public void setCorrespondenceOperatingSessionInstanceReportReference(String correspondenceOperatingSessionInstanceReportReference) {
    this.correspondenceOperatingSessionInstanceReportReference = correspondenceOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return correspondenceOperatingSessionInstanceReportParameters
  **/

  public String getCorrespondenceOperatingSessionInstanceReportParameters() {
    return correspondenceOperatingSessionInstanceReportParameters;
  }

  public void setCorrespondenceOperatingSessionInstanceReportParameters(String correspondenceOperatingSessionInstanceReportParameters) {
    this.correspondenceOperatingSessionInstanceReportParameters = correspondenceOperatingSessionInstanceReportParameters;
  }


}

