package com.utady.ocr.service;

import com.utady.ocr.DTO.OcrDTO;
import com.utady.ocr.DTO.OcrResultDTO;

public interface TesseractsOcrService {

    OcrResultDTO read(OcrDTO ocrDTO);
}
