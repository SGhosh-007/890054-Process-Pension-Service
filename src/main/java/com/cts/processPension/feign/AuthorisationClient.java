package com.cts.processPension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
/**
 * Feign client to connect with authorization micro-service for token validation
 * 
 *  @author Sushobhan Ghosh
 *  @author 890054
 *
 */
@FeignClient(name = "AUTH-SERVICE", url = "${url.app.auth}")
public interface AuthorisationClient {
	
	/**
	 * method to validate jwt token
	 * @param token
	 * @return true only if token is valid else false
	 * 
	 */
	@GetMapping("/validate")
	public boolean validate(@RequestHeader(name = "Authorization") String token);

}
