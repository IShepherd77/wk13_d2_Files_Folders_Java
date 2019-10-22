package com.codeclan.FileFolderHomework.components;

import com.codeclan.FileFolderHomework.models.File;
import com.codeclan.FileFolderHomework.models.Folder;
import com.codeclan.FileFolderHomework.models.User;
import com.codeclan.FileFolderHomework.repositories.FileRepository;
import com.codeclan.FileFolderHomework.repositories.FolderRepository;
import com.codeclan.FileFolderHomework.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRespository userRespository;

    public void run(ApplicationArguments args){

        User user1 = new User("Ian Shepherd");
        userRespository.save(user1);

        User user2 = new User("Vic Shepherd");
        userRespository.save(user2);
        Folder folder1 = new Folder("Project X", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Project Y", user2);
        folderRepository.save(folder2);

        File file1 = new File("File Jack name here", ".txt",4, folder2);
        fileRepository.save(file1);

        File file2= new File("File Dave name here", ".pdf",2, folder1);
        fileRepository.save(file2);

    }

}
