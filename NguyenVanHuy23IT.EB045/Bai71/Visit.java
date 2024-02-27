package Bai71;
import java.util.Date;

public class Visit {
    private String name;
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        customer =new Customer(name);
        this.date = date;
    }

    public String getName() {
    	return customer.getName();
    }

    public Customer getCustomer() {
    	return customer;
    }
    
    public void setCustomer(Customer customer) {
    	this.customer=customer;
    }
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());

        double discountedServiceTotal = serviceExpense - (serviceExpense * serviceDiscount);
        double discountedProductTotal = productExpense - (productExpense * productDiscount);

        return discountedServiceTotal + discountedProductTotal;
    }

    @Override
    public String toString() {
        return "Visit [name=" + name + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense="
                + productExpense + "]";
    }
}

