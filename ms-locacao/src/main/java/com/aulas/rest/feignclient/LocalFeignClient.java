package com.aulas.rest.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "localevento", url = "localhost:8001", path = "/local")
public interface LocalFeignClient {
	@GetMapping("/{idlocal}/reserva/{reservar}")
	public ResponseEntity<String> reservar(@PathVariable("idlocal") Long idlocal,
			@PathVariable("reservar") boolean reservar);
}
