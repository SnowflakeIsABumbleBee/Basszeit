package com.HTW_Berlin.Basszeit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
}
