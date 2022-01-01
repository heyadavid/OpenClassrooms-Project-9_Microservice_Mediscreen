package com.mediscreen.proxy;

import com.mediscreen.model.Note;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@FeignClient(name = "Report", url = "localhost:7933")
public interface ReportServiceProxy {

    @GetMapping(value="/generateReport")
    String generateReport(@RequestParam("age") int age,
                                  @RequestParam("gender") String gender,
                                  Collection<Note> noteList);
}
