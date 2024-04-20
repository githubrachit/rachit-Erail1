package com.example.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="ticketRes")
@AllArgsConstructor
@NoArgsConstructor
public class ticketres {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer ticketsr;
		private String firstName;
		private String lastName;
		private String from1;
		private String to1;
		private String pnr;
	

}
