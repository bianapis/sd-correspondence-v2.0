package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord
 */
public class CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecord   {
  private String correspondenceSourceReference = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Internal source reference to the correspondence item passed for delivery (can be used to match responses) 
   * @return correspondenceSourceReference
  **/

  public String getCorrespondenceSourceReference() {
    return correspondenceSourceReference;
  }

  public void setCorrespondenceSourceReference(String correspondenceSourceReference) {
    this.correspondenceSourceReference = correspondenceSourceReference;
  }


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

