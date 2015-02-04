package com.example.weixin.bean;

public class Ments {
	private int width, height;
	private String url, mime, thumb;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	@Override
	public String toString() {
		return "Ments [width=" + width + ", height=" + height + ", url=" + url
				+ ", mime=" + mime + ", thumb=" + thumb + "]";
	}
}
