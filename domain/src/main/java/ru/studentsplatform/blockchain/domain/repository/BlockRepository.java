package ru.studentsplatform.blockchain.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.studentsplatform.blockchain.entities.block.Block;

/**
 * @author Krylov Sergey (27.09.2020)
 */
@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {
}
