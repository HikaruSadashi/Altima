import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AltimaService {

    private final RestTemplate restTemplate;

    @Autowired
    public AltimaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Async
    public AltimaData getAltimaData(double lng, double lat) {
        String url = "https://archive-api.open-meteo.com/v1/era5?latitude=" + lat + "&longitude=" + lng + "&start_date=2023-03-18&end_date=2024-03-18&daily=temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,sunrise,sunset,precipitation_sum,rain_sum,snowfall_sum,precipitation_hours,windspeed_10m_max,windgusts_10m_max,winddirection_10m_dominant&timezone=auto";
        AltimaData altimaData = restTemplate.getForObject(url, AltimaData.class);
        return altimaData;
    }
}
