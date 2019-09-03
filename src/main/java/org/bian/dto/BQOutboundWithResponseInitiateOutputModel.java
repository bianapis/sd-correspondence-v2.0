package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseInitiateOutputModel
 */
public class BQOutboundWithResponseInitiateOutputModel   {
  private BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String outboundWithResponseInstanceReference = null;

  private String outboundWithResponseInitiateActionReference = null;

  private Object outboundWithResponseInitiateActionRecord = null;

  private String outboundWithResponseInstanceStatus = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound With Response instance 
   * @return outboundWithResponseInstanceReference
  **/

  public String getOutboundWithResponseInstanceReference() {
    return outboundWithResponseInstanceReference;
  }

  public void setOutboundWithResponseInstanceReference(String outboundWithResponseInstanceReference) {
    this.outboundWithResponseInstanceReference = outboundWithResponseInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return outboundWithResponseInitiateActionReference
  **/

  public String getOutboundWithResponseInitiateActionReference() {
    return outboundWithResponseInitiateActionReference;
  }

  public void setOutboundWithResponseInitiateActionReference(String outboundWithResponseInitiateActionReference) {
    this.outboundWithResponseInitiateActionReference = outboundWithResponseInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return outboundWithResponseInitiateActionRecord
  **/

  public Object getOutboundWithResponseInitiateActionRecord() {
    return outboundWithResponseInitiateActionRecord;
  }

  public void setOutboundWithResponseInitiateActionRecord(Object outboundWithResponseInitiateActionRecord) {
    this.outboundWithResponseInitiateActionRecord = outboundWithResponseInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Outbound With Response instance (e.g. initialised, pending, active) 
   * @return outboundWithResponseInstanceStatus
  **/

  public String getOutboundWithResponseInstanceStatus() {
    return outboundWithResponseInstanceStatus;
  }

  public void setOutboundWithResponseInstanceStatus(String outboundWithResponseInstanceStatus) {
    this.outboundWithResponseInstanceStatus = outboundWithResponseInstanceStatus;
  }


}

