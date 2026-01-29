package oopçalışma;

public class Test {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car("Toyota", "Corolla", 2022, 150000.0);
		cars[1] = new Car("Honda", "Civic", 2023, 160000.0);
		cars[2] = new Car("Ford", "Focus", 2021, 140000.0);

		Customer customer = new Customer("Ercan", "Gursoy", "555-1234567");

		Sale sale = new Sale(cars[0], customer, 0.1);
		sale.MakeSale();
	}

}
