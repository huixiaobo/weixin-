package com.example.weixin.bean;

import java.util.List;

public class Data {
	private int group_id, id, up, total_replies, visits;
	private String content, created_at;
	private boolean stickied;
	private Author author;
	private Group group;
	private List<Replies> replies;
	private List<Ments> attachments;
	private List<Users> last_up_users;

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getTotal_replies() {
		return total_replies;
	}

	public void setTotal_replies(int total_replies) {
		this.total_replies = total_replies;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public boolean isStickied() {
		return stickied;
	}

	public void setStickied(boolean stickied) {
		this.stickied = stickied;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<Replies> getReplies() {
		return replies;
	}

	public void setReplies(List<Replies> replies) {
		this.replies = replies;
	}

	public List<Ments> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Ments> attachments) {
		this.attachments = attachments;
	}

	public List<Users> getLast_up_users() {
		return last_up_users;
	}

	public void setLast_up_users(List<Users> last_up_users) {
		this.last_up_users = last_up_users;
	}

	@Override
	public String toString() {
		return "Data [group_id=" + group_id + ", id=" + id + ", up=" + up
				+ ", total_replies=" + total_replies + ", visits=" + visits
				+ ", content=" + content + ", created_at=" + created_at
				+ ", stickied=" + stickied + ", author=" + author + ", group="
				+ group + ", replies=" + replies + ", attachments="
				+ attachments + ", last_up_users=" + last_up_users + "]";
	}

}
