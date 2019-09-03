package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingInitiateInputModelBlockMailingInstanceRecord;
import org.bian.dto.BQBlockMailingInitiateInputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingInitiateInputModel
 */
public class BQBlockMailingInitiateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQBlockMailingInitiateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private Object blockMailingInitiateActionRecord = null;

  private BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord = null;


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

  public BQBlockMailingInitiateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQBlockMailingInitiateInputModelOutboundInstanceRecord outboundInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return blockMailingInitiateActionRecord
  **/

  public Object getBlockMailingInitiateActionRecord() {
    return blockMailingInitiateActionRecord;
  }

  public void setBlockMailingInitiateActionRecord(Object blockMailingInitiateActionRecord) {
    this.blockMailingInitiateActionRecord = blockMailingInitiateActionRecord;
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


}

