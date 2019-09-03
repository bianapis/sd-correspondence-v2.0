package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord
 */
public class BQOutboundInitiateOutputModelOutboundInstanceRecordCorrespondenceRecord   {
  private CRCorrespondenceOperatingSessionRetrieveOutputModelOutboundInstanceRecordCorrespondenceRecordDateType dateType = null;


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

