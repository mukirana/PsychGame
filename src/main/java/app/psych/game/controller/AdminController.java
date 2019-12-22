package app.psych.game.controller;

import app.psych.game.model.Admin;
import app.psych.game.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable(value="id") Long id) throws  Exception{
        return adminRepository.findById(id).orElseThrow(()-> new Exception("Something went wrong"));
    }
}
