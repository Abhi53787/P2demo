package com.example.Products1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Products1.model.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
