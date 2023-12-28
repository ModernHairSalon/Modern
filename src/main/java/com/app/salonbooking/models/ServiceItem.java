package com.app.salonbooking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer price;

    private Integer duration;

    private String description;

    //Join with bookings table
    @OneToMany(mappedBy = "serviceItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Booking> bookings;

    //Join with barbers table
    @ManyToMany
    @JoinTable(name = "service_provider",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "barber_id"))
    private List<Barber> barbers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Barber> getBarbers() {
		return barbers;
	}

	public void setBarbers(List<Barber> barbers) {
		this.barbers = barbers;
	}

	@Override
	public String toString() {
		return "ServiceItem [id=" + id + ", name=" + name + ", price=" + price + ", duration=" + duration
				+ ", description=" + description + ", bookings=" + bookings + ", barbers=" + barbers + "]";
	}
    
}
