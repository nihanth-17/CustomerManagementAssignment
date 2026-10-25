package customermanagement;

import java.util.Objects;

public class Customer {

        private int id;
        private String firstname;
        private String lastname;
        private char gender;

        // No-argument constructor
        public Customer() {
        }

        // Parameterized constructor
        public Customer(int id, String firstname, String lastname, char gender) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.gender = gender;
        }

        // Getter and setter for id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Getter and setter for firstname
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        // Getter and setter for lastname
        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        // Getter and setter for gender
        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        // Overridden equals() method
        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Customer)) {
                return false;
            }

            Customer other = (Customer) obj;

            return id == other.id
                    && Objects.equals(firstname, other.firstname)
                    && Objects.equals(lastname, other.lastname)
                    && gender == other.gender;
        }

        // Overridden hashCode() method
        @Override
        public int hashCode() {
            return Objects.hash(id, firstname, lastname, gender);
        }

        // Overridden toString() method
        @Override
        public String toString() {
            return "Customer[id=" + id
                    + ", firstname=" + firstname
                    + ", lastname=" + lastname
                    + ", gender=" + gender + "]";
        }
    }

