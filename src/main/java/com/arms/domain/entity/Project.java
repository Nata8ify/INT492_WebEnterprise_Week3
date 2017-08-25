
package com.arms.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


import lombok.Data;

@Entity
@Data
@Table(name = "project")
public class Project {
	@GeneratedValue
	@Id
	private int id;
	@NotEmpty
	private String name;

	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private List<Task> taskList;
	
	private Date createdDate;
	private Date updatedDate;

}
