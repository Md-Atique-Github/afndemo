package afnan.afndemo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @RequestMapping("/user")
@Service
public class UserModelController {


    @Autowired
    private Afnrepos userModel;

    public UserModelController(Afnrepos UserModel){
        this.userModel = userModel;
    }

    @PostMapping("")
    public void save(@RequestBody UserModel userModel){
        this.userModel.save(userModel);
    }
    @GetMapping("/getUser")
    public List<UserModel> getAllModel(){
        return this.userModel.findAll();
    }
    
    
}
