package info.ewai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.ewai.config.ApplicationConfig;

@SpringBootApplication
@RestController
public class SpringCloudConfigClientApplication {

    @Autowired
    ApplicationConfig config;
    
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }

    @RequestMapping("/system")
    public String test() {
        return config.getSystemName();
    }
}
