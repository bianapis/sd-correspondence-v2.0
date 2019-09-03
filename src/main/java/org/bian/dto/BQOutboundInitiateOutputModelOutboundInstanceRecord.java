package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateOutputModelOutboundInstanceRecord   {
  private BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


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

