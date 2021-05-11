package InterfaceAbstractDemo.Concrete;
import InterfaceAbstractDemo.Abstract.ICustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
}
