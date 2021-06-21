package me.kalriz.messanger.dto.event;

import lombok.Data;

@Data
public class Message {
	private String nickName;
	private Long timestamp = System.currentTimeMillis();
	private String message;
}
