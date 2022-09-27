package org.example;

public class Address {

        private String city;
        private String state;
        private String country;
        private String zipcode;

        public String getZipcode() {
                return zipcode;
        }

        public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        @Override
        public String toString(){
                return "city: " + city + " State: " + state + " Country: " + country + " zipcode: " + zipcode + " ";
        }


}
