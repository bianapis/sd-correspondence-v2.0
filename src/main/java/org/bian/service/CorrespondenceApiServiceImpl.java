/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorrespondenceApiServiceImpl implements CorrespondenceApiService {

	public SDCorrespondenceActivateOutputModel activate(SDCorrespondenceActivateInputModel request){
		return JsonReader.read("activate-SDCorrespondenceActivateOutputModel.json",new TypeReference<SDCorrespondenceActivateOutputModel>(){});
	}
	
	public SDCorrespondenceConfigureOutputModel configure(String sdReferenceId, SDCorrespondenceConfigureInputModel request){
		return JsonReader.read("configure-SDCorrespondenceConfigureOutputModel.json",new TypeReference<SDCorrespondenceConfigureOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRCorrespondenceOperatingSessionControlOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionControlOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRCorrespondenceOperatingSessionExchangeOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionExchangeOutputModel>(){});
	}
	
	public SDCorrespondenceFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondenceFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorrespondenceFeedbackOutputModel.json",new TypeReference<SDCorrespondenceFeedbackOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCorrespondenceOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRCorrespondenceOperatingSessionInitiateOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQBlockMailingInitiateOutputModel initiateBlockmailing(String sdReferenceId, String crReferenceId, BQBlockMailingInitiateInputModel request){
		return JsonReader.read("initiate-BQBlockMailingInitiateOutputModel.json",new TypeReference<BQBlockMailingInitiateOutputModel>(){});
	}
	
	public BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request){
		return JsonReader.read("initiate-BQInboundInitiateOutputModel.json",new TypeReference<BQInboundInitiateOutputModel>(){});
	}
	
	public BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundInitiateOutputModel.json",new TypeReference<BQOutboundInitiateOutputModel>(){});
	}
	
	public BQOutboundWithResponseInitiateOutputModel initiateOutboundwithresponse(String sdReferenceId, String crReferenceId, BQOutboundWithResponseInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundWithResponseInitiateOutputModel.json",new TypeReference<BQOutboundWithResponseInitiateOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRCorrespondenceOperatingSessionRequestOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionRequestOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorrespondenceOperatingSessionRetrieveOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBlockMailingRetrieveOutputModel retrieveBlockmailing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBlockMailingRetrieveOutputModel.json",new TypeReference<BQBlockMailingRetrieveOutputModel>(){});
	}
	
	public BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundRetrieveOutputModel.json",new TypeReference<BQInboundRetrieveOutputModel>(){});
	}
	
	public BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundRetrieveOutputModel.json",new TypeReference<BQOutboundRetrieveOutputModel>(){});
	}
	
	public BQOutboundWithResponseRetrieveOutputModel retrieveOutboundwithresponse(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundWithResponseRetrieveOutputModel.json",new TypeReference<BQOutboundWithResponseRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorrespondenceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorrespondenceRetrieveOutputModel.json",new TypeReference<SDCorrespondenceRetrieveOutputModel>(){});
	}
	
	public CRCorrespondenceOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondenceOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRCorrespondenceOperatingSessionUpdateOutputModel.json",new TypeReference<CRCorrespondenceOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQBlockMailingUpdateOutputModel updateBlockmailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBlockMailingUpdateInputModel request){
		return JsonReader.read("update-BQBlockMailingUpdateOutputModel.json",new TypeReference<BQBlockMailingUpdateOutputModel>(){});
	}
	
	public BQInboundUpdateOutputModel updateInbound(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundUpdateInputModel request){
		return JsonReader.read("update-BQInboundUpdateOutputModel.json",new TypeReference<BQInboundUpdateOutputModel>(){});
	}
	
	public BQOutboundUpdateOutputModel updateOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundUpdateInputModel request){
		return JsonReader.read("update-BQOutboundUpdateOutputModel.json",new TypeReference<BQOutboundUpdateOutputModel>(){});
	}
	
	public BQOutboundWithResponseUpdateOutputModel updateOutboundwithresponse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundWithResponseUpdateInputModel request){
		return JsonReader.read("update-BQOutboundWithResponseUpdateOutputModel.json",new TypeReference<BQOutboundWithResponseUpdateOutputModel>(){});
	}
	
}
