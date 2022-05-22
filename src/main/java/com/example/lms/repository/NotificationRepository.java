package com.example.lms.repository;

import com.example.lms.entities.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lms.entities.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
