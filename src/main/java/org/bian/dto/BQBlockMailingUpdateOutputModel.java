package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingInitiateInputModelBlockMailingInstanceRecord;
import org.bian.dto.BQBlockMailingUpdateInputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingUpdateOutputModel
 */
public class BQBlockMailingUpdateOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQBlockMailingUpdateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord = null;

  private String blockMailingUpdateActionTaskReference = null;

  private Object blockMailingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQBlockMailingUpdateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQBlockMailingUpdateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * Get blockMailingInstanceRecord
   * @return blockMailingInstanceRecord
  **/

  public BQBlockMailingInitiateInputModelBlockMailingInstanceRecord getBlockMailingInstanceRecord() {
    return blockMailingInstanceRecord;
  }

  public void setBlockMailingInstanceRecord(BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord) {
    this.blockMailingInstanceRecord = blockMailingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return blockMailingUpdateActionTaskReference
  **/

  public String getBlockMailingUpdateActionTaskReference() {
    return blockMailingUpdateActionTaskReference;
  }

  public void setBlockMailingUpdateActionTaskReference(String blockMailingUpdateActionTaskReference) {
    this.blockMailingUpdateActionTaskReference = blockMailingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return blockMailingUpdateActionTaskRecord
  **/

  public Object getBlockMailingUpdateActionTaskRecord() {
    return blockMailingUpdateActionTaskRecord;
  }

  public void setBlockMailingUpdateActionTaskRecord(Object blockMailingUpdateActionTaskRecord) {
    this.blockMailingUpdateActionTaskRecord = blockMailingUpdateActionTaskRecord;
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

