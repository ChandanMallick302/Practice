package com.springjdbc.By_Annotation_Based_Configuration.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.By_Annotation_Based_Configuration.model.Student;

@Component("sdao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student student) {
		String sql1 = "insert into Student (id,name,address) values (?,?,?)";
		int insert = jdbcTemplate.update(sql1, student.getId(), student.getName(), student.getAddress());
		System.out.println("Sucessfully " + insert + " Data inserted");
		return insert;
	}

	@Override
	public int updateDetails(Student student) {
		String sql2="update student set name=?, address=? where id=?";
		int update = jdbcTemplate.update(sql2, student.getName(), student.getAddress(),student.getId());
		System.out.println("Sucessfully " + update + " Data updated");
		return update;
	}

	@Override
	public int delete(int id) {
		String sql3 = "delete from student where id=?";
		int delete = jdbcTemplate.update(sql3, id);
		System.out.println("Sucessfully " + delete + " Data deleted");
		return delete;
	}

	@Override
	public Student getStudentById(int id) {
		String sql4 = "Select * from student where id=?";
		RowMapper<Student> rowMapper =new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAddress(rs.getString(3));
				return s;
			}
		};
		Student student = jdbcTemplate.queryForObject(sql4, rowMapper, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String sql4 = "Select * from student";
		RowMapper<Student> rowMapper=new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAddress(rs.getString(3));
				return s;
			}
		};
		List<Student> studentList = jdbcTemplate.query(sql4,rowMapper);
		return studentList;
	}

}
