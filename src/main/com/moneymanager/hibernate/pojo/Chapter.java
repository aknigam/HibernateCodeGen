package com.moneymanager.hibernate.pojo;
// Generated Aug 11, 2012 4:29:03 PM by Hibernate Tools 3.4.0.CR1



/**
 * Chapter generated by hbm2java
 */
public class Chapter  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String noOfPages;

    public Chapter() {
    }

    public Chapter(String title, String noOfPages) {
       this.title = title;
       this.noOfPages = noOfPages;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getNoOfPages() {
        return this.noOfPages;
    }
    
    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }




}

