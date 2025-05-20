package tech.buildrun.promowisems;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import tech.buildrun.promowisems.ServiceConnectionConfig;

@Import(ServiceConnectionConfig.class)
@SpringBootTest
class PromowisemsApplicationTests {

	@Test
	void contextLoads() {
	}

}
