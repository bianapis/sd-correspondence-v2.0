package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionUpdateOutputModel
 */
public class CRCorrespondenceOperatingSessionUpdateOutputModel   {
  private CRCorrespondenceOperatingSessionInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionUpdateActionTaskReference = null;

  private Object correspondenceOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return correspondenceOperatingSessionUpdateActionTaskReference
  **/

  public String getCorrespondenceOperatingSessionUpdateActionTaskReference() {
    return correspondenceOperatingSessionUpdateActionTaskReference;
  }

  public void setCorrespondenceOperatingSessionUpdateActionTaskReference(String correspondenceOperatingSessionUpdateActionTaskReference) {
    this.correspondenceOperatingSessionUpdateActionTaskReference = correspondenceOperatingSessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return correspondenceOperatingSessionUpdateActionTaskRecord
  **/

  public Object getCorrespondenceOperatingSessionUpdateActionTaskRecord() {
    return correspondenceOperatingSessionUpdateActionTaskRecord;
  }

  public void setCorrespondenceOperatingSessionUpdateActionTaskRecord(Object correspondenceOperatingSessionUpdateActionTaskRecord) {
    this.correspondenceOperatingSessionUpdateActionTaskRecord = correspondenceOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

