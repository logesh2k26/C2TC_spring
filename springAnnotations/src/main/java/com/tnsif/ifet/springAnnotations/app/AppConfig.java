package com.tnsif.ifet.springAnnotations.app;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		return new MusicTeacher();
	}
	
}
