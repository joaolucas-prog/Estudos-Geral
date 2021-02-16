package com.luv2code.hibernate.ontomany.entity;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.luv2code.hibernate.demo.entity.Student;
import com.luv2code.hibernate.ontomanyuni.entity.Review;
import com.luv2code.hibernate.ontoone.entity.Instructor;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "title")
	private String title;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "instructor")
	private Instructor instructor;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Review> reviews;

	@ManyToMany(fetch = FetchType.LAZY, 
			    cascade = { CascadeType.MERGE, CascadeType.DETACH, 
			    		    CascadeType.PERSIST,CascadeType.REFRESH })
	@JoinTable(name = "course_student", 
				joinColumns = @JoinColumn(name = "course_id"), 
				inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> students;

	public Course() {
	}

	public Course(String title) {
		this.title = title;
	}

	public void addReview(Review theReview) {
		if (reviews == null) {
			reviews = new ArrayList<>();
		}

		reviews.add(theReview);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}

	public void addStudent(Student tempStudent) {
		if(students == null) {
			students = new ArrayList<>();
		}
		students.add(tempStudent);
	}

}
