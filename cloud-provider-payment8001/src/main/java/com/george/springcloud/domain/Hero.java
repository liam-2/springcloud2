package domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero implements Serializable {

	//private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private String attack;

	private String defend;

}