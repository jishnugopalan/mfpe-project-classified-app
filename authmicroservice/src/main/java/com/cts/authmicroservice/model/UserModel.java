package com.cts.authmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Table(name="user")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {

	@Id
	private int empid;
	private String empUsername;
	private String empPassword;
}
