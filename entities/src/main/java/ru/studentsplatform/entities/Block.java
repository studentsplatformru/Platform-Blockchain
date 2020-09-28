package ru.studentsplatform.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Krylov Sergey (27.09.2020)
 */
@Data
@Entity
public class Block {
	/**
	 * Поле id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String data;
}
