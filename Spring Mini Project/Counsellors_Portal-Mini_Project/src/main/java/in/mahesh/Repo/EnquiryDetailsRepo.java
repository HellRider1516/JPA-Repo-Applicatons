package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.Entity.EnquiryDetails;

public interface EnquiryDetailsRepo extends JpaRepository<EnquiryDetails, Integer> {

}
