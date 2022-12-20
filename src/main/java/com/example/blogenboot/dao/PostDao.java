package com.example.blogenboot.dao;

import com.example.blogenboot.ds.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends JpaRepository<Post, Integer> {
}
