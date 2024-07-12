package cloud.redgreen.springbootdeveloper.repository;

import cloud.redgreen.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article,Long> {
}
