package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveOutputModelOutboundInstanceRecord
 */
public class BQOutboundRetrieveOutputModelOutboundInstanceRecord   {
  private String correspondenceSourceReference = null;

  private BQOutboundRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


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

  public BQOutboundRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQOutboundRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

