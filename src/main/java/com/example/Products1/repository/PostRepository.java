package com.example.Products1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Products1.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post,Long>{

}
