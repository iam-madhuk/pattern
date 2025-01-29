package pattern.pattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pattern.pattern.service.PatternService;

@RestController
@RequestMapping("/patterns")
class PatternController {
    private final PatternService patternService;

    public PatternController(PatternService patternService) {
        this.patternService = patternService;
    }

    @GetMapping("/generate")
    public String generatePattern(@RequestParam String input) {
        return patternService.getPattern(input);
    }
}