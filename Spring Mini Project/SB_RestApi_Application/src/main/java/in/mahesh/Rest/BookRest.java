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

import in.mahesh.BookService;
import in.mahesh.Entity.Books;

@RestController
public class BookRest {
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/books")
	public ResponseEntity<String> createBook(@RequestBody Books books){
		String saveBook = bookservice.saveBook(books);
		return new ResponseEntity<>(saveBook , HttpStatus.CREATED);
	}
	
	@GetMapping("/books/{bId}")
	public ResponseEntity<Books> getBook(@PathVariable Integer bId){
		Books byId = bookservice.getById(bId);
		return new ResponseEntity<>(byId , HttpStatus.OK);
	}
	
	@GetMapping("/Books")
	public ResponseEntity<List<Books>> getBooks(){
		List<Books> all = bookservice.getAll();
		return new ResponseEntity<>(all , HttpStatus.OK);
	}
	
	@PutMapping("/books")
	public ResponseEntity<String> updateBook(@RequestBody Books books){
		String saveBook = bookservice.saveBook(books);
		return new ResponseEntity<>(saveBook , HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/books/{bId}")
	public ResponseEntity<String> delrecord(@PathVariable Integer bId){
		String delRecord = bookservice.delRecord(bId);
		return new ResponseEntity<>(delRecord , HttpStatus.CREATED);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
