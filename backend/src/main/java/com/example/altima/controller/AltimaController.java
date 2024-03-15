import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AltimaController {

    private final AltimaService altimaService;

    @Autowired
    public AltimaController(AltimaService altimaService) {
        this.altimaService = altimaService;
    }

    @GetMapping("/query")
    public AltimaData query(@RequestParam double lng, @RequestParam double lat) {
        return altimaService.getAltimaData(lng, lat);
    }
}
