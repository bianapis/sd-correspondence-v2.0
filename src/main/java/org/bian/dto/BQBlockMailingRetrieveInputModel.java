package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingRetrieveInputModelBlockMailingInstanceAnalysis;
import org.bian.dto.BQBlockMailingRetrieveInputModelBlockMailingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveInputModel
 */
public class BQBlockMailingRetrieveInputModel   {
  private Object blockMailingRetrieveActionTaskRecord = null;

  private String blockMailingRetrieveActionRequest = null;

  private BQBlockMailingRetrieveInputModelBlockMailingInstanceReport blockMailingInstanceReport = null;

  private BQBlockMailingRetrieveInputModelBlockMailingInstanceAnalysis blockMailingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return blockMailingRetrieveActionTaskRecord
  **/

  public Object getBlockMailingRetrieveActionTaskRecord() {
    return blockMailingRetrieveActionTaskRecord;
  }

  public void setBlockMailingRetrieveActionTaskRecord(Object blockMailingRetrieveActionTaskRecord) {
    this.blockMailingRetrieveActionTaskRecord = blockMailingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return blockMailingRetrieveActionRequest
  **/

  public String getBlockMailingRetrieveActionRequest() {
    return blockMailingRetrieveActionRequest;
  }

  public void setBlockMailingRetrieveActionRequest(String blockMailingRetrieveActionRequest) {
    this.blockMailingRetrieveActionRequest = blockMailingRetrieveActionRequest;
  }


  /**
   * Get blockMailingInstanceReport
   * @return blockMailingInstanceReport
  **/

  public BQBlockMailingRetrieveInputModelBlockMailingInstanceReport getBlockMailingInstanceReport() {
    return blockMailingInstanceReport;
  }

  public void setBlockMailingInstanceReport(BQBlockMailingRetrieveInputModelBlockMailingInstanceReport blockMailingInstanceReport) {
    this.blockMailingInstanceReport = blockMailingInstanceReport;
  }


  /**
   * Get blockMailingInstanceAnalysis
   * @return blockMailingInstanceAnalysis
  **/

  public BQBlockMailingRetrieveInputModelBlockMailingInstanceAnalysis getBlockMailingInstanceAnalysis() {
    return blockMailingInstanceAnalysis;
  }

  public void setBlockMailingInstanceAnalysis(BQBlockMailingRetrieveInputModelBlockMailingInstanceAnalysis blockMailingInstanceAnalysis) {
    this.blockMailingInstanceAnalysis = blockMailingInstanceAnalysis;
  }


}

