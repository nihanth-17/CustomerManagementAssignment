package customermanagement;

import java.util.HashSet;
import java.util.Iterator;

    public class Customeroperations {

        private HashSet<Customer> customers = new HashSet<>();

        // Constructor to initialize customer records
        public Customeroperations() {
            customers.add(new Customer(101, "Rahul", "Sharma", 'M'));
            customers.add(new Customer(102, "Priya", "Reddy", 'F'));
            customers.add(new Customer(103, "Arjun", "Kumar", 'M'));
            customers.add(new Customer(104, "Sneha", "Rao", 'F'));
            customers.add(new Customer(105, "Kiran", "Patel", 'M'));
        }

        // Method 1: Add a customer
        public boolean addCustomer(int id, String firstname,
                                   String lastname, char gender) {

            Customer c = new Customer(id, firstname, lastname, gender);

            return customers.add(c);
        }

        // Method 2: Update customer details
        public boolean updateCustomer(int customerId, String firstname,
                                      String lastname, char gender) {

            Iterator<Customer> itr = customers.iterator();

            while (itr.hasNext()) {
                Customer c = itr.next();

                if (c.getId() == customerId) {

                    // Remove before modifying the object
                    itr.remove();

                    c.setFirstname(firstname);
                    c.setLastname(lastname);
                    c.setGender(gender);

                    customers.add(c);

                    return true;
                }
            }

            return false;
        }

        // Method 3: Delete a customer
        public boolean deleteCustomer(int customerId) {

            Iterator<Customer> itr = customers.iterator();

            while (itr.hasNext()) {
                Customer c = itr.next();

                if (c.getId() == customerId) {
                    itr.remove();
                    return true;
                }
            }

            return false;
        }

        // Method 4: Retrieve all customers
        public HashSet<Customer> getCustomers() {
            return customers;
        }

        // Method 5: Find a customer by ID
        public Customer findCustomerById(int customerId) {

            for (Customer c : customers) {
                if (c.getId() == customerId) {
                    return c;
                }
            }

            return null;
        }

        // Method 6: Find a customer by first name
        public Customer findCustomerByFirstname(String firstname) {

            for (Customer c : customers) {
                if (c.getFirstname().equals(firstname)) {
                    return c;
                }
            }

            return null;
        }
    }
