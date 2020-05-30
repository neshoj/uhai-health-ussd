package ke.co.onepointseven.uhaihealthussd;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;

@SpringBootApplication
@RequiredArgsConstructor
public class UhaiHealthUSSDApplication {
    private ResourceLoader resourceLoader;


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(UhaiHealthUSSDApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public Menus menus() throws Exception {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        //Reference: https://smarterco.de/java-load-file-from-classpath-in-spring-boot/
        Resource resource = resourceLoader.getResource("classpath:menus.yaml");
        InputStream is = resource.getInputStream();

        Menus menus = mapper.readValue(is, Menus.class);
        return menus;
    }
}
