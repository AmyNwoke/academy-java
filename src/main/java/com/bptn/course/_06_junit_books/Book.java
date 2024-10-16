package com.bptn.course._06_junit_books;



	public class Book {
		   private String title;
		    private double price;
		 
		 //creating constructor
		 public Book(String title, double price) {
		        this.title = title;
		        this.price = price;

		    }
		   
		   //Getter method for title
		   public String getTitle() {
		        return title;
		    }

		    // Step 4: Method to return book info
		   public String getBookInfo() {
			    return title + "-" + price; // Remove spaces around the hyphen
			}

		    
		   
		}

