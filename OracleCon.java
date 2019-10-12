import java.sql.*;
class OracleCon{
	public static void main(String[] args)throws Exception{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","work","work");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from tab");
			while(rs.next())
				System.out.println(rs.getString(1));
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
