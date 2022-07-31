package service;

import com.techprimers.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User stiven = new User();
        stiven.setName("Stiven");
        stiven.setEmpId(1111);
        stiven.setSalary(12000);

        User sam = new User();
        sam.setName("Jhon");
        sam.setEmpId(1112);
        sam.setSalary(32000);
        
        User juan = new User();
        juan.setName("Juan");
        juan.setEmpId(1113);
        juan.setSalary(16000);

        users.put(stiven.getName(), stiven);
        users.put(sam.getName(), sam);
        users.put(juan.getName(), juan);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}