package com.map.otm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ans {

	@Id
	private int answerId;
	private String answer;

	@ManyToOne
//	@Column(name = "")
	private Que que;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Que getQue() {
		return que;
	}

	public void setQue(Que que) {
		this.que = que;
	}

	public Ans(int answerId, String answer, Que que) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.que = que;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ans [answerId=" + answerId + ", answer=" + answer + ", que=" + que + "]";
	}

}
