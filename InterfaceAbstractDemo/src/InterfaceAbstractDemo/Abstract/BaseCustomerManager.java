package InterfaceAbstractDemo.Abstract;
import InterfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public  void save(Customer customer) {   //Virtual neden kullanılamadı?!!!
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
