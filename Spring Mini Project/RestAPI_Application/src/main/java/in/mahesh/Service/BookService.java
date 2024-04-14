package in.mahesh.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.Repo.BookRepo;
import in.mahesh.entity.Book;
@Service
public class BookService {
	
	@Autowired
	private BookRepo bRepo;
	
	public String saveBook(Book book) {
		Book save = bRepo.save(book);
		if(save.getBookid()!=null) {
			return "sucesss";
		}else {
			return"Error!!";
		}
	}
	
	
	public Book getById(Integer bId) {
		Optional<Book> byId = bRepo.findById(bId);
		if(byId.isPresent()) {
			return byId.get();
		}else {
			return null;
		}
	}
	
	
	public List<Book> getAllDetails(){
		return bRepo.findAll();
	}
	
	
	public String delRecord(Integer bId) {
		boolean existsById = bRepo.existsById(bId);
		if(existsById) {
			bRepo.deleteById(bId);
			return "Record Deleted....";
		}else {
			return "Record Not Found....";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
