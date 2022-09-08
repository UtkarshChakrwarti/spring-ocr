package com.utady.ocr.service.serviceImpl;

import com.utady.ocr.DTO.OcrDTO;
import com.utady.ocr.DTO.OcrResultDTO;
import com.utady.ocr.service.TesseractsOcrService;
import com.utady.ocr.utils.TesseractsOcr;
import org.springframework.stereotype.Service;

@Service
public class TesseractsOcrServiceImpl implements TesseractsOcrService {
    @Override
    public OcrResultDTO read(OcrDTO ocrDTO) {
        String lang = ocrDTO.getLang();
        String result = TesseractsOcr.read(ocrDTO.getImage(), lang);
        OcrResultDTO ocrResultDTO = new OcrResultDTO();
        ocrResultDTO.setLang(lang);
        ocrResultDTO.setConvertedText(result);
        return ocrResultDTO;
    }
}
