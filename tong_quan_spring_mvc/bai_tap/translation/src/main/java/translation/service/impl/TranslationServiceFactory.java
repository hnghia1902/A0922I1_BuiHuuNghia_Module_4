package translation.service.impl;

import org.springframework.stereotype.Service;
import translation.service.ITranslationService;

import java.util.HashMap;
@Service
public class TranslationServiceFactory implements ITranslationService {
    private static HashMap<String, String> data;
    static {
        data = new HashMap<>();
        data.put("Hello", "Xin Chào");
        data.put("Bye", "Tạm Biệt");
        data.put("Sun", "Mặt Trời");

    }


    @Override
    public String translationVN(String english) {
        data.get(english);
        return data.get(english);
    }
}
