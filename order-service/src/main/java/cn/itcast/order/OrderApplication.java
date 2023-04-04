package cn.itcast.order;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {



    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
    //创建restTemplate并且注入spring容器




    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();

    }
    @Bean
    public IRule rule(){
        return new NacosRule();
    }


}