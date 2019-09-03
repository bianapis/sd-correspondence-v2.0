package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundWithResponseInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundWithResponseInitiateInputModelOutboundWithResponseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseInitiateInputModel
 */
public class BQOutboundWithResponseInitiateInputModel   {
  private BQOutboundWithResponseInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private String correspondenceOperatingSessionInstanceReference = null;

  private Object outboundWithResponseInitiateActionRecord = null;

  private BQOutboundWithResponseInitiateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundWithResponseInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundWithResponseInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
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
   * @return outboundWithResponseInitiateActionRecord
  **/

  public Object getOutboundWithResponseInitiateActionRecord() {
    return outboundWithResponseInitiateActionRecord;
  }

  public void setOutboundWithResponseInitiateActionRecord(Object outboundWithResponseInitiateActionRecord) {
    this.outboundWithResponseInitiateActionRecord = outboundWithResponseInitiateActionRecord;
  }


  /**
   * Get outboundWithResponseInstanceRecord
   * @return outboundWithResponseInstanceRecord
  **/

  public BQOutboundWithResponseInitiateInputModelOutboundWithResponseInstanceRecord getOutboundWithResponseInstanceRecord() {
    return outboundWithResponseInstanceRecord;
  }

  public void setOutboundWithResponseInstanceRecord(BQOutboundWithResponseInitiateInputModelOutboundWithResponseInstanceRecord outboundWithResponseInstanceRecord) {
    this.outboundWithResponseInstanceRecord = outboundWithResponseInstanceRecord;
  }


}

