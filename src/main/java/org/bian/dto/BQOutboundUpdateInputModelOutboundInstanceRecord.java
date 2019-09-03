package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundUpdateInputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundUpdateInputModelOutboundInstanceRecord
 */
public class BQOutboundUpdateInputModelOutboundInstanceRecord   {
  private String correspondenceSourceReference = null;

  private BQOutboundUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


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

  public BQOutboundUpdateInputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQOutboundUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

