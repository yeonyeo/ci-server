package com.example0;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {
	@Value("${spring.datasource.username}")
	String username;

	@Test
	void contextLoads() {
	}
	@Test
	void  dbUserNameIsSa(){
		assertEquals("sa",username);
//		String url = "jdbc:h2:mem:testdb";  // 예제 URL, 실제 DB URL로 교체하세요
//		String user = "sa";  // 예상 사용자 이름
//		String password = "";  // 사용자의 비밀번호
//
//		try (Connection conn = DriverManager.getConnection(url, user, password);
//			 Statement stmt = conn.createStatement();
//			 ResultSet rs = stmt.executeQuery("SELECT CURRENT_USER()")) {
//
//			if (rs.next()) {
//				String currentUser = rs.getString(1);
//				assertTrue("sa".equalsIgnoreCase(currentUser), "데이터베이스 사용자는 'sa'여야 합니다.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}







	}


