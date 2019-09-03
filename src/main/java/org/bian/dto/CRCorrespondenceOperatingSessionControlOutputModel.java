package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionControlOutputModel
 */
public class CRCorrespondenceOperatingSessionControlOutputModel   {
  private String correspondenceOperatingSessionControlActionTaskReference = null;

  private Object correspondenceOperatingSessionControlActionTaskRecord = null;

  private String correspondenceOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence Operating Session instance control processing service call 
   * @return correspondenceOperatingSessionControlActionTaskReference
  **/

  public String getCorrespondenceOperatingSessionControlActionTaskReference() {
    return correspondenceOperatingSessionControlActionTaskReference;
  }

  public void setCorrespondenceOperatingSessionControlActionTaskReference(String correspondenceOperatingSessionControlActionTaskReference) {
    this.correspondenceOperatingSessionControlActionTaskReference = correspondenceOperatingSessionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return correspondenceOperatingSessionControlActionResponse
  **/

  public String getCorrespondenceOperatingSessionControlActionResponse() {
    return correspondenceOperatingSessionControlActionResponse;
  }

  public void setCorrespondenceOperatingSessionControlActionResponse(String correspondenceOperatingSessionControlActionResponse) {
    this.correspondenceOperatingSessionControlActionResponse = correspondenceOperatingSessionControlActionResponse;
  }


}

