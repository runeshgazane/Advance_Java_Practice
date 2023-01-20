package com.pojo;

import java.util.Date;

public class Tutorial {
//id | name  | author | publish_date | visits | contents  | topic_id
	private int id;
	private String name;
	private String author;
	private Date publish_date;
	private int visits;
	private String content;
	private int topic_id;
	
	public Tutorial(int id, String name, String author, Date publish_date, int visits, String content, int topic_id) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publish_date = publish_date;
		this.visits = visits;
		this.content = content;
		this.topic_id = topic_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", author=" + author + ", publish_date=" + publish_date
				+ ", visits=" + visits + ", content=" + content + ", topic_id=" + topic_id + "]";
	}
	
}
