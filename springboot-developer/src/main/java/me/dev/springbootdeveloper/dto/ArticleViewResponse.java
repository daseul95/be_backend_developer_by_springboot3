package me.dev.springbootdeveloper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.dev.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article){
        this.id=article.getId();
        this.title= article.getTitle();
        this.content= article.getContent();
        this.createdAt=article.getCreateAt();
        this.author= article.getAuthor();
    }
}
