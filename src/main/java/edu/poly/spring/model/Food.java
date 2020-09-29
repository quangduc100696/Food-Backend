package edu.poly.spring.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Table(name = "comment")
@Entity
@Setter
@Getter
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_id", unique = true, nullable = false)
	private Integer food_id;

	@Column(name = "name")
	private Integer name;

	@Column(name = "price")
	private String price;

	@Column(name = "status")
	private String status;

	@Column(name = "image")
	private String image;

}
