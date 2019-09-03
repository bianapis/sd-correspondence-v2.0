package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveInputModelBlockMailingInstanceReport
 */
public class BQBlockMailingRetrieveInputModelBlockMailingInstanceReport   {
  private String blockMailingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return blockMailingInstanceReportReference
  **/

  public String getBlockMailingInstanceReportReference() {
    return blockMailingInstanceReportReference;
  }

  public void setBlockMailingInstanceReportReference(String blockMailingInstanceReportReference) {
    this.blockMailingInstanceReportReference = blockMailingInstanceReportReference;
  }


}

