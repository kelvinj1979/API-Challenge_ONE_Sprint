package foro.alura.api.topico;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		
		@NotBlank 
		String titulo, 		
		@NotBlank
		String	mensaje,
		@NotBlank
		String fecha_creacion,
		@NotNull
		Estado estado, 
		@NotBlank
		String autor, 
		@NotBlank
		String curso) {
	

}
