package com.RESTAPI.REST_Template.Controller;


import com.RESTAPI.REST_Template.DTO.UserRequestDto;
import com.RESTAPI.REST_Template.Service.ServiceLayer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/NiceWeb")
public class SimpleController {
    @Autowired
    private ServiceLayer serviceLayer;

    @GetMapping("/hello")
    public String hello() {
        return serviceLayer.hello();
    }

    @GetMapping("/User/{id}")
    public ResponseEntity<UserRequestDto> getUser(@PathVariable int id) {
        return serviceLayer.getUser(id);
    }

    @GetMapping("/search")
    public ResponseEntity<UserRequestDto> search(@RequestParam String name) {
        return serviceLayer.search(name);
    }

    @PostMapping("/add")
    public ResponseEntity<UserRequestDto>  add(@RequestBody @Valid UserRequestDto dto) {
        return  serviceLayer.add(dto);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserRequestDto> update(@PathVariable int id, @RequestBody @Valid UserRequestDto dto) {
        return serviceLayer.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UserRequestDto> delete(@PathVariable int id) {
        return serviceLayer.delete(id);
    }

}
