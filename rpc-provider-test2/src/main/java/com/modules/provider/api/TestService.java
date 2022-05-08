package com.modules.provider.api;


import com.modules.remoting.TestApi;
import com.modules.rpc.annotation.RPCService;
import org.springframework.stereotype.Component;

/**
 * @author chenlingl
 * @version 1.0
 * @date 2022/1/21 11:28
 */
@Component
@RPCService(serviceInterface = TestApi.class,serviceVersion = "1.0.0")
public class TestService implements TestApi {
    @Override
    public String hello(String name) {
        return "hello" + name;
    }
}
