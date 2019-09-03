package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundUpdateInputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundUpdateInputModel
 */
public class BQOutboundUpdateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private String outboundInstanceReference = null;

  private BQOutboundUpdateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private Object outboundUpdateActionTaskRecord = null;

  private String outboundUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound instance 
   * @return outboundInstanceReference
  **/

  public String getOutboundInstanceReference() {
    return outboundInstanceReference;
  }

  public void setOutboundInstanceReference(String outboundInstanceReference) {
    this.outboundInstanceReference = outboundInstanceReference;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundUpdateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundUpdateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundUpdateActionTaskRecord
  **/

  public Object getOutboundUpdateActionTaskRecord() {
    return outboundUpdateActionTaskRecord;
  }

  public void setOutboundUpdateActionTaskRecord(Object outboundUpdateActionTaskRecord) {
    this.outboundUpdateActionTaskRecord = outboundUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return outboundUpdateActionRequest
  **/

  public String getOutboundUpdateActionRequest() {
    return outboundUpdateActionRequest;
  }

  public void setOutboundUpdateActionRequest(String outboundUpdateActionRequest) {
    this.outboundUpdateActionRequest = outboundUpdateActionRequest;
  }


}

