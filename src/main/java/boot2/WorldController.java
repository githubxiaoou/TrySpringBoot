package boot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WorldController {

   @RequestMapping("/w")
   public String world777() {
      return "world!!!!!!";
   }
}
