package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis
 */
public class BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis   {
  private Object blockMailingInstanceAnalysisRecord = null;

  private String blockMailingInstanceAnalysisReportType = null;

  private String blockMailingInstanceAnalysisParameters = null;

  private Object blockMailingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return blockMailingInstanceAnalysisRecord
  **/

  public Object getBlockMailingInstanceAnalysisRecord() {
    return blockMailingInstanceAnalysisRecord;
  }

  public void setBlockMailingInstanceAnalysisRecord(Object blockMailingInstanceAnalysisRecord) {
    this.blockMailingInstanceAnalysisRecord = blockMailingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return blockMailingInstanceAnalysisReportType
  **/

  public String getBlockMailingInstanceAnalysisReportType() {
    return blockMailingInstanceAnalysisReportType;
  }

  public void setBlockMailingInstanceAnalysisReportType(String blockMailingInstanceAnalysisReportType) {
    this.blockMailingInstanceAnalysisReportType = blockMailingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return blockMailingInstanceAnalysisParameters
  **/

  public String getBlockMailingInstanceAnalysisParameters() {
    return blockMailingInstanceAnalysisParameters;
  }

  public void setBlockMailingInstanceAnalysisParameters(String blockMailingInstanceAnalysisParameters) {
    this.blockMailingInstanceAnalysisParameters = blockMailingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return blockMailingInstanceAnalysisReport
  **/

  public Object getBlockMailingInstanceAnalysisReport() {
    return blockMailingInstanceAnalysisReport;
  }

  public void setBlockMailingInstanceAnalysisReport(Object blockMailingInstanceAnalysisReport) {
    this.blockMailingInstanceAnalysisReport = blockMailingInstanceAnalysisReport;
  }


}

