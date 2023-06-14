package foro.alura.api.topico;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import jakarta.persistence.*;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
	
	public Topico() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String mensaje;
	private String fecha_creacion;
	@Enumerated(EnumType.STRING)
	private Estado estatus;
	private String autor;
	private String curso;

	
	public Topico(DatosRegistroTopico datosRegistroTopico) {
		this.titulo = datosRegistroTopico.titulo();
		this.mensaje = datosRegistroTopico.mensaje();
		this.fecha_creacion = datosRegistroTopico.fecha_creacion();
		this.estatus = datosRegistroTopico.estado();
		this.autor = datosRegistroTopico.autor();
		this.curso = datosRegistroTopico.curso();
	}



}
