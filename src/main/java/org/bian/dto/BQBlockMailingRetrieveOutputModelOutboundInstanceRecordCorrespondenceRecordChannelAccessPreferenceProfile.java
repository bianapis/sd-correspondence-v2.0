package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile
 */
public class BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordChannelAccessPreferenceProfile   {
  private String channelAccessChannelDeviceType = null;

  private String channelAccessChannelDeviceTypePreference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target device defines the format to be used (e.g. email) 
   * @return channelAccessChannelDeviceType
  **/

  public String getChannelAccessChannelDeviceType() {
    return channelAccessChannelDeviceType;
  }

  public void setChannelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
    this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: A description of the customer's delivery preferences applied to the message (e.g. no paper correspondence, stuffing and batching allowed)  
   * @return channelAccessChannelDeviceTypePreference
  **/

  public String getChannelAccessChannelDeviceTypePreference() {
    return channelAccessChannelDeviceTypePreference;
  }

  public void setChannelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
    this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
  }


}

