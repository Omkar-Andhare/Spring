package com.example.LabEntries.controller;

import com.example.LabEntries.LabEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lab")
public class LabEntryController {


    private Map<Integer, LabEntry> labEntries = new HashMap<>();

    @GetMapping("/getAll")
    public List<LabEntry> getAll() {
        return new ArrayList<>(labEntries.values());
    }

    @PostMapping("/add")
    public Boolean creatEntry(@RequestBody LabEntry labEntry) {
        labEntries.put(labEntry.getId(), labEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public LabEntry getLabEntryById(@PathVariable Integer myId) {
        return labEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public LabEntry deleteLabEntryById(@PathVariable Integer myId) {
        System.out.println("Deleted record is : ");
        return labEntries.remove(myId);
    }

    @PutMapping("id/{myId}")
    public LabEntry updateEntryById(@PathVariable Integer myId, @RequestBody LabEntry labEntry) {
        return labEntries.put(myId, labEntry);

    }
}
