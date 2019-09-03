package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelInboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModel
 */
public class BQInboundInitiateInputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private Object inboundInitiateActionRecord = null;

  private BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord = null;


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
   * @return inboundInitiateActionRecord
  **/

  public Object getInboundInitiateActionRecord() {
    return inboundInitiateActionRecord;
  }

  public void setInboundInitiateActionRecord(Object inboundInitiateActionRecord) {
    this.inboundInitiateActionRecord = inboundInitiateActionRecord;
  }


  /**
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundInitiateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


}

