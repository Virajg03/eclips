package com.map.otm;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Que {

	@Id
	@Column(name = "que_id")
	private int questionId;

	private String question;

	// that is eager concept and that iss faster to lazy
	@OneToMany(mappedBy = "que", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Ans> answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Ans> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Ans> answer) {
		this.answer = answer;
	}

	public Que(int questionId, String question, List<Ans> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public Que() {
	}

	@Override
	public String toString() {
		return "Que [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

}