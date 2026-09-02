package com.cloud.aws.demo.Controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/mascotas")
public class Mascota {
    
    @GetMapping("/polo")
	@PreAuthorize("hasRole('OT.Read')")
	public String polo_endpoint() {
		return "AWS_Polo";
	}

	@GetMapping("/cantidad") 
	public Integer getTotalMascotas() {
		return 50;
	}

	@GetMapping("/mascota/{id}")
	public Mascota getMascota(Integer id) {
		Mascota polo= new Mascota();
		return polo;
	}

	@GetMapping("/mascota/{id}/vacunado")
	public Boolean vacunado() {
		return true;
	}
}
