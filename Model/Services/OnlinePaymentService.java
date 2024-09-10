package Model.Services;

public interface OnlinePaymentService {
    
	Double Payment(Double amount);
    Double Interest(Double amount,Integer month);
	
}
