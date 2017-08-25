package com.arms.domain.entity;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "task")
public class Task {
	@GeneratedValue
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;
	@NotEmpty
	private String name;
	@NotNull
	private boolean status;
	private Date createdDate;
	private Date updatedDate;
}