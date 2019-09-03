package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionInitiateInputModel
 */
public class CRCorrespondenceOperatingSessionInitiateInputModel   {
  private String correspondenceServicingSessionReference = null;

  private Object correspondenceOperatingSessionInitiateActionRecord = null;

  private String correspondenceOperatingSessionInstanceStatus = null;

  private CRCorrespondenceOperatingSessionInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return correspondenceOperatingSessionInitiateActionRecord
  **/

  public Object getCorrespondenceOperatingSessionInitiateActionRecord() {
    return correspondenceOperatingSessionInitiateActionRecord;
  }

  public void setCorrespondenceOperatingSessionInitiateActionRecord(Object correspondenceOperatingSessionInitiateActionRecord) {
    this.correspondenceOperatingSessionInitiateActionRecord = correspondenceOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondence Operating Session instance (e.g. initialised, pending, active) 
   * @return correspondenceOperatingSessionInstanceStatus
  **/

  public String getCorrespondenceOperatingSessionInstanceStatus() {
    return correspondenceOperatingSessionInstanceStatus;
  }

  public void setCorrespondenceOperatingSessionInstanceStatus(String correspondenceOperatingSessionInstanceStatus) {
    this.correspondenceOperatingSessionInstanceStatus = correspondenceOperatingSessionInstanceStatus;
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


}

