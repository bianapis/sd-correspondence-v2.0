package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis
 */
public class BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceAnalysis   {
  private Object outboundWithResponseInstanceAnalysisRecord = null;

  private String outboundWithResponseInstanceAnalysisReportType = null;

  private String outboundWithResponseInstanceAnalysisParameters = null;

  private Object outboundWithResponseInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return outboundWithResponseInstanceAnalysisRecord
  **/

  public Object getOutboundWithResponseInstanceAnalysisRecord() {
    return outboundWithResponseInstanceAnalysisRecord;
  }

  public void setOutboundWithResponseInstanceAnalysisRecord(Object outboundWithResponseInstanceAnalysisRecord) {
    this.outboundWithResponseInstanceAnalysisRecord = outboundWithResponseInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return outboundWithResponseInstanceAnalysisReportType
  **/

  public String getOutboundWithResponseInstanceAnalysisReportType() {
    return outboundWithResponseInstanceAnalysisReportType;
  }

  public void setOutboundWithResponseInstanceAnalysisReportType(String outboundWithResponseInstanceAnalysisReportType) {
    this.outboundWithResponseInstanceAnalysisReportType = outboundWithResponseInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return outboundWithResponseInstanceAnalysisParameters
  **/

  public String getOutboundWithResponseInstanceAnalysisParameters() {
    return outboundWithResponseInstanceAnalysisParameters;
  }

  public void setOutboundWithResponseInstanceAnalysisParameters(String outboundWithResponseInstanceAnalysisParameters) {
    this.outboundWithResponseInstanceAnalysisParameters = outboundWithResponseInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return outboundWithResponseInstanceAnalysisReport
  **/

  public Object getOutboundWithResponseInstanceAnalysisReport() {
    return outboundWithResponseInstanceAnalysisReport;
  }

  public void setOutboundWithResponseInstanceAnalysisReport(Object outboundWithResponseInstanceAnalysisReport) {
    this.outboundWithResponseInstanceAnalysisReport = outboundWithResponseInstanceAnalysisReport;
  }


}

