package test.affiliateProgram.controller;

import test.affiliateProgram.exception.ResourceNotFound;
import test.affiliateProgram.model.affiliateProgram;
import test.affiliateProgram.repository.affiliateProgram_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/affiliate_program")
public class affiliateProgramController {

    @Autowired
    private affiliateProgram_Repo Client_Repo;

    @GetMapping
    public List<affiliateProgram> getAllClient(){
        return Client_Repo.findAll();
    }

    @PostMapping
    public affiliateProgram createEmployee(@RequestBody affiliateProgram client) {
        return Client_Repo.save(client);
    }


    @GetMapping("{id}")
    public ResponseEntity<affiliateProgram> getEmployeeById(@PathVariable  long id){
        affiliateProgram employee = Client_Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Client does not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<affiliateProgram> updateEmployee(@PathVariable long id,@RequestBody affiliateProgram clientDetails) {
        affiliateProgram updateEmployee = Client_Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Client does not exist with id: " + id));

        updateEmployee.setAffiliateName(clientDetails.getAffiliateName());
        updateEmployee.setAffiliateEmail(clientDetails.getAffiliateEmail());
        updateEmployee.setAffiliateStatus(clientDetails.getAffiliateStatus());

        Client_Repo.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        affiliateProgram employee = Client_Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Client does not exist with id: " + id));

        Client_Repo.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}