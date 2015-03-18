package DBLayer;

import java.util.ArrayList;

public interface IFDBEmp {
	public ArrayList<Customer> getAllCustomers(boolean retriveAssociation);

	public Customer findCustomer(String empssn, boolean retriveAssociation);

	public Customer searchCustomerName(String fname, boolean retriveAssociation);

	public int insertCustomer(Customer customer) throws Exception;

	public int updateCustomer(Customer customer);

	public Customer searchCustomerId(String id, boolean b);

}
