package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingInitiateInputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingInitiateInputModelOutboundInstanceRecord
 */
public class BQBlockMailingInitiateInputModelOutboundInstanceRecord   {
  private BQBlockMailingInitiateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public BQBlockMailingInitiateInputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQBlockMailingInitiateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

