package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveOutputModelOutboundInstanceRecord
 */
public class BQBlockMailingRetrieveOutputModelOutboundInstanceRecord   {
  private BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQBlockMailingRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

