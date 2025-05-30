package com.tubesbookwise.Repository;

import com.tubesbookwise.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface NotificationRepository extends JpaRepository<Notification, String> {
    List<Notification> findByUserId(String userId);
}
