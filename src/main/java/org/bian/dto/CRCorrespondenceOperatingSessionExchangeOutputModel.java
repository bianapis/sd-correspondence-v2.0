package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionExchangeOutputModel
 */
public class CRCorrespondenceOperatingSessionExchangeOutputModel   {
  private CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionExchangeActionTaskReference = null;

  private Object correspondenceOperatingSessionExchangeActionTaskRecord = null;

  private String correspondenceOperatingSessionExchangeActionResponse = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(CRCorrespondenceOperatingSessionExchangeOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence Operating Session instance exchange service call 
   * @return correspondenceOperatingSessionExchangeActionTaskReference
  **/

  public String getCorrespondenceOperatingSessionExchangeActionTaskReference() {
    return correspondenceOperatingSessionExchangeActionTaskReference;
  }

  public void setCorrespondenceOperatingSessionExchangeActionTaskReference(String correspondenceOperatingSessionExchangeActionTaskReference) {
    this.correspondenceOperatingSessionExchangeActionTaskReference = correspondenceOperatingSessionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return correspondenceOperatingSessionExchangeActionResponse
  **/

  public String getCorrespondenceOperatingSessionExchangeActionResponse() {
    return correspondenceOperatingSessionExchangeActionResponse;
  }

  public void setCorrespondenceOperatingSessionExchangeActionResponse(String correspondenceOperatingSessionExchangeActionResponse) {
    this.correspondenceOperatingSessionExchangeActionResponse = correspondenceOperatingSessionExchangeActionResponse;
  }


}

