package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport
 */
public class BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceReport   {
  private Object outboundWithResponseInstanceReportRecord = null;

  private String outboundWithResponseInstanceReportType = null;

  private String outboundWithResponseInstanceReportParameters = null;

  private Object outboundWithResponseInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return outboundWithResponseInstanceReportRecord
  **/

  public Object getOutboundWithResponseInstanceReportRecord() {
    return outboundWithResponseInstanceReportRecord;
  }

  public void setOutboundWithResponseInstanceReportRecord(Object outboundWithResponseInstanceReportRecord) {
    this.outboundWithResponseInstanceReportRecord = outboundWithResponseInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return outboundWithResponseInstanceReportType
  **/

  public String getOutboundWithResponseInstanceReportType() {
    return outboundWithResponseInstanceReportType;
  }

  public void setOutboundWithResponseInstanceReportType(String outboundWithResponseInstanceReportType) {
    this.outboundWithResponseInstanceReportType = outboundWithResponseInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return outboundWithResponseInstanceReportParameters
  **/

  public String getOutboundWithResponseInstanceReportParameters() {
    return outboundWithResponseInstanceReportParameters;
  }

  public void setOutboundWithResponseInstanceReportParameters(String outboundWithResponseInstanceReportParameters) {
    this.outboundWithResponseInstanceReportParameters = outboundWithResponseInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return outboundWithResponseInstanceReport
  **/

  public Object getOutboundWithResponseInstanceReport() {
    return outboundWithResponseInstanceReport;
  }

  public void setOutboundWithResponseInstanceReport(Object outboundWithResponseInstanceReport) {
    this.outboundWithResponseInstanceReport = outboundWithResponseInstanceReport;
  }


}

