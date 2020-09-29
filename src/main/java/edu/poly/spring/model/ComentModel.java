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

public class ComentModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id", unique = true, nullable = false)
	private Integer comment_id;

	@Column(name = "name")
	private Integer name;

	@Column(name = "email")
	private String email;

	@Column(name = "message")
	private String message;

	@Column(name = "image")
	private String image;

	@Column(name = "`sdt`")
	private Integer sdt;

	@CreationTimestamp
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "date")
	private Date date;

}
