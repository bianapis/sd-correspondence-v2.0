package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseUpdateOutputModel
 */
public class BQOutboundWithResponseUpdateOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord = null;

  private String outboundWithResponseUpdateActionTaskReference = null;

  private Object outboundWithResponseUpdateActionTaskRecord = null;

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

  public BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * Get outboundWithResponseInstanceRecord
   * @return outboundWithResponseInstanceRecord
  **/

  public BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord getOutboundWithResponseInstanceRecord() {
    return outboundWithResponseInstanceRecord;
  }

  public void setOutboundWithResponseInstanceRecord(BQOutboundWithResponseUpdateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord) {
    this.outboundWithResponseInstanceRecord = outboundWithResponseInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return outboundWithResponseUpdateActionTaskReference
  **/

  public String getOutboundWithResponseUpdateActionTaskReference() {
    return outboundWithResponseUpdateActionTaskReference;
  }

  public void setOutboundWithResponseUpdateActionTaskReference(String outboundWithResponseUpdateActionTaskReference) {
    this.outboundWithResponseUpdateActionTaskReference = outboundWithResponseUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundWithResponseUpdateActionTaskRecord
  **/

  public Object getOutboundWithResponseUpdateActionTaskRecord() {
    return outboundWithResponseUpdateActionTaskRecord;
  }

  public void setOutboundWithResponseUpdateActionTaskRecord(Object outboundWithResponseUpdateActionTaskRecord) {
    this.outboundWithResponseUpdateActionTaskRecord = outboundWithResponseUpdateActionTaskRecord;
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

