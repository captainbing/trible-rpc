package com.abing.core.config;

import com.abing.core.fault.tolerant.TolerantKeys;
import com.abing.core.loadbalancer.LoadBalancerKeys;
import com.abing.core.registry.RegistryConfig;
import com.abing.core.fault.retry.RetryConfig;
import com.abing.core.serialize.key.SerializerKeys;
import lombok.Data;

/**
 * @Author CaptainBing
 * @Date 2024/10/9 15:33
 * @Description
 */
@Data
public class RpcConfig {

    private String name = "trible-rpc";

    private String version = "1.0.0";

    private String host = "localhost";

    private Integer port = 1205;

    private SerializerKeys serialization = SerializerKeys.JDK;

    private RegistryConfig registry = new RegistryConfig();

    private LoadBalancerKeys balancer = LoadBalancerKeys.RANDOM;

    private RetryConfig retry = new RetryConfig();

    private TolerantKeys tolerant = TolerantKeys.SILENTPROCESS;

}
