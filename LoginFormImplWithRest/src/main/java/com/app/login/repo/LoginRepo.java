package com.app.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.entity.LoginEntity;
import java.lang.Long;
import java.util.List;
import java.util.Optional;

public interface LoginRepo extends JpaRepository<LoginEntity, Long>/* ,QuerydslPredicateExecutor<LoginEntity> */{
}
