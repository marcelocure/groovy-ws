package hello

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    @RequestMapping("/artist")
    public Artist artist(@RequestParam(value="name", defaultValue="AC/DC") String name,
                         @RequestParam(value="style", defaultValue="hard rock") String style) {
        return new Artist(name, style);
    }
}