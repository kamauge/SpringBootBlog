/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.blog.repository;

import com.example.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gerald.Kamau
 */
public interface PostRepository extends JpaRepository<Post,Long> {
    
}
