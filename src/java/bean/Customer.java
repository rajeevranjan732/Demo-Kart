package bean;
 
public class Customer {
   private boolean login=false;
   private String name = null;
   private String address = null;
   private String email = null;
   private String password = null;
   private String phone = null;
   private String kart = null;
   private String bought = null;
   
   public boolean getLogin(){
       return login;
   }
   public void setLogin(boolean login){
       this.login=login;
   }
   
   public String getName() {
      return(name);
   }
   public void setName(String name) {
      this.name = name;
   }
   
   public String getAddress() {
      return(address);
   }
   public void setAddress(String address) {
      this.address = address;
   }
   
   public String getEmail() {
      return(email);
   }
   public void setEmail(String email) {
      this.email = email;
   }
   
   public String getPassword() {
      return(password);
   }
   public void setPassword(String password) {
      this.password = password;
   }
   
   public String getPhone() {
      return(phone);
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   
   public String getKart() {
      return(kart);
   }
   public void setKart(String kart) {
      this.kart = kart;
   }
   
   public String getBought() {
      return(bought);
   }
   public void setBought(String bought) {
      this.bought = bought;
   }
}