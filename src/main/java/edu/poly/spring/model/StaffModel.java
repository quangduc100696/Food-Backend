package edu.poly.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "personnel")
@Entity
@Setter
@Getter
public class StaffModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personnel_id", unique = true, nullable = false)
	private Integer personnel_id;

	@Column(name = "name")
	private String name;

	@Column(name = "cv")
	private String cv;

	@Column(name = "image")
	private String image;

	@Column(name = "salary")
	private Integer salary;

	@Column(name = "link")
	private String link;

	@Column(name = "age")
	private String age;
	
	@Column(name = "tg_lam_viec")
	private Integer tg_lam_viec;
}
