package sat.entity;

import java.util.Date;

public class Event {

	private String title;

	private String desc;

	private Date from;

	private Date to;

	public Event() {
		super();
	}

	public Event(String title) {
		super();
		this.title = title;
	}

	public Event(String title, String desc, Date from, Date to) {
		super();
		this.title = title;
		this.desc = desc;
		this.from = from;
		this.to = to;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
}
