package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport
 */
public class BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceReport   {
  private String outboundWithResponseInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return outboundWithResponseInstanceReportReference
  **/

  public String getOutboundWithResponseInstanceReportReference() {
    return outboundWithResponseInstanceReportReference;
  }

  public void setOutboundWithResponseInstanceReportReference(String outboundWithResponseInstanceReportReference) {
    this.outboundWithResponseInstanceReportReference = outboundWithResponseInstanceReportReference;
  }


}

