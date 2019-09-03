/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondenceApiService {

	SDCorrespondenceActivateOutputModel activate(SDCorrespondenceActivateInputModel request);
	
	SDCorrespondenceConfigureOutputModel configure(String sdReferenceId, SDCorrespondenceConfigureInputModel request);
	
	CRCorrespondenceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionControlInputModel request);
	
	CRCorrespondenceOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionExchangeInputModel request);
	
	SDCorrespondenceFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondenceFeedbackInputModel request);
	
	CRCorrespondenceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCorrespondenceOperatingSessionInitiateInputModel request);
	
	BQBlockMailingInitiateOutputModel initiateBlockmailing(String sdReferenceId, String crReferenceId, BQBlockMailingInitiateInputModel request);
	
	BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request);
	
	BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request);
	
	BQOutboundWithResponseInitiateOutputModel initiateOutboundwithresponse(String sdReferenceId, String crReferenceId, BQOutboundWithResponseInitiateInputModel request);
	
	CRCorrespondenceOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionRequestInputModel request);
	
	CRCorrespondenceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBlockMailingRetrieveOutputModel retrieveBlockmailing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundWithResponseRetrieveOutputModel retrieveOutboundwithresponse(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorrespondenceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorrespondenceOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionUpdateInputModel request);
	
	BQBlockMailingUpdateOutputModel updateBlockmailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBlockMailingUpdateInputModel request);
	
	BQInboundUpdateOutputModel updateInbound(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundUpdateInputModel request);
	
	BQOutboundUpdateOutputModel updateOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundUpdateInputModel request);
	
	BQOutboundWithResponseUpdateOutputModel updateOutboundwithresponse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundWithResponseUpdateInputModel request);
	
}
