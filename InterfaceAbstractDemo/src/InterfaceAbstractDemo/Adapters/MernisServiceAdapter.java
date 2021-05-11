package InterfaceAbstractDemo.Adapters;
import InterfaceAbstractDemo.Abstract.ICustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
					customer.DateOfBirth.getYear());

		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return result;	
	}
}
