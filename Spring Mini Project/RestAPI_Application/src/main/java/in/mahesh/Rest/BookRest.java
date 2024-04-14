package in.mahesh.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.Service.BookService;
import in.mahesh.entity.Book;

@RestController
public class BookRest {
	
	@Autowired
	private BookService service;
	
	@PostMapping(value="/book",consumes = "application/json")
	public ResponseEntity<String> getBook(@RequestBody Book book){
		String saveBook = service.saveBook(book);
		return new ResponseEntity<String>(saveBook, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/book/{bId}" , produces = "application/json")
	public ResponseEntity<Book> getBookById(@PathVariable Integer bId){
		Book byId = service.getById(bId);
		return new ResponseEntity<Book>(byId, HttpStatus.OK);
	}
	
	@GetMapping(value="books" , produces = "application/json")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> list = service.getAllDetails();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}
	
	@PutMapping(value="book" , consumes = "application/json")
	public ResponseEntity<String> udateBook(@RequestBody Book book){
		String saveBook = service.saveBook(book);
		return new ResponseEntity<String>(saveBook, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/book/{bId}" , consumes = "application/json")
	public ResponseEntity<String> delRecord(@PathVariable Integer bId){
		String delRecord = service.delRecord(bId);
		return new ResponseEntity<String>(delRecord, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
