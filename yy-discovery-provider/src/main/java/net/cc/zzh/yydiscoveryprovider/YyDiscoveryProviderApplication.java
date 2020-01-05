package net.cc.zzh.yydiscoveryprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YyDiscoveryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyDiscoveryProviderApplication.class, args);
    }
}