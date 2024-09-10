package Model.Services;

import java.time.LocalDate;
import Model.Entities.Contract;
import Model.Entities.Installment;

public class ContractServices {
	
private OnlinePaymentService service;
private Contract obj;

public ContractServices(OnlinePaymentService service) {
    this.service = service;
}
  public void ProcessContract(Contract obj, Integer months) {
	         Double value = obj.getTotalValue() / months;
	         for(int i = 1;i <= months;i++) {
	         Double fees = value + service.Interest(value, i); 
	         Double tax = fees + service.Payment(fees);
	         LocalDate dueDate = obj.getDate().plusMonths(i);
	         obj.addList(new Installment(dueDate, tax));
	         
	         }
	    }
}
