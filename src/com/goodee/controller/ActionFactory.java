package com.goodee.controller;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.goodee.dao.MemberDAO;
import com.goodee.dto.MemberVo;
import com.goodee.dto.UserPointLog;

// servlet 에서 받아온 데이터를 Model단으로 넘겨주기 위한 Controller 부분
// 메모리 효율적으로 관리하기 위해 싱글톤 사용
public class ActionFactory implements IActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {		
	}
	
	public static ActionFactory getInstance() {
		if (instance==null) {
			return new ActionFactory();
		}
		return instance;
	}

	@Override
	public void registerMember(MemberVo vo) throws NamingException, SQLException {
		System.out.println("ActionFactory : "+vo);
		MemberDAO dao=MemberDAO.getInstance(); // MemberDAO 객체를 생성
		dao.insertMember(vo); // MemberDAO 객체의 insertMember() 메서드 호출, vo를 넘겨줌
		
	}

	@Override
	public boolean idIsDuplicate(String uid) throws NamingException, SQLException {
		MemberDAO dao=MemberDAO.getInstance();
		return dao.idIsDuplicate(uid);
		
	}

	@Override
	public MemberVo loginProcess(String uid, String pwd) throws NamingException, SQLException {
		System.out.println("ActionFactory : "+uid+", "+pwd);
		
		// MemberDAO의 loginProcess 호출				
		
		return MemberDAO.getInstance().loginProcess(uid, pwd);
	}

	@Override
	public List<MemberVo> entireMember() throws NamingException, SQLException {
		MemberDAO mdao=MemberDAO.getInstance();
		
		return mdao.entireMember();
	}

	public MemberVo getMember(String uid) throws NamingException, SQLException {
		MemberDAO mdao=MemberDAO.getInstance();
		
		return mdao.getMember(uid);
	}

	@Override
	public List<UserPointLog> getPointLog(String uid) throws NamingException, SQLException {
		MemberDAO mdao=MemberDAO.getInstance();
		return mdao.getPointLog(uid);
		
	}
}
