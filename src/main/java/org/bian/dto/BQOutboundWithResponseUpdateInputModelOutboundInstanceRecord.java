package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord
 */
public class BQOutboundWithResponseUpdateInputModelOutboundInstanceRecord   {
  private BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord = null;


  /**
   * Get correspondenceRecord
   * @return correspondenceRecord
  **/

  public BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(BQOutboundWithResponseUpdateInputModelOutboundInstanceRecordCorrespondenceRecord correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

