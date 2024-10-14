package com.example.Products1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Products1.model.Comment;
import com.example.Products1.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository comRepo;
	public void addc(Comment comment) {
		comRepo.save(comment);
	}
}