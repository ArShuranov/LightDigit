package ru.arshuranov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arshuranov.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
