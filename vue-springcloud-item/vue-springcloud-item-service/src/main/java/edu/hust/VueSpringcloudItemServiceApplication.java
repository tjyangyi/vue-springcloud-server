package edu.hust;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("edu.hust.mapper") // mapper接口的包扫描
public class VueSpringcloudItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSpringcloudItemServiceApplication.class, args);
    }
}
