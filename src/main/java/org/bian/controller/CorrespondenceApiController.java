/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CorrespondenceApiController {

	@Autowired
	CorrespondenceApiService service;
	
	@Operate.Activate
	public BianResponse<SDCorrespondenceActivateOutputModel> activate(@RequestBody BianRequest<SDCorrespondenceActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDCorrespondenceConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorrespondenceConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRCorrespondenceOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondenceOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Exchange
	public BianResponse<CRCorrespondenceOperatingSessionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondenceOperatingSessionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDCorrespondenceFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorrespondenceFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRCorrespondenceOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCorrespondenceOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("blockmailing")
	@Operate.Initiate
	public BianResponse<BQBlockMailingInitiateOutputModel> initiateBlockmailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBlockMailingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBlockmailing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbound")
	@Operate.Initiate
	public BianResponse<BQInboundInitiateOutputModel> initiateInbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQInboundInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateInbound(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound")
	@Operate.Initiate
	public BianResponse<BQOutboundInitiateOutputModel> initiateOutbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOutboundInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOutbound(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundwithresponse")
	@Operate.Initiate
	public BianResponse<BQOutboundWithResponseInitiateOutputModel> initiateOutboundwithresponse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOutboundWithResponseInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOutboundwithresponse(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRCorrespondenceOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondenceOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRCorrespondenceOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("blockmailing")
	@Operate.Retrieve
	public BianResponse<BQBlockMailingRetrieveOutputModel> retrieveBlockmailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBlockmailing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inbound")
	@Operate.Retrieve
	public BianResponse<BQInboundRetrieveOutputModel> retrieveInbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbound(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("outbound")
	@Operate.Retrieve
	public BianResponse<BQOutboundRetrieveOutputModel> retrieveOutbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbound(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("outboundwithresponse")
	@Operate.Retrieve
	public BianResponse<BQOutboundWithResponseRetrieveOutputModel> retrieveOutboundwithresponse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutboundwithresponse(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDCorrespondenceRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRCorrespondenceOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondenceOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("blockmailing")
	@Operate.Update
	public BianResponse<BQBlockMailingUpdateOutputModel> updateBlockmailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBlockMailingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBlockmailing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbound")
	@Operate.Update
	public BianResponse<BQInboundUpdateOutputModel> updateInbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInboundUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInbound(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound")
	@Operate.Update
	public BianResponse<BQOutboundUpdateOutputModel> updateOutbound(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOutboundUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOutbound(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundwithresponse")
	@Operate.Update
	public BianResponse<BQOutboundWithResponseUpdateOutputModel> updateOutboundwithresponse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOutboundWithResponseUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOutboundwithresponse(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
