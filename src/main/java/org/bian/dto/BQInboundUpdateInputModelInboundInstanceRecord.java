package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundUpdateInputModelInboundInstanceRecord
 */
public class BQInboundUpdateInputModelInboundInstanceRecord   {
  private String inboundCorrespondenceInstanceReference = null;

  private BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the inbound correspondence item 
   * @return inboundCorrespondenceInstanceReference
  **/

  public String getInboundCorrespondenceInstanceReference() {
    return inboundCorrespondenceInstanceReference;
  }

  public void setInboundCorrespondenceInstanceReference(String inboundCorrespondenceInstanceReference) {
    this.inboundCorrespondenceInstanceReference = inboundCorrespondenceInstanceReference;
  }


  /**
   * Get inboundCorrespondenceRecord
   * @return inboundCorrespondenceRecord
  **/

  public BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord getInboundCorrespondenceRecord() {
    return inboundCorrespondenceRecord;
  }

  public void setInboundCorrespondenceRecord(BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
  }


}

