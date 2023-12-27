package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String question;
	@OneToOne(mappedBy = "question")
	private Answer answer;

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}

	public Question(String question, Answer answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public Question(int id, String question, Answer answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(String question) {
		super();
		this.question = question;
	}
	

}
