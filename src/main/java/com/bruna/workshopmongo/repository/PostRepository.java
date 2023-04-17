package com.bruna.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bruna.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("( 'title': {$regex: ?0, $options; 'i'} }")
	List<Post> searchtitle(String text);
	
	List<Post> findByTitleContainsIgnoreCase(String text);

}
