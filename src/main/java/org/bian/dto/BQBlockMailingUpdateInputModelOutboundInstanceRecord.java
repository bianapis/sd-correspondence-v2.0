package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingUpdateInputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingUpdateInputModelOutboundInstanceRecord
 */
public class BQBlockMailingUpdateInputModelOutboundInstanceRecord   {
  private BQBlockMailingUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public BQBlockMailingUpdateInputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQBlockMailingUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

