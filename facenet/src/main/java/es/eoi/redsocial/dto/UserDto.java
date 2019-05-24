package es.eoi.redsocial.dto;

import java.util.Date;
import java.util.List;

import es.eoi.redsocial.entity.Assistance;
import es.eoi.redsocial.entity.Event;
import es.eoi.redsocial.entity.Message;
import es.eoi.redsocial.entity.Reaction;
import es.eoi.redsocial.entity.Relationship;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
		private int id;

		private String nombre;

		private String apellido;

		private Date fechaNacimiento;

		private Date fechaAlta;

		private String usuario;

		private String pass;

		// Relacion tablas

		private List<Message> message;

		private List<Reaction> reaction;

		private List<Relationship> relationship1;

		private List<Relationship> relationship2;

		private List<Event> event;

		private List<Assistance> assistance;

		public UserDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserDto(int id, String nombre, String apellido, Date fechaNacimiento, Date fechaAlta, String usuario,
				String pass, List<Message> message, List<Reaction> reaction, List<Relationship> relationship1,
				List<Relationship> relationship2, List<Event> event, List<Assistance> assistance) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.fechaAlta = fechaAlta;
			this.usuario = usuario;
			this.pass = pass;
			this.message = message;
			this.reaction = reaction;
			this.relationship1 = relationship1;
			this.relationship2 = relationship2;
			this.event = event;
			this.assistance = assistance;
		}

		public UserDto(String nombre, String apellido, Date fechaAlta, String usuario, List<Event> event,
				List<Assistance> assistance) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaAlta = fechaAlta;
			this.usuario = usuario;
			this.event = event;
			this.assistance = assistance;
		}
		
}
