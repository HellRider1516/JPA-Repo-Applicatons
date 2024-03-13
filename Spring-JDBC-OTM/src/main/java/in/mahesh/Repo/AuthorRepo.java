package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
