package com.bruna.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.workshopmongo.domain.Post;
import com.bruna.workshopmongo.repository.PostRepository;
import com.bruna.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	
	
	public Post findById(String id) {
		Post user = repo.findOne(id);
		if (user == null) {
			throw new ObjectNotFoundException("Objto não encontrado");
		}
		return user;
	}
	
}	
