package oit.is.z1790.kaizai.janken02;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Janken02ApplicationTests {

  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

	@Test
	void contextLoads() {
	}

}
