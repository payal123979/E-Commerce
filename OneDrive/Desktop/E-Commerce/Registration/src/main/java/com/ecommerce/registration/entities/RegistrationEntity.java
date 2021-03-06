package com.ecommerce.registration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registration")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@Column(name = "email", unique = true)
	@Email
	@NotNull(message = "Email cannot be null")
	private String email;
	@Column(name = "fullname")
	@NotNull(message = "FullName cannot be null")
	private String fullname;
	@Column(name = "mobileNo", unique = true)
	@NotNull(message = "Mobile No cannot be null")
	private String mobileNo;
	@Column(name = "password")
	@NotNull(message = "Password cannot be null")
	@Size(min = 8,max = 16,message = "Password must be greater than 8 and less than 16 characters")
	private String password;
}
