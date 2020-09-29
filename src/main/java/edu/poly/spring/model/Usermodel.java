package edu.poly.spring.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Table(name = "oder")
@Entity
@Setter
@Getter
public class Usermodel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oder_id", unique = true, nullable = false)
	private Integer id;

	@NotEmpty(message = "vui lòng chọn món ăn")
	@Column(name = "food_name")
	private String foodname;

	@Column(name = "name")
	private String name;

	@NotEmpty(message = "số điện thoại không được để trống")
	@Column(name = "`sđt`")
	private Integer sđt;

	@Column(name = "`status`")
	private String status;

	@NotEmpty(message = "địa chỉ không được để trống")
	@Column(name = "address")
	private String address;
	
	@Column(name = "sl")
	private Integer sl;
	
}

