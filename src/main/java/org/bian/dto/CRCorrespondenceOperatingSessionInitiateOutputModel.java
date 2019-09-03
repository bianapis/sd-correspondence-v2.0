package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionInitiateOutputModel
 */
public class CRCorrespondenceOperatingSessionInitiateOutputModel   {
  private String correspondenceOperatingSessionInstanceReference = null;

  private String correspondenceOperatingSessionInitiateActionReference = null;

  private Object correspondenceOperatingSessionInitiateActionRecord = null;

  private String correspondenceOperatingSessionInstanceStatus = null;

  private CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return correspondenceOperatingSessionInitiateActionReference
  **/

  public String getCorrespondenceOperatingSessionInitiateActionReference() {
    return correspondenceOperatingSessionInitiateActionReference;
  }

  public void setCorrespondenceOperatingSessionInitiateActionReference(String correspondenceOperatingSessionInitiateActionReference) {
    this.correspondenceOperatingSessionInitiateActionReference = correspondenceOperatingSessionInitiateActionReference;
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

  public CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


}

