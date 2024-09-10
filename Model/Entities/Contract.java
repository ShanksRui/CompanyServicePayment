package Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
      
      private Integer number;	
      private LocalDate date;		
      private Double totalValue;	
      public static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	 
      List<Installment> list = new ArrayList<>();
      
	public Contract() {
    	  
      }  
    public Contract(Integer number,LocalDate date,Double totalValue) {
    	  this.number = number;
    	  this.date = date;
    	  this.totalValue = totalValue;	  	  
      }  
    public Integer getNumber() {
    	  return number;
      }
    public void setNumber(Integer number) {
    	  this.number = number;
      }
    public LocalDate getDate() {
    	  return date;
      }
    public void setDate(LocalDate date){
    	  this.date = date;
      }
    public Double getTotalValue() {
    	 return totalValue;
      }
    public void setTotalValue(Double totalValue) {
    	 this.totalValue = totalValue;
     }

	public List<Installment> getList() {
		return list;
	}
	public void addList(Installment list){	
		 this.list.add(list);	
	}
	public void removeList(Installment list) {
	     this.list.remove(list);
	}

	public Installment getInstallmeent() {
		return getInstallmeent();
	}

	public void setInstallmeent(Installment installmeent) {
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Installment x : list){
			sb.append(x.getDueDate().format(f1));	
			sb.append("-");	
			sb.append(String.format("%.2f", x.getAmount()));				
			sb.append("\n");
		}return sb.toString();
	}
}  
