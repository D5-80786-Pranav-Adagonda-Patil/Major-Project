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



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="hotel")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Hotel extends BaseEntity{
	
	
    @Column(name="hotel_name")
	private String hotelName;
    
    @Column(name="hotel_desc")
	private String hotelDesc;
    
    @Column(name="hotel_img1",columnDefinition = "longblob")
	private String hotelImg1;

    @Column(name="price")
    private int price;
    
    @Column(name="location")
    private String location;
    
    @ManyToOne
	@JoinColumn(name = "hotel_id")
	private Bookings booking;

    

}
