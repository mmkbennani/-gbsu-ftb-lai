package com.kata.gbsuftblai

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType

@SpringBootTest
class GbsuFtbLaiApplicationTests {

	
	@Autowired
	private lateinit var webTestClient: WebTestClient
	
    @Test
    fun contextLoads() {
		this.webTestClient.get()
	      .uri("/gbsu-ftb-lai/GbsuFtbFtb")
	      .accept(MediaType.APPLICATION_JSON)
	      .exchange()
	      .expectStatus().is2xxSuccessful
	      .expectBody()
	      .jsonPath("$[0].result").isEqualTo("")
		
		this.webTestClient.get()
	      .uri("/gbsu-ftb-lai/33")
	      .accept(MediaType.APPLICATION_JSON)
	      .exchange()
	      .expectStatus().is2xxSuccessful
	      .expectBody()
	      .jsonPath("$[0].result").isEqualTo("GbsuGbsuGbsu")
		
		this.webTestClient.get()
	      .uri("/gbsu-ftb-lai/27")
	      .accept(MediaType.APPLICATION_JSON)
	      .exchange()
	      .expectStatus().is2xxSuccessful
	      .expectBody()
	      .jsonPath("$[0].result").isEqualTo("GbsuLai")
    }

}
