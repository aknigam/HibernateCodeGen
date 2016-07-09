package com.moneymanager.hibernate.pojo;
// Generated Aug 11, 2012 4:29:03 PM by Hibernate Tools 3.4.0.CR1



/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private long personId;
     private Long addressId;
     private String name;

    public Person() {
    }

	
    public Person(long personId) {
        this.personId = personId;
    }
    public Person(long personId, Long addressId, String name) {
       this.personId = personId;
       this.addressId = addressId;
       this.name = name;
    }
   
    public long getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(long personId) {
        this.personId = personId;
    }
    public Long getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


