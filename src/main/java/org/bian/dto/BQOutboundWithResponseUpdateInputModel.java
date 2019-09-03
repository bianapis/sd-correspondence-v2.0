package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseUpdateInputModel
 */
public class BQOutboundWithResponseUpdateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private String outboundWithResponseInstanceReference = null;

  private BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord = null;

  private Object outboundWithResponseUpdateActionTaskRecord = null;

  private String outboundWithResponseUpdateActionRequest = null;


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
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
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
   * Get outboundWithResponseInstanceRecord
   * @return outboundWithResponseInstanceRecord
  **/

  public BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord getOutboundWithResponseInstanceRecord() {
    return outboundWithResponseInstanceRecord;
  }

  public void setOutboundWithResponseInstanceRecord(BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord) {
    this.outboundWithResponseInstanceRecord = outboundWithResponseInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundWithResponseUpdateActionTaskRecord
  **/

  public Object getOutboundWithResponseUpdateActionTaskRecord() {
    return outboundWithResponseUpdateActionTaskRecord;
  }

  public void setOutboundWithResponseUpdateActionTaskRecord(Object outboundWithResponseUpdateActionTaskRecord) {
    this.outboundWithResponseUpdateActionTaskRecord = outboundWithResponseUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return outboundWithResponseUpdateActionRequest
  **/

  public String getOutboundWithResponseUpdateActionRequest() {
    return outboundWithResponseUpdateActionRequest;
  }

  public void setOutboundWithResponseUpdateActionRequest(String outboundWithResponseUpdateActionRequest) {
    this.outboundWithResponseUpdateActionRequest = outboundWithResponseUpdateActionRequest;
  }


}

