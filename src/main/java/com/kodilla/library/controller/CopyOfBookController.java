package com.kodilla.library.controller;

import com.kodilla.library.domain.CopyOfBookDto;
import com.kodilla.library.mapper.CopyOfBookMapper;
import com.kodilla.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/copyofbook")
public class CopyOfBookController {
    @Autowired
    private DbService service;

    @Autowired
    private CopyOfBookMapper copyOfBookMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getCopyOfBooks")
    public List<CopyOfBookDto> getCopyOfBooks() {
        return copyOfBookMapper.mapToCopyOfBookDtoList(service.getAllCopyOfBooks());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCopyOfBook")
    public CopyOfBookDto getCopyOfBook(@RequestParam Long copyOfBookId) throws CopyOfBookNotFoundException {
        return copyOfBookMapper.mapToCopyOfBookDto(service.getCopyOfBookById(copyOfBookId).orElseThrow(CopyOfBookNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCopyOfBook")
    public void deleteCopyOfBook(@RequestParam Long copyOfBookId) {
        service.deleteCopyOfBookById(copyOfBookId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCopyOfBook")
    public CopyOfBookDto updateCopyOfBook(@RequestBody CopyOfBookDto copyOfBookDto) {
        return copyOfBookMapper.mapToCopyOfBookDto(service.saveCopyOfBook(copyOfBookMapper.mapToCopyOfBook(copyOfBookDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCopyOfBook", consumes = APPLICATION_JSON_VALUE)
    public void createCopyOfBook (@RequestBody CopyOfBookDto copyOfBookDto) {
        service.saveCopyOfBook(copyOfBookMapper.mapToCopyOfBook(copyOfBookDto));
    }
}
