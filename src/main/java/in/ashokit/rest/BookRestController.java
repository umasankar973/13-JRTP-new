package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value="/book",
			   produces = {"application/json","application/xml"})  
	public ResponseEntity<Book> getBook() {
		Book book=new Book(101, "Spring", "Ashok", 200.0);
		//return book obj 
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}
}
