package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord
 */
public class BQOutboundWithResponseRetrieveOutputModelOutboundWithResponseInstanceRecord   {
  private String responseDueDate = null;

  private String responseCorrespondenceReference = null;

  private Object responseCorrespondenceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Date when the response expected. This can result in chasing activities and notification to the sending unit 
   * @return responseDueDate
  **/

  public String getResponseDueDate() {
    return responseDueDate;
  }

  public void setResponseDueDate(String responseDueDate) {
    this.responseDueDate = responseDueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the inbound correspondence received that has been matched to the outbound message 
   * @return responseCorrespondenceReference
  **/

  public String getResponseCorrespondenceReference() {
    return responseCorrespondenceReference;
  }

  public void setResponseCorrespondenceReference(String responseCorrespondenceReference) {
    this.responseCorrespondenceReference = responseCorrespondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Content of the inbound correspondence 
   * @return responseCorrespondenceRecord
  **/

  public Object getResponseCorrespondenceRecord() {
    return responseCorrespondenceRecord;
  }

  public void setResponseCorrespondenceRecord(Object responseCorrespondenceRecord) {
    this.responseCorrespondenceRecord = responseCorrespondenceRecord;
  }


}

