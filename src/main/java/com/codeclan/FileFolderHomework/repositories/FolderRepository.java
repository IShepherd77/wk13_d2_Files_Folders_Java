package com.codeclan.FileFolderHomework.repositories;

import com.codeclan.FileFolderHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository  extends JpaRepository<Folder, Long> {
}
