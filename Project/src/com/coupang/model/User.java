package com.coupang.model;

import java.util.Objects;

public class User {

	String id; // 아이디
	String name; // 이름
	String password; // 비밀번호
	String address; // 주소
	String number; // 연락처
	
	public User() {}

	public User(String id, String name, String password, String address, String number) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", address=" + address + ", number="
				+ number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, number, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(number, other.number)
				&& Objects.equals(password, other.password);
	}
	
}
