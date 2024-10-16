package com.bptn.course._06_junit_books;

public class Textbook extends Book {

	  private int edition;

	//defining constructor 

public Textbook(String title, double price, int edition) {
    super(title,price);
    this.edition = edition;
  }
    
  @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    // Step 8: Getter for edition
    public int getEdition() {
        return edition;
    }
    //canSubstituteFor method
   public boolean canSubstituteFor(Textbook other) {
        return this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition();
    }

}