package ru.arshuranov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arshuranov.model.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long>{
}
