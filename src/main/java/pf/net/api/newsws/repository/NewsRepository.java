package pf.net.api.newsws.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.newsws.domain.News;

public interface NewsRepository extends CrudRepository<News, Long> {
}
