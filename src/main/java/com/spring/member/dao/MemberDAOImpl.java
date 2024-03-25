package com.spring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	// 주어진 연결을 하는 데이터소스를 가지고 JDBC 템플릿 활용
	@Autowired
	// Spring의 의존성 주입 기능에 의해 자동 연결되도록 생성자, 필드, setter 메소드 또는 구성 메소드를 표시합니다.
	// 이는 JSR-330 Inject 주석의 대안으로 필수 및 선택적 의미를 추가합니다.
	private SqlSession sqlSession;

//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}

	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	public void addMember(MemberVO memberVO) throws DataAccessException {
		sqlSession.insert("mapper.member.insertMember",memberVO);
	}

	@Override
	public void updateMember(MemberVO memberVO) throws DataAccessException {
		sqlSession.update("mapper.member.updateMember",memberVO);
	}

	@Override
	public void delMember(String id) throws DataAccessException {
		sqlSession.update("mapper.member.deleteMember",id);
	}

}
