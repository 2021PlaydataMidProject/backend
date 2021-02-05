package io.gourmand.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "USER_STANDARD")
public class UserStandard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "U_FLAVOR")
	private BigDecimal uFlavor;
	
	@Column(name = "U_CLEAN")
	private BigDecimal uClean;
	
	@Column(name = "U_COST")
	private BigDecimal uCost;
	
	@Column(name = "U_MOOD")
	private BigDecimal uMood;
	
	@Column(name = "U_KINDNESS")
	private BigDecimal uKindness;
	
	@Column(name = "U_ACCESS")
	private BigDecimal uAccess;
}