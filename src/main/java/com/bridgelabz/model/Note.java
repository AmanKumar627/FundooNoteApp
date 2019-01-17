package com.bridgelabz.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name = "Note")
public class Note 
{
   public Note() {
	   
   }
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
    @Column(name="discription")
	private String discription;
    @Column(name="name")
	private String name;

	public String getName() {
		return this.name;
	}

	@ManyToOne
	@JoinColumn(name="id")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", discription=" + discription + ", name=" + name + "]";
	}

}
