package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelInboundInstanceRecordInboundCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelInboundInstanceRecord
 */
public class BQInboundInitiateInputModelInboundInstanceRecord   {
  private String inboundCorrespondenceInstanceReference = null;

  private BQInboundInitiateInputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord = null;


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

  public BQInboundInitiateInputModelInboundInstanceRecordInboundCorrespondenceRecord getInboundCorrespondenceRecord() {
    return inboundCorrespondenceRecord;
  }

  public void setInboundCorrespondenceRecord(BQInboundInitiateInputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
  }


}

