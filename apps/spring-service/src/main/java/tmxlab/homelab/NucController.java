package tmxlab.homelab;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NucController {

    @Value("${VERSION:unknown}")
    private String version;

    @Value("${ENVIRONMENT:unknown}")
    private String environment;

    @Value("${COMMIT:unknown}")
    private String commit;

    @GetMapping("/")
    public Map<String, String> getVersion() {
        Map<String, String> response = new HashMap<>();
        response.put("version", version);
        response.put("commit", commit);
        response.put("environment", environment);
        return response;
    }
}