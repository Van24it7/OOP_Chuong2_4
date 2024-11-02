public class TestInvocie {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("Id is: "+c1.getId());
        System.out.println("Name is: "+c1.getName());
        System.out.println("Discount is: "+c1.getDiscount());

        Invoice i1 = new Invoice(101, c1, 888.8);
        System.out.println(i1);
        i1.setAmount(999.9);
        System.out.println(i1);
        System.out.println("Id is: "+i1.getId());
        System.out.println("Customer is: "+i1.getCustomer());
        System.out.println("amount is: "+i1.getAmount());
        System.out.println("customer's Id is: "+i1.getCustomerId());
        System.out.println("customer's Name is: "+i1.getCustomerName());
        System.out.println("customer's discount is: "+i1.getCustomerDiscount());
        System.out.printf("customer after discount is: %.2f%n", i1.getAmountAfterDiscount());

    }
}
