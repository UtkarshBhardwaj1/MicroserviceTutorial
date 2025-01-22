package com.quiz.UserService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor

@Document(collection  = "users")
public class User {
	
	@Id
	private String id;
	private String userName;
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	private String userEmail;
	
	
	// Override toString method to print user details
    @Override
    public String toString() {
        return "User{id='" + id + "', userName='" + userName + "', userEmail='" + userEmail + "'}";
    }
	

}
