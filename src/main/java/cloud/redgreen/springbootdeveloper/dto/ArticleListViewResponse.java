package cloud.redgreen.springbootdeveloper.dto;

import cloud.redgreen.springbootdeveloper.domain.Article;
import lombok.Getter;

@Getter
public class ArticleListViewResponse {
    final Long id;
    final String title;
    final String content;


    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
