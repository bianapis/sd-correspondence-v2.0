package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingInitiateInputModelBlockMailingInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateOutputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingInitiateOutputModel
 */
public class BQBlockMailingInitiateOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQOutboundInitiateOutputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private String blockMailingInstanceReference = null;

  private String blockMailingInitiateActionReference = null;

  private Object blockMailingInitiateActionRecord = null;

  private String blockMailingInstanceStatus = null;

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

  public BQOutboundInitiateOutputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateOutputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return blockMailingInitiateActionReference
  **/

  public String getBlockMailingInitiateActionReference() {
    return blockMailingInitiateActionReference;
  }

  public void setBlockMailingInitiateActionReference(String blockMailingInitiateActionReference) {
    this.blockMailingInitiateActionReference = blockMailingInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Block Mailing instance (e.g. initialised, pending, active) 
   * @return blockMailingInstanceStatus
  **/

  public String getBlockMailingInstanceStatus() {
    return blockMailingInstanceStatus;
  }

  public void setBlockMailingInstanceStatus(String blockMailingInstanceStatus) {
    this.blockMailingInstanceStatus = blockMailingInstanceStatus;
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

