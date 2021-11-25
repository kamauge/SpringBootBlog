/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.blog.controller;

import com.example.blog.payload.PostDto;
import com.example.blog.service.impl.PostServiceImplementation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gerald.Kamau
 */
@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostServiceImplementation postServiceImplementation;

    //Create post
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        return new ResponseEntity<>(postServiceImplementation.createPost(postDto), HttpStatus.CREATED);

    }

    @GetMapping
    public List<PostDto> getPosts(
            @RequestParam(value="pageNo",defaultValue = "0",required=false)int pageNo,
            @RequestParam(value="pageSize",defaultValue ="10",required=false) int pageSize)
    {
        return postServiceImplementation.getPosts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(postServiceImplementation.getOnePost(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable("id") Long id) {
        return new ResponseEntity<>(postServiceImplementation.updatePost(postDto, id), HttpStatus.OK);
    }

}
