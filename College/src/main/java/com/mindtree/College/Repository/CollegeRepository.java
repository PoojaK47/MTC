package com.mindtree.College.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindtree.College.Entity.College;


public interface CollegeRepository  extends JpaRepository<College, Long> {
	College findById(long id);

}
