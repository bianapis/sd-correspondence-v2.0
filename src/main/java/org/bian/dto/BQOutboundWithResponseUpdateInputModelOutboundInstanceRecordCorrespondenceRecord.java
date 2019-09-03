package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord
 */
public class BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord   {
  private String correspondenceType = null;

  private String correspondenceTemplateReference = null;

  private Object correspondenceTemplateRecord = null;

  private String correspondenceContent = null;

  private String correspondenceMediaChannel = null;

  private String correspondenceAddressee = null;

  private String customerReference = null;

  private String channelAccessPreferenceReference = null;

  private BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile channelAccessPreferenceProfile = null;

  private String productServiceType = null;

  private String employeeBusinessUnitReference = null;

  private CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of correspondence (e.g. confirmation note, mail shot) 
   * @return correspondenceType
  **/

  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a template used to assemble standard format correspondence (can be supplied with the correspondence or maintained within the Correspondence service domain as appropriate) 
   * @return correspondenceTemplateReference
  **/

  public String getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(String correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The template definition used in correspondence assembly 
   * @return correspondenceTemplateRecord
  **/

  public Object getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(Object correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The message content (aligned to template as appropriate) 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Identifies the preferred media and channel for delivery of the message 
   * @return correspondenceMediaChannel
  **/

  public String getCorrespondenceMediaChannel() {
    return correspondenceMediaChannel;
  }

  public void setCorrespondenceMediaChannel(String correspondenceMediaChannel) {
    this.correspondenceMediaChannel = correspondenceMediaChannel;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The address for message delivery (needs to match channel selection) 
   * @return correspondenceAddressee
  **/

  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  If addressee is identified as a customer with channel preferences for correspondence 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  
   * @return channelAccessPreferenceReference
  **/

  public String getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(String channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }


  /**
   * Get channelAccessPreferenceProfile
   * @return channelAccessPreferenceProfile
  **/

  public BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated product/service if applicable 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  The sending entity within the bank (can be used for responses) 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
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

