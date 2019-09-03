package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBlockMailingInitiateInputModelBlockMailingInstanceRecord
 */
public class BQBlockMailingInitiateInputModelBlockMailingInstanceRecord   {
  private Object blockmailingRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Used to track receipt and return of the individual messages making up the block mail 
   * @return blockmailingRecord
  **/

  public Object getBlockmailingRecord() {
    return blockmailingRecord;
  }

  public void setBlockmailingRecord(Object blockmailingRecord) {
    this.blockmailingRecord = blockmailingRecord;
  }


}

