package net.cc.zzh.yydiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author zhonghua.zhi
 * @version 1.0
 * @classname WebController
 * @date 2020-01-05 12:03
 * @description TODO
 */
@RestController
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/demo")
    public String demo(String name) {

        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();

        System.out.println("URL : " + uri.toString());

        return restTemplate.getForObject(uri + "/demo?name=" + name, String.class);
    }
}