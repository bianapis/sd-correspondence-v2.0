package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRequestInputModel
 */
public class CRCorrespondenceOperatingSessionRequestInputModel   {
  private String correspondenceServicingSessionReference = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private Object correspondenceOperatingSessionRequestActionTaskRecord = null;

  private CRCorrespondenceOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return correspondenceOperatingSessionRequestActionTaskRecord
  **/

  public Object getCorrespondenceOperatingSessionRequestActionTaskRecord() {
    return correspondenceOperatingSessionRequestActionTaskRecord;
  }

  public void setCorrespondenceOperatingSessionRequestActionTaskRecord(Object correspondenceOperatingSessionRequestActionTaskRecord) {
    this.correspondenceOperatingSessionRequestActionTaskRecord = correspondenceOperatingSessionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCorrespondenceOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCorrespondenceOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

