package com.infy.decompressor.entity;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Person {
    private String name;
    private String project;
    private String hobby;

    // Add a default constructor
    public Person() {
    }

    // Add getters and setters
    // ...
    
    // Add toString() method for convenience
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", project='" + project + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
