/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.blog.service;

import com.example.blog.payload.PostDto;
import java.util.List;

/**
 *
 * @author Gerald.Kamau
 */
public interface PostService {
    
   public PostDto createPost(PostDto postDto);
   
   public List<PostDto> getPosts();
   
   public PostDto getOnePost(long id);
  
   public PostDto updatePost(PostDto postDto,long id);
    
}
