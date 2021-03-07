package org.Mus.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Recruiters")
public class Recruiter  implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_recruiter;
	
	//@Column(nullable = false, length = 50)
	private String company_name;
	//@Column(nullable = false, length = 50)
	private String company_speciality;
	//@Column(/*nullable = false,*/ length = 10)
	private String recruiter_phone;
	//@Column(/*nullable = false,*/ length = 250)
	private String company_url;
	//@Column(/*nullable = false,*/ length = 50)
	private String recruiter_firstname;
	//@Column(/*nullable = false,*/ length = 50)
	private String recruiter_lastname;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;
	/*@OneToMany(mappedBy="Recruiter", fetch=FetchType.LAZY)
	private Collection<Recruiter> recruiters;*/
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Recruiter() {}
	public Recruiter(String company_name,String company_speciality,
			String recruiter_phone,String company_url,String recruiter_firstname,String recruiter_lastname) 
	{
		
		this.company_name=company_name;
		this.company_speciality=company_speciality;
		this.recruiter_phone=recruiter_phone;
		this.company_url=company_url;
		this.recruiter_firstname=recruiter_firstname;
		this.recruiter_lastname=recruiter_lastname;
		
	}
	
	
	
	public Long getId_recruiter() {
		return id_recruiter;
	}
	public void setId_recruiter(Long id_recruiter) {
		this.id_recruiter = id_recruiter;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_speciality() {
		return company_speciality;
	}
	public void setCompany_speciality(String company_speciality) {
		this.company_speciality = company_speciality;
	}
	public String getRecruiter_phone() {
		return recruiter_phone;
	}
	public void setRecruiter_phone(String recruiter_phone) {
		this.recruiter_phone = recruiter_phone;
	}
	public String getCompany_url() {
		return company_url;
	}
	public void setCompany_url(String company_url) {
		this.company_url = company_url;
	}
	public String getRecruiter_firstname() {
		return recruiter_firstname;
	}
	public void setRecruiter_firstname(String recruiter_firstname) {
		this.recruiter_firstname = recruiter_firstname;
	}
	public String getRecruiter_lastname() {
		return recruiter_lastname;
	}
	public void setRecruiter_lastname(String recruiter_lastname) {
		this.recruiter_lastname = recruiter_lastname;
	}
}
