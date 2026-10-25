package customermanagement;

    public class CustomerManagementTest {

        public static void main(String[] args) {

            Customeroperations operations = new Customeroperations();

            // 1. Display all initial customers
            System.out.println("Initial Customers:");

            for (Customer c : operations.getCustomers()) {
                System.out.println(c);
            }

            // 2. Add a new customer
            System.out.println("\nAdding customer 106:");

            boolean added = operations.addCustomer(
                    106, "Ananya", "Verma", 'F');

            System.out.println("Customer added: " + added);

            // 3. Attempt to add the same customer again
            System.out.println("\nAdding duplicate customer:");

            boolean duplicate = operations.addCustomer(
                    106, "Ananya", "Verma", 'F');

            System.out.println("Customer added: " + duplicate);

            // 4. Update customer with ID 103
            System.out.println("\nUpdating customer 103:");

            boolean updated = operations.updateCustomer(
                    103, "Arjun", "Reddy", 'M');

            System.out.println("Customer updated: " + updated);

            // 5. Delete customer with ID 104
            System.out.println("\nDeleting customer 104:");

            boolean deleted = operations.deleteCustomer(104);

            System.out.println("Customer deleted: " + deleted);

            // 6. Find customer with ID 102
            System.out.println("\nFinding customer with ID 102:");

            Customer c1 = operations.findCustomerById(102);

            if (c1 != null) {
                System.out.println(c1);
            } else {
                System.out.println("Customer not found");
            }

            // 7. Find customer with first name Kiran
            System.out.println("\nFinding customer named Kiran:");

            Customer c2 = operations.findCustomerByFirstname("Kiran");

            if (c2 != null) {
                System.out.println(c2);
            } else {
                System.out.println("Customer not found");
            }

            // 8. Find customer with ID 999
            System.out.println("\nFinding customer with ID 999:");

            Customer c3 = operations.findCustomerById(999);

            if (c3 != null) {
                System.out.println(c3);
            } else {
                System.out.println("Customer with ID 999 does not exist");
            }

            // 9. Display all customers after operations
            System.out.println("\nFinal Customers:");

            for (Customer c : operations.getCustomers()) {
                System.out.println(c);
            }
        }
    }
