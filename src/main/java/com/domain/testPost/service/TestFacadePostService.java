package com.domain.testPost.service;

import com.domain.testPost.repository.TestPostRepository;
import com.framework.annotations.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestFacadePostService {
    private final TestPostService testPostService;
    private final TestPostRepository testPostRepository;
}
