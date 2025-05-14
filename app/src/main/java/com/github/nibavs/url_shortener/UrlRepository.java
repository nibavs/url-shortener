package com.github.nibavs.url_shortener;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlDocument, String> {
}
