package contact;

public class Address {

		private String street;
		private Integer houseNumber;
		private String district;
		private String city;
		private String state;
		
		public Address() {};
		
		public Address(String street, Integer houseNumber, String district, String city, String state) {
			this.street = street;
			this.houseNumber = houseNumber;
			this.district = district;
			this.city = city;
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", houseNumber=" + houseNumber + ", district=" + district + ", city="
					+ city + ", state=" + state + "]";
		}
		
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public Integer getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(Integer houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		

}
