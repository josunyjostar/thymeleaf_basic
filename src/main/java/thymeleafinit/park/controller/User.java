package thymeleafinit.park.controller;

public class User {
        private String userName;
        private String email;
        private String role;

        User(String userName,String email, String role) {       
            this.userName = userName;
            this.email = email;
            this.role = role;
        }

        public String getName() {
            return userName;
        }
        public void setName(String name) {
            this.userName = name;
        }

        public String getRole() {   
            return this.role;
        }

        public void setRole(String role) {   
            this.role = role; 
        }
        public String getEmail() {  return this.email; }
    }