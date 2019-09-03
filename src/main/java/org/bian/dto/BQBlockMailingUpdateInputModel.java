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
 * BQBlockMailingUpdateInputModel
 */
public class BQBlockMailingUpdateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQBlockMailingUpdateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private String blockMailingInstanceReference = null;

  private BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord = null;

  private Object blockMailingUpdateActionTaskRecord = null;

  private String blockMailingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Correspondence Operating Session instance 
   * @return correspondenceOperatingSessionInstanceReference
  **/

  public String getCorrespondenceOperatingSessionInstanceReference() {
    return correspondenceOperatingSessionInstanceReference;
  }

  public void setCorrespondenceOperatingSessionInstanceReference(String correspondenceOperatingSessionInstanceReference) {
    this.correspondenceOperatingSessionInstanceReference = correspondenceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Block Mailing instance 
   * @return blockMailingInstanceReference
  **/

  public String getBlockMailingInstanceReference() {
    return blockMailingInstanceReference;
  }

  public void setBlockMailingInstanceReference(String blockMailingInstanceReference) {
    this.blockMailingInstanceReference = blockMailingInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return blockMailingUpdateActionRequest
  **/

  public String getBlockMailingUpdateActionRequest() {
    return blockMailingUpdateActionRequest;
  }

  public void setBlockMailingUpdateActionRequest(String blockMailingUpdateActionRequest) {
    this.blockMailingUpdateActionRequest = blockMailingUpdateActionRequest;
  }


}

