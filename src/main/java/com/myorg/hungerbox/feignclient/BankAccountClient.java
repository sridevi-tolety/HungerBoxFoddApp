package com.myorg.hungerbox.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@FeignClient(name="api-gateway-service")
@RibbonClient(name = "banking-service-hungerbox")
public class BankAccountClient {

}
