package com.app.entities;

import java.sql.Date;
import java.util.ArrayList;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity()
@Table(name="bookings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Bookings extends BaseEntity {
	
	
	@Column(name="event_date")
	private Date event_date;
	
	@Column(name="event_start_time")
	private String start_at;
	
	@Column(name="max_total_hour")
	private String max_total_hour;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="no_of_guest")
	private String no_of_guest;
	
	@Column(name="photographer",columnDefinition = "text")
	private Boolean photographer_name_desc=false;
	
//	@Column(name="dj",columnDefinition = "text")
//	private String dj_name_desc;
	
	@Column(name="makeupartist",columnDefinition = "text")
	private Boolean makeupartist_name_desc=false;
	
//	@Column(name="decorator",columnDefinition = "text")
//	private String decorator_name_desc;
	
//	@Column(name="booking_done_date")
//	private String current_date;
//	
	@Column(name="payment_status")
	private Boolean payment_status=false;
	
	@OneToMany(mappedBy = "booking"	)	
	private List<Hotel> hotel;
	

	@OneToMany(mappedBy = "booking")
	private List<Catering> catering;
	
	@ManyToOne()
	@JoinColumn(name="user_id",nullable = false)
	private User user;
	


}
