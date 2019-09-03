package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis
 */
public class BQOutboundWithResponseRetrieveInputModelOutboundWithResponseInstanceAnalysis   {
  private String outboundWithResponseInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return outboundWithResponseInstanceAnalysisReference
  **/

  public String getOutboundWithResponseInstanceAnalysisReference() {
    return outboundWithResponseInstanceAnalysisReference;
  }

  public void setOutboundWithResponseInstanceAnalysisReference(String outboundWithResponseInstanceAnalysisReference) {
    this.outboundWithResponseInstanceAnalysisReference = outboundWithResponseInstanceAnalysisReference;
  }


}

