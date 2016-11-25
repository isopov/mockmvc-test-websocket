package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@SpringBootApplication
@RestController
@EnableWebSocket
public class MockmvcTestWebsocketJettyApplication implements WebSocketConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(MockmvcTestWebsocketJettyApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world!";
	}

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(webSocketHandler(), "/ws");
	}

	@Bean
	public WebSocketHandler webSocketHandler() {
		return new TextWebSocketHandler();
	}
}
