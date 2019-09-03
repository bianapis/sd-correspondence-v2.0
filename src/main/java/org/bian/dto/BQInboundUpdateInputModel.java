package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundUpdateInputModelInboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundUpdateInputModel
 */
public class BQInboundUpdateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private String inboundInstanceReference = null;

  private BQInboundUpdateInputModelInboundInstanceRecord inboundInstanceRecord = null;

  private Object inboundUpdateActionTaskRecord = null;

  private String inboundUpdateActionRequest = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Correspondence Operating Session instance 
   * @return correspondenceOperatingSessionInstanceReference
  **/

  public String getCorrespondenceOperatingSessionInstanceReference() {
    return correspondenceOperatingSessionInstanceReference;
  }

  public void setCorrespondenceOperatingSessionInstanceReference(String correspondenceOperatingSessionInstanceReference) {
    this.correspondenceOperatingSessionInstanceReference = correspondenceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inbound instance 
   * @return inboundInstanceReference
  **/

  public String getInboundInstanceReference() {
    return inboundInstanceReference;
  }

  public void setInboundInstanceReference(String inboundInstanceReference) {
    this.inboundInstanceReference = inboundInstanceReference;
  }


  /**
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundUpdateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundUpdateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inboundUpdateActionTaskRecord
  **/

  public Object getInboundUpdateActionTaskRecord() {
    return inboundUpdateActionTaskRecord;
  }

  public void setInboundUpdateActionTaskRecord(Object inboundUpdateActionTaskRecord) {
    this.inboundUpdateActionTaskRecord = inboundUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return inboundUpdateActionRequest
  **/

  public String getInboundUpdateActionRequest() {
    return inboundUpdateActionRequest;
  }

  public void setInboundUpdateActionRequest(String inboundUpdateActionRequest) {
    this.inboundUpdateActionRequest = inboundUpdateActionRequest;
  }


}

