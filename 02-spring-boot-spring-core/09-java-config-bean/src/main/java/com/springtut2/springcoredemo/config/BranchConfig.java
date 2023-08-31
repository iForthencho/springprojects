package com.springtut2.springcoredemo.config;

import com.springtut2.springcoredemo.common.Leader;
import com.springtut2.springcoredemo.common.NavyLeader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BranchConfig {

    @Bean("naval")
    public Leader navyLeader() {
        return new NavyLeader();
    }
}
