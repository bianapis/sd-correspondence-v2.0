package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRequestOutputModel
 */
public class CRCorrespondenceOperatingSessionRequestOutputModel   {
  private String correspondenceOperatingSessionRequestActionTaskReference = null;

  private Object correspondenceOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence Operating Session instance request service call 
   * @return correspondenceOperatingSessionRequestActionTaskReference
  **/

  public String getCorrespondenceOperatingSessionRequestActionTaskReference() {
    return correspondenceOperatingSessionRequestActionTaskReference;
  }

  public void setCorrespondenceOperatingSessionRequestActionTaskReference(String correspondenceOperatingSessionRequestActionTaskReference) {
    this.correspondenceOperatingSessionRequestActionTaskReference = correspondenceOperatingSessionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

