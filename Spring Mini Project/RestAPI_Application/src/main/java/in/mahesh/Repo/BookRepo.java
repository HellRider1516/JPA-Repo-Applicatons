package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Book;

public interface BookRepo  extends JpaRepository<Book, Integer> {

}
