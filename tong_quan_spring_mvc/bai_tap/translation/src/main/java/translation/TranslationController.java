package translation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import translation.service.ITranslationService;

@Controller
public class TranslationController {
    @Autowired private ITranslationService translationService;

    @GetMapping("/translation")
    public ModelAndView traCuu (@RequestParam(name = "traCuu", defaultValue = "Không tìm thấy!")String name, String traCuu){
        ModelAndView modelAndView = new ModelAndView("/translation");
        String vn = translationService.translationVN(traCuu);
        String no_data = "Không tìm thấy!";
        if (vn != null){
            modelAndView.addObject("vn",vn);
        }else if (vn == null){
            modelAndView.addObject("no_data", no_data);
        }else if (name == null){
            modelAndView.addObject("no_data",name);
        }
        return modelAndView;
    }

}
