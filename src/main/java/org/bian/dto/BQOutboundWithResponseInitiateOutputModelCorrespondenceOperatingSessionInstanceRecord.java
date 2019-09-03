package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord
 */
public class BQOutboundWithResponseInitiateOutputModelCorrespondenceOperatingSessionInstanceRecord   {
  private String correspondenceServiceSessionStatistics = null;

  private BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session 
   * @return correspondenceServiceSessionStatistics
  **/

  public String getCorrespondenceServiceSessionStatistics() {
    return correspondenceServiceSessionStatistics;
  }

  public void setCorrespondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
    this.correspondenceServiceSessionStatistics = correspondenceServiceSessionStatistics;
  }


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

