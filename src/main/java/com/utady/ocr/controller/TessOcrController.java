package com.utady.ocr.controller;

import com.utady.ocr.DTO.OcrDTO;
import com.utady.ocr.DTO.OcrResultDTO;
import com.utady.ocr.service.TesseractsOcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static com.utady.ocr.utils.TesseractsOcr.convert;


@RestController
@CrossOrigin
@RequestMapping("tess-ocr")
public class TessOcrController {

    @Autowired
    private TesseractsOcrService tesseractsOcrService;

    @PostMapping("/upload")
    public ResponseEntity<OcrResultDTO> read(
            @RequestParam("image") MultipartFile file,
            @RequestParam("lang") String lang) throws IOException {
        OcrDTO ocrDTO = new OcrDTO();
        ocrDTO.setImage(convert(file));
        ocrDTO.setLang(lang);
        return ResponseEntity.ok().body(tesseractsOcrService.read(ocrDTO));
    }

}
