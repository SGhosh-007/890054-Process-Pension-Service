package com.cts.processPension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.processPension.exception.InvalidTokenException;
import com.cts.processPension.model.ProcessPensionInput;
import com.cts.processPension.model.ProcessPensionResponse;

/**
 * Feign client to connect with Pension disbursement micro-service
 * 
 *  @author Sushobhan Ghosh
 *  @author 890054
 *
 */
@FeignClient(name = "PENSION-DISBURSEMENT-SERVICE", url = "${url.app.pds}")
public interface PensionDisbursementClient {
	@PostMapping("/DisbursePension")
	public ProcessPensionResponse disbursePension(@RequestHeader(name = "Authorization") String token,
			@RequestBody ProcessPensionInput processPensionInput) throws InvalidTokenException;
}