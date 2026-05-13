package com.domain.testPost.service;

import com.domain.testPost.repository.TestPostRepository;
import com.framework.annotations.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestPostService {
    private final TestPostRepository testPostRepository;
}
