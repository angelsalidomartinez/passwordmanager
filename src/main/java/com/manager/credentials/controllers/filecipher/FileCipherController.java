package com.manager.credentials.controllers.filecipher;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RestController
public class FileCipherController {

    private static final String UPLOADED_FOLDER = "C:/";

    @PostMapping("/api/upload/softencryption")
    public ResponseEntity<?> softEncryption(@RequestParam("file") MultipartFile uploadfile) throws IOException {

        ResponseEntity<?> response = null;

        if(uploadfile == null){
            response = new ResponseEntity("File is empty", HttpStatus.BAD_REQUEST);
        }

        List<MultipartFile> filesToBeSaved = Arrays.asList(uploadfile);

        for (MultipartFile file : filesToBeSaved) {

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

        }

        return response;
    }

}
