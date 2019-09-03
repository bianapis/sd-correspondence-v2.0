package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord
 */
public class BQInboundUpdateInputModelInboundInstanceRecordInboundCorrespondenceRecord   {
  private String inboundCorrespondenceType = null;

  private String inboundCorrespondenceContent = null;

  private String inboundCorrespondenceAddressee = null;

  private String inboundCorrespondenceCustomerReference = null;

  private String inboundCorrespondenceEmployeeBusinessUnitReference = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The interpreted type of correspondence (e.g. unsolicited message, product/service related, complaint) 
   * @return inboundCorrespondenceType
  **/

  public String getInboundCorrespondenceType() {
    return inboundCorrespondenceType;
  }

  public void setInboundCorrespondenceType(String inboundCorrespondenceType) {
    this.inboundCorrespondenceType = inboundCorrespondenceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inbound message content in whatever format appropriate 
   * @return inboundCorrespondenceContent
  **/

  public String getInboundCorrespondenceContent() {
    return inboundCorrespondenceContent;
  }

  public void setInboundCorrespondenceContent(String inboundCorrespondenceContent) {
    this.inboundCorrespondenceContent = inboundCorrespondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The identified source of inbound message (extracted from the content) 
   * @return inboundCorrespondenceAddressee
  **/

  public String getInboundCorrespondenceAddressee() {
    return inboundCorrespondenceAddressee;
  }

  public void setInboundCorrespondenceAddressee(String inboundCorrespondenceAddressee) {
    this.inboundCorrespondenceAddressee = inboundCorrespondenceAddressee;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Matched bank customer (from reference details extracted from the content where possible) 
   * @return inboundCorrespondenceCustomerReference
  **/

  public String getInboundCorrespondenceCustomerReference() {
    return inboundCorrespondenceCustomerReference;
  }

  public void setInboundCorrespondenceCustomerReference(String inboundCorrespondenceCustomerReference) {
    this.inboundCorrespondenceCustomerReference = inboundCorrespondenceCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identified internal addressee (from reference details extracted from the content where possible) 
   * @return inboundCorrespondenceEmployeeBusinessUnitReference
  **/

  public String getInboundCorrespondenceEmployeeBusinessUnitReference() {
    return inboundCorrespondenceEmployeeBusinessUnitReference;
  }

  public void setInboundCorrespondenceEmployeeBusinessUnitReference(String inboundCorrespondenceEmployeeBusinessUnitReference) {
    this.inboundCorrespondenceEmployeeBusinessUnitReference = inboundCorrespondenceEmployeeBusinessUnitReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

