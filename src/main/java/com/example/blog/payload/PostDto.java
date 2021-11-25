/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.blog.payload;

import lombok.Data;

/**
 *
 * @author Gerald.Kamau
 */
@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
    
}