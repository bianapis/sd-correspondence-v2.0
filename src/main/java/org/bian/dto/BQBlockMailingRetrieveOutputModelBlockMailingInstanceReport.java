package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport
 */
public class BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport   {
  private Object blockMailingInstanceReportRecord = null;

  private String blockMailingInstanceReportType = null;

  private String blockMailingInstanceReportParameters = null;

  private Object blockMailingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return blockMailingInstanceReportRecord
  **/

  public Object getBlockMailingInstanceReportRecord() {
    return blockMailingInstanceReportRecord;
  }

  public void setBlockMailingInstanceReportRecord(Object blockMailingInstanceReportRecord) {
    this.blockMailingInstanceReportRecord = blockMailingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return blockMailingInstanceReportType
  **/

  public String getBlockMailingInstanceReportType() {
    return blockMailingInstanceReportType;
  }

  public void setBlockMailingInstanceReportType(String blockMailingInstanceReportType) {
    this.blockMailingInstanceReportType = blockMailingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return blockMailingInstanceReportParameters
  **/

  public String getBlockMailingInstanceReportParameters() {
    return blockMailingInstanceReportParameters;
  }

  public void setBlockMailingInstanceReportParameters(String blockMailingInstanceReportParameters) {
    this.blockMailingInstanceReportParameters = blockMailingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return blockMailingInstanceReport
  **/

  public Object getBlockMailingInstanceReport() {
    return blockMailingInstanceReport;
  }

  public void setBlockMailingInstanceReport(Object blockMailingInstanceReport) {
    this.blockMailingInstanceReport = blockMailingInstanceReport;
  }


}

