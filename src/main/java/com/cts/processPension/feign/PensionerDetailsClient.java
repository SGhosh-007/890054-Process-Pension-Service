package com.cts.processPension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.processPension.model.PensionerDetail;

/**
 * Feign client to connect with Pension details micro-service
 * 
 *  @author Sushobhan Ghosh
 *  @author 890054
 *
 */
@FeignClient(name = "PENSIONER-DETAIL-SERVICE", url = "${url.app.pdts}")
public interface PensionerDetailsClient {
	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetail getPensionerDetailByAadhaar(@PathVariable String aadhaarNumber);
}