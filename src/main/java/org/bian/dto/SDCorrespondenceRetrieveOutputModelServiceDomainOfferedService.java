package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorrespondenceRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCorrespondenceRetrieveOutputModelServiceDomainOfferedService
 */
public class SDCorrespondenceRetrieveOutputModelServiceDomainOfferedService   {
  private String serviceDomainServiceReference = null;

  private SDCorrespondenceRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/

  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }


  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  **/

  public SDCorrespondenceRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDCorrespondenceRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


}

