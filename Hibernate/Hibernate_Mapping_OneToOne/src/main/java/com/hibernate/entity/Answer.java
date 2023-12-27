package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {
	@Id
	@GeneratedValue
	private int id;

	private String answer;

	@OneToOne()
	@JoinColumn(name = "qid")
	private Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String answer, Question question) {
		super();
		this.id = id;
		this.answer = answer;
		this.question = question;
	}

	public Answer(String answer, Question question) {
		super();
		this.answer = answer;
		this.question = question;
	}

	public Answer(Question question) {
		super();
		this.question = question;
	}

	public Answer(String answer) {
		super();
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", question=" + question + "]";
	}

}
