package com.goodee.dto;

import java.sql.Date;

public class MemberVo {
	private String userid; // 아이디
	private String upwd; // 패스워드
	private String userImg; // 유저 이미지
	private Date registerdate; // 가입일
	private int point; // 포인트
	private String isadmin; // 관리자냐?
	private Date lastlogindate; //  최근 접속일
	
	public MemberVo(String userid, String upwd, String userImg, Date registerdate, int point,String isadmin,Date lastlogindate) {	
		this.userid = userid;
		this.upwd = upwd;
		this.userImg = userImg;
		this.registerdate = registerdate;
		this.point = point;
		this.isadmin = isadmin;
		this.lastlogindate=lastlogindate;
	}	
	
	// 회원가입 생성자
	public MemberVo(String uid, String pwd, String upFileName) {
		this.userid = uid;
		this.upwd = pwd;
		this.userImg = upFileName;
	}
		
	public String getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}		

	public Date getLastlogindate() {
		return lastlogindate;
	}

	public void setLastlogindate(Date lastlogindate) {
		this.lastlogindate = lastlogindate;
	}

	@Override
	public String toString() {
		return "MemberVo [userid=" + userid + ", upwd=" + upwd + ", userImg=" + userImg + ", registerdate="
				+ registerdate + ", point=" + point + ", isadmin=" + isadmin + ", lastlogindate=" + lastlogindate + "]";
	}	
							
}
