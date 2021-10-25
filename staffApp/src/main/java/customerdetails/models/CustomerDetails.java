package customerdetails.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDetails {
	static Connection con =null;
	private String customerId;
	private String custName;
	private String address;

	public CustomerDetails(String customerId, String custName, String address) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("CustomerDetails [customerId=%s, custName=%s, address=%s]", customerId, custName, address);
	}

	public boolean addCustomer() throws SQLException {
		
		try {

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/customers?user=root&password=1234");

			String query = "insert into Customerdetails(id,name,address) value(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1, getCustomerId());
			pst.setString(2, getCustName());
			pst.setString(3, getAddress());

			int i = pst.executeUpdate();

			con.close();
			if (i != 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		return false;
	}

	public static CustomerDetails checkCustomer(String id) throws SQLException {
		
		try {

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/customers?user=root&password=1234");

			String query = "select id,name,address from Customerdetails where id=?";

			PreparedStatement pst= con.prepareStatement(query);
			pst.setString(1, id);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				return  new CustomerDetails(rst.getString("id"), rst.getString("name"),rst.getString("addesss"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}

		return null;
	}

}
