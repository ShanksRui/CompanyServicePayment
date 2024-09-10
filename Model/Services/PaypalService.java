package Model.Services;

public class PaypalService implements OnlinePaymentService{

	public Double Payment(Double amount) {
			return amount * 0.02;		
	}
	public Double Interest(Double amount, Integer month) {
			return amount * 0.01 * month;			
	}
}
