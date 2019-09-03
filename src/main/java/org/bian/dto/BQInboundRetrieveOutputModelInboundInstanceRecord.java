package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundRetrieveOutputModelInboundInstanceRecordInboundCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelInboundInstanceRecord
 */
public class BQInboundRetrieveOutputModelInboundInstanceRecord   {
  private String inboundCorrespondenceInstanceReference = null;

  private BQInboundRetrieveOutputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord = null;


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

  public BQInboundRetrieveOutputModelInboundInstanceRecordInboundCorrespondenceRecord getInboundCorrespondenceRecord() {
    return inboundCorrespondenceRecord;
  }

  public void setInboundCorrespondenceRecord(BQInboundRetrieveOutputModelInboundInstanceRecordInboundCorrespondenceRecord inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
  }


}

