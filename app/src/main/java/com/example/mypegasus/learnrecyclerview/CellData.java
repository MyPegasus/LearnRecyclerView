package com.example.mypegasus.learnrecyclerview;

/**
 * Created by MyPegasus on 2015/8/11.
 */
public class CellData {

	private String title = "title";
	private String content = "content";

	public String getContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}

	public CellData(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
