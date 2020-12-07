package guru.sfg.brewery.msscconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsscConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscConfigServerApplication.class, args);
    }

}
