package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrint;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc(print = MockMvcPrint.NONE)
public class MockmvcTestWebsocketUndertowApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHello() throws Exception {
		mockMvc.perform(get("/"))
		.andExpect(status().isOk());
	}

}
