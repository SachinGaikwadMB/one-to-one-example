package com.mb.api.persistance.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="pancards")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PanCard
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer panId;
	
	@Column(name = "pancard_number")
	private String pancardNumber;
	
	@Column(name = "pancard_holder_name")
	private String pancardHolderName;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date issuedDate;

}
