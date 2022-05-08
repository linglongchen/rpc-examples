package com.modules.consumer.controller;

import com.modules.consumer.annotation.RpcReference;
import com.modules.remoting.TestApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlingl
 * @version 1.0
 * @date 2022/1/21 11:24
 */
@RestController
public class TestController {

    @SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
    @RpcReference(serviceVersion = "1.0.0",timeout = 3000000)
    private TestApi testApi;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return testApi.hello("mini rpc");
    }
}

