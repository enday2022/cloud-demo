package cn.itcast.order.cofig;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "pattern")
@Component
public class PatternProperties {
      private  String dateformat;
}

