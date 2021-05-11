package InterfaceAbstractDemo;
import java.time.LocalDate;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Adapters.MernisServiceAdapter;

import InterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer(1,"Engin","Demiroð",LocalDate.of(1986, 01, 06),"28861499108"));
	}
}
