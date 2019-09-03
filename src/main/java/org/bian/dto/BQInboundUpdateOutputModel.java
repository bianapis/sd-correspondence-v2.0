package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundUpdateInputModelInboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundUpdateOutputModel
 */
public class BQInboundUpdateOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQInboundUpdateInputModelInboundInstanceRecord inboundInstanceRecord = null;

  private String inboundUpdateActionTaskReference = null;

  private Object inboundUpdateActionTaskRecord = null;

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
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundUpdateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundUpdateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return inboundUpdateActionTaskReference
  **/

  public String getInboundUpdateActionTaskReference() {
    return inboundUpdateActionTaskReference;
  }

  public void setInboundUpdateActionTaskReference(String inboundUpdateActionTaskReference) {
    this.inboundUpdateActionTaskReference = inboundUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inboundUpdateActionTaskRecord
  **/

  public Object getInboundUpdateActionTaskRecord() {
    return inboundUpdateActionTaskRecord;
  }

  public void setInboundUpdateActionTaskRecord(Object inboundUpdateActionTaskRecord) {
    this.inboundUpdateActionTaskRecord = inboundUpdateActionTaskRecord;
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

