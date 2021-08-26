package com.puralsight1.conferencedemo.repositories;

import com.puralsight1.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {



}
