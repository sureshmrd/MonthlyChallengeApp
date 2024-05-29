package com.project.ChallengeApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challenges")
@CrossOrigin(origins="http://localhost:3000")
public class ChallengeController {
    private ChallengeService challengeService;

    
    public ChallengeController(ChallengeService challengeService){
        this.challengeService=challengeService;
    }
    
    @GetMapping
    public ResponseEntity<List<Challenge>> getAllChallenges(){
        return new ResponseEntity<>(challengeService.getAllChallenges(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addChallenges(@RequestBody Challenge challenge){
        boolean ischallengeadded=challengeService.addChallenge(challenge);
        if(ischallengeadded)
            return new ResponseEntity<>("challenge added successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("challenge not added successfully",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getChallenges(@PathVariable String month){
        Challenge challenge=challengeService.getChallenge(month);
        if(challenge!=null)
        return new ResponseEntity<>(challenge, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id,@RequestBody Challenge updatedChallenge){
        boolean isChallengeUpdated=challengeService.updateChallenge(id,updatedChallenge);
        if(isChallengeUpdated)
            return new ResponseEntity<>("challenge updated successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("challenge not updated ",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted=challengeService.deleteChallenge(id);
        if(isChallengeDeleted)
            return new ResponseEntity<>("challenge Deleted successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("challenge not Deleted ",HttpStatus.NOT_FOUND);
    }

}
