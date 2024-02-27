package Bai71;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        
        Customer customer1 = new Customer("A");
        customer1.setMember(true);
        customer1.setMemberType("Premium");
        Customer customer2 = new Customer("B");
        customer2.setMember(true);
        customer2.setMemberType("Gold");
        
        Visit visit1 = new Visit(customer1.getName(), new Date());
        visit1.setServiceExpense(400.0);
        visit1.setProductExpense(1000.0);
        visit1.setCustomer(customer1);
        Visit visit2 = new Visit(customer2.getName(), new Date());
        visit2.setServiceExpense(400.0);
        visit2.setProductExpense(1000.0);
        visit2.setCustomer(customer2);
        
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Service Expense: $" + visit1.getServiceExpense());
        System.out.println("Product Expense: $" + visit1.getProductExpense());
        System.out.println("Total Expense: $" + visit1.getTotalExpense());
        System.out.println("Customer: " + customer2.getName());
        System.out.println("Service Expense: $" + visit2.getServiceExpense());
        System.out.println("Product Expense: $" + visit2.getProductExpense());
        System.out.println("Total Expense: $" + visit2.getTotalExpense());
    }
}
