package zodiac;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/zodiac")
public class ZodiacRestController {
    @GetMapping
    public ResponseEntity<Zodiac> getZodiacByMonthAndDay(@RequestParam int month, @RequestParam int day) {
        return new ResponseEntity<>(Zodiac.from(month, day), HttpStatus.OK);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity handleExceptions() {
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
