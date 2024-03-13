package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Books;

public interface BookRepo extends JpaRepository<Books, Integer> {

}
