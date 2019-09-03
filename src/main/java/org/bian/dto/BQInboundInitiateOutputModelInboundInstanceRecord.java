package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModelInboundInstanceRecord
 */
public class BQInboundInitiateOutputModelInboundInstanceRecord   {
  private BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord inboundCorrespondenceRecord = null;


  /**
   * Get inboundCorrespondenceRecord
   * @return inboundCorrespondenceRecord
  **/

  public BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord getInboundCorrespondenceRecord() {
    return inboundCorrespondenceRecord;
  }

  public void setInboundCorrespondenceRecord(BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord inboundCorrespondenceRecord) {
    this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
  }


}

