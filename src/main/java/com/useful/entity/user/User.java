package com.useful.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 
 * @author Admin
 *
 */
@Entity
@Table(name="TBL_USER",indexes = {@Index(name = "IDX_QRY1",columnList ="cardNo")})
public class User{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(length=20)
	private Long id;
	
	@Column(length=15)
	private String username;
	
	@Column(length=15)
	private String showname;
	
	@Column(length=30)
	private String password;
	
	@Column(length=30)
	private String cardNo;
	
	@Column(length=11)
	private String iphone;
	
	@Column(length=30)
	private String email;
	
	@Column(length=15)
	private String qqCode;
	
	private String createTime;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getIphone() {
		return iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQqCode() {
		return qqCode;
	}

	public void setQqCode(String qqCode) {
		this.qqCode = qqCode;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	


}
