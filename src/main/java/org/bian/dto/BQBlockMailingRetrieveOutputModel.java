package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBlockMailingInitiateInputModelBlockMailingInstanceRecord;
import org.bian.dto.BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis;
import org.bian.dto.BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport;
import org.bian.dto.BQBlockMailingRetrieveOutputModelOutboundInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBlockMailingRetrieveOutputModel
 */
public class BQBlockMailingRetrieveOutputModel   {
  private BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord = null;

  private BQBlockMailingRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord = null;

  private BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord = null;

  private String blockMailingRetrieveActionTaskReference = null;

  private Object blockMailingRetrieveActionTaskRecord = null;

  private String blockMailingRetrieveActionResponse = null;

  private BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport blockMailingInstanceReport = null;

  private BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis blockMailingInstanceAnalysis = null;


  /**
   * Get correspondenceOperatingSessionInstanceRecord
   * @return correspondenceOperatingSessionInstanceRecord
  **/

  public BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord getCorrespondenceOperatingSessionInstanceRecord() {
    return correspondenceOperatingSessionInstanceRecord;
  }

  public void setCorrespondenceOperatingSessionInstanceRecord(BQOutboundInitiateInputModelCorrespondenceOperatingSessionInstanceRecord correspondenceOperatingSessionInstanceRecord) {
    this.correspondenceOperatingSessionInstanceRecord = correspondenceOperatingSessionInstanceRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQBlockMailingRetrieveOutputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQBlockMailingRetrieveOutputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


  /**
   * Get blockMailingInstanceRecord
   * @return blockMailingInstanceRecord
  **/

  public BQBlockMailingInitiateInputModelBlockMailingInstanceRecord getBlockMailingInstanceRecord() {
    return blockMailingInstanceRecord;
  }

  public void setBlockMailingInstanceRecord(BQBlockMailingInitiateInputModelBlockMailingInstanceRecord blockMailingInstanceRecord) {
    this.blockMailingInstanceRecord = blockMailingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Block Mailing instance retrieve service call 
   * @return blockMailingRetrieveActionTaskReference
  **/

  public String getBlockMailingRetrieveActionTaskReference() {
    return blockMailingRetrieveActionTaskReference;
  }

  public void setBlockMailingRetrieveActionTaskReference(String blockMailingRetrieveActionTaskReference) {
    this.blockMailingRetrieveActionTaskReference = blockMailingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return blockMailingRetrieveActionResponse
  **/

  public String getBlockMailingRetrieveActionResponse() {
    return blockMailingRetrieveActionResponse;
  }

  public void setBlockMailingRetrieveActionResponse(String blockMailingRetrieveActionResponse) {
    this.blockMailingRetrieveActionResponse = blockMailingRetrieveActionResponse;
  }


  /**
   * Get blockMailingInstanceReport
   * @return blockMailingInstanceReport
  **/

  public BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport getBlockMailingInstanceReport() {
    return blockMailingInstanceReport;
  }

  public void setBlockMailingInstanceReport(BQBlockMailingRetrieveOutputModelBlockMailingInstanceReport blockMailingInstanceReport) {
    this.blockMailingInstanceReport = blockMailingInstanceReport;
  }


  /**
   * Get blockMailingInstanceAnalysis
   * @return blockMailingInstanceAnalysis
  **/

  public BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis getBlockMailingInstanceAnalysis() {
    return blockMailingInstanceAnalysis;
  }

  public void setBlockMailingInstanceAnalysis(BQBlockMailingRetrieveOutputModelBlockMailingInstanceAnalysis blockMailingInstanceAnalysis) {
    this.blockMailingInstanceAnalysis = blockMailingInstanceAnalysis;
  }


}

