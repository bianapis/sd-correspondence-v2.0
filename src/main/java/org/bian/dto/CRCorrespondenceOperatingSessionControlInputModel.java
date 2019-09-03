package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionControlInputModelCorrespondenceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionControlInputModel
 */
public class CRCorrespondenceOperatingSessionControlInputModel   {
  private String correspondenceServicingSessionReference = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private Object correspondenceOperatingSessionControlActionTaskRecord = null;

  private CRCorrespondenceOperatingSessionControlInputModelCorrespondenceOperatingSessionControlActionRequest correspondenceOperatingSessionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return correspondenceOperatingSessionControlActionTaskRecord
  **/

  public Object getCorrespondenceOperatingSessionControlActionTaskRecord() {
    return correspondenceOperatingSessionControlActionTaskRecord;
  }

  public void setCorrespondenceOperatingSessionControlActionTaskRecord(Object correspondenceOperatingSessionControlActionTaskRecord) {
    this.correspondenceOperatingSessionControlActionTaskRecord = correspondenceOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get correspondenceOperatingSessionControlActionRequest
   * @return correspondenceOperatingSessionControlActionRequest
  **/

  public CRCorrespondenceOperatingSessionControlInputModelCorrespondenceOperatingSessionControlActionRequest getCorrespondenceOperatingSessionControlActionRequest() {
    return correspondenceOperatingSessionControlActionRequest;
  }

  public void setCorrespondenceOperatingSessionControlActionRequest(CRCorrespondenceOperatingSessionControlInputModelCorrespondenceOperatingSessionControlActionRequest correspondenceOperatingSessionControlActionRequest) {
    this.correspondenceOperatingSessionControlActionRequest = correspondenceOperatingSessionControlActionRequest;
  }


}

