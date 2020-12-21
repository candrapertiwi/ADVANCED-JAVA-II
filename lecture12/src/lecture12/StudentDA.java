package lecture12;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class StudentDA {
	private Connection conn;
	
	public boolean Save(Student student) {
		Statement stat = null;
		try {
			conn = MySQLDBConnection.getConnection();
			stat = conn.createStatement();
			String sql = "INSERT INTO student VALUES ('" + student.getStudentID()
			+"','" + student.getName()+"','" + student.getScore() + ")";
			stat.executeUpdate(sql);
			stat.close();
			conn.close();		
			return true;
		}
		catch(SQLException ie) {
			ie.printStackTrace();
			return false;
		}
		finally {
			try {
				if (stat!=null) stat.close();
					if(conn!=null) conn.close();
			}
			catch(SQLException ie) {
				ie.printStackTrace();
				return false;
			}
			
		} 
		
	}
	
	public Student getStudent(String StudentID) {
		Statement stat =null;
		Student s=null;
		
		try {
			conn= MySQLDBConnection.getConnection();
			stat = conn.createStatement();
			String sql = "SELECT studentName, score From student WHERE StudentID"
					+ " = '" +StudentID+"'";
			ResultSet rs= stat.executeQuery(sql);
			
			while(rs.next()) {
				String studentName =rs.getString("studentName");
				double score = rs.getDouble("score");
				s = new Student(StudentID, studentName, score);
			}
			rs.close();
		}
		catch(SQLException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				if(stat!=null) stat.close();
				if(conn!=null) conn.close();
			}
			catch(SQLException ie){
				ie.printStackTrace();
			}
		}
		return s;
		
	}

}
