package com.smswh.smswh_backend.repository;

import com.smswh.smswh_backend.domain.Menu;
import com.smswh.smswh_backend.domain.Order;
import com.smswh.smswh_backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByUser(User user);

}
