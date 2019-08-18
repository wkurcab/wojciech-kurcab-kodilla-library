package com.kodilla.library.service;

import com.kodilla.library.domain.CopyOfBook;
import com.kodilla.library.domain.Hire;
import com.kodilla.library.domain.Reader;
import com.kodilla.library.domain.Title;
import com.kodilla.library.repository.CopyOfBookRepository;
import com.kodilla.library.repository.HireRepository;
import com.kodilla.library.repository.ReaderRepository;
import com.kodilla.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private HireRepository hireRepository;

    @Autowired
    private CopyOfBookRepository copyOfBookRepository;

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public List<Title> getAllTitles() {
        return titleRepository.findAll();
    }

    public List<Hire> getAllHires() {
        return hireRepository.findAll();
    }

    public List<CopyOfBook> getAllCopyOfBooks() {
        return copyOfBookRepository.findAll();
    }

    public Optional<Reader> getReaderById(final Long id) {
        return readerRepository.findById(id);
    }

    public Optional<Title> getTitleById(final Long id) {
        return titleRepository.findById(id);
    }

    public Optional<Hire> getHireById(final Long id) {
        return hireRepository.findById(id);
    }

    public Optional<CopyOfBook> getCopyOfBookById(final Long id) {
        return copyOfBookRepository.findById(id);
    }

    public Reader saveReader(final Reader reader) {
        return readerRepository.save(reader);
    }

    public Title saveTitle(final Title title) {
        return titleRepository.save(title);
    }

    public Hire saveHire(final Hire hire) {
        return hireRepository.save(hire);
    }

    public CopyOfBook saveCopyOfBook(final CopyOfBook copyOfBook) {
        return copyOfBookRepository.save(copyOfBook);
    }

    public void deleteReaderById(final Long id) {
        readerRepository.deleteById(id);
    }

    public void deleteTitleById(final Long id) {
        titleRepository.deleteById(id);
    }

    public void deleteHireById(final Long id) {
        hireRepository.deleteById(id);
    }

    public void deleteCopyOfBookById(final Long id) {
        copyOfBookRepository.deleteById(id);
    }
}
