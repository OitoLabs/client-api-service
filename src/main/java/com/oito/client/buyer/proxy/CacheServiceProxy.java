package com.oito.client.buyer.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "cacheServiceProxy", url = "https://qa.nocnoc-internal.com/cache-proxy")
public interface CacheServiceProxy {

}
