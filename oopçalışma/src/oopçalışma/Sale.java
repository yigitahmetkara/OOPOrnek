package oopçalışma;


public class Sale {

	private Car car;
	private Customer customer;
	private double discount;
	
	public Sale(Car car,Customer customer,double discount) {
		this.car=car;
		this.customer=customer;
		this.discount=discount;
	}
		public double calculatetotalPrice(){
		double price = car.getPrice(); 
		double discountedprice = price-(price*discount);
		return discountedprice;
		}
		public void MakeSale() {
		System.out.println(" Sale completed! ");
		System.out.println(" Customer "+ customer.getfirstName()+ "  " +customer.getlastName());
		System.out.println(" PhoneNumber "+ customer.getphoneNumber());
		System.out.println("Car: " + car.getBrand() + " " + car.getModel() +
                " (" + car.getYear() + ")");
        System.out.println("Total Price: " + calculatetotalPrice());
		
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
