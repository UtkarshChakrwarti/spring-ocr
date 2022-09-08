package com.utady.ocr.DTO;

import lombok.Data;

import java.io.File;

@Data
public class OcrDTO {

        private File image;
        private String lang;
}
