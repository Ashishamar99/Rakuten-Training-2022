import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.Timestamp;

public class TransactionExample {
	
	private static final String SQL_INSERT = "INSERT INTO EMPLOYEE(NAME, SALARY, CREATED_DATE) VALUES (?, ?, ?)";
	private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";
	private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE" + "(ID serial," + "NAME varchar(100) NOT NULL," + "SALARY numeric(15, 2) NOT NULL," + "CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (ID))";
	private static final String SQL_TABLE_DROP = "DROP TABLE EMPLOYEE";
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/db1", "postgres", "admin1234");
			System.out.println(connection);
			
			// Make sure that statement is imported from java.sql AND NOT FROM java.beans or something.
			Statement statement = connection.createStatement();
			
			PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
			PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
			
			statement.execute(SQL_TABLE_DROP);
			statement.execute(SQL_TABLE_CREATE);
			
			connection.setAutoCommit(false);
			
			psInsert.setString(1, "Jim");
			psInsert.setBigDecimal(2, new BigDecimal(100000));
			
			// Make sure that Timestamp is imported from java.sql and NOT FROM java.security.
			psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			psInsert.execute();
			
			psInsert.setString(1, "Dwight");
			psInsert.setBigDecimal(2, new BigDecimal(150000));
			
			// Make sure that Timestamp is imported from java.sql and NOT FROM java.security.
			psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			psInsert.execute();
			
			connection.commit();
			connection.setAutoCommit(true);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
