package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionExchangeInputModelCorrespondenceOperatingSessionExchangeActionRequest;
import org.bian.dto.CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionExchangeInputModel
 */
public class CRCorrespondenceOperatingSessionExchangeInputModel   {
  private String correspondenceServicingSessionReference = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private Object correspondenceOperatingSessionExchangeActionTaskRecord = null;

  private CRCorrespondenceOperatingSessionExchangeInputModelCorrespondenceOperatingSessionExchangeActionRequest correspondenceOperatingSessionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return correspondenceServicingSessionReference
  **/

  public String getCorrespondenceServicingSessionReference() {
    return correspondenceServicingSessionReference;
  }

  public void setCorrespondenceServicingSessionReference(String correspondenceServicingSessionReference) {
    this.correspondenceServicingSessionReference = correspondenceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Correspondence Operating Session instance 
   * @return correspondenceOperatingSessionInstanceReference
  **/

  public String getCorrespondenceOperatingSessionInstanceReference() {
    return correspondenceOperatingSessionInstanceReference;
  }

  public void setCorrespondenceOperatingSessionInstanceReference(String correspondenceOperatingSessionInstanceReference) {
    this.correspondenceOperatingSessionInstanceReference = correspondenceOperatingSessionInstanceReference;
  }


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return correspondenceOperatingSessionExchangeActionTaskRecord
  **/

  public Object getCorrespondenceOperatingSessionExchangeActionTaskRecord() {
    return correspondenceOperatingSessionExchangeActionTaskRecord;
  }

  public void setCorrespondenceOperatingSessionExchangeActionTaskRecord(Object correspondenceOperatingSessionExchangeActionTaskRecord) {
    this.correspondenceOperatingSessionExchangeActionTaskRecord = correspondenceOperatingSessionExchangeActionTaskRecord;
  }


  /**
   * Get correspondenceOperatingSessionExchangeActionRequest
   * @return correspondenceOperatingSessionExchangeActionRequest
  **/

  public CRCorrespondenceOperatingSessionExchangeInputModelCorrespondenceOperatingSessionExchangeActionRequest getCorrespondenceOperatingSessionExchangeActionRequest() {
    return correspondenceOperatingSessionExchangeActionRequest;
  }

  public void setCorrespondenceOperatingSessionExchangeActionRequest(CRCorrespondenceOperatingSessionExchangeInputModelCorrespondenceOperatingSessionExchangeActionRequest correspondenceOperatingSessionExchangeActionRequest) {
    this.correspondenceOperatingSessionExchangeActionRequest = correspondenceOperatingSessionExchangeActionRequest;
  }


}

