package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "catering")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Catering extends BaseEntity {

	@Column(name = "catername")
	private String catername;

	@Column(name = "cater_desc")
	private String cater_desc;

	@Column(name = "cater_location")
	private String cater_location;

	@Column(name = "cater_price")
	private double cater_price;

	@Column(name = "cater_img", columnDefinition = "longblob")
	private String cater_img;

	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Bookings booking;

}
