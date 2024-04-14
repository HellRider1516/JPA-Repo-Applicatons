package in.mahesh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.Entity.Books;
import in.mahesh.Repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public String saveBook(Books books) {
		bookRepo.save(books);
		return "Sucess";
	}

	
	public Books getById(Integer bId) {
		Optional<Books> byId = bookRepo.findById(bId);
		if(byId.isPresent()) {
			return byId.get();
		}else {
			return null;
		}
	}
	
	
	public List<Books> getAll(){
		return bookRepo.findAll();
	}
	
	
	
	
	public String delRecord(Integer bId) {
		if(bookRepo.existsById(bId)) {
			bookRepo.deleteById(bId);
			return "Recored Deleted";
		}else {
			return "Invaild Del Operation...";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
