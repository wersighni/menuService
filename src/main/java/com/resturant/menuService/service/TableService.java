package com.resturant.menuService.service;

import com.resturant.menuService.modal.BookTable;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.modal.TableR;
import com.resturant.menuService.repository.BookTableRepository;
import com.resturant.menuService.repository.DishRepository;
import com.resturant.menuService.repository.TableRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TableService {
    private final TableRepository tableRepository;
    private final BookTableRepository bookTableRepository;
    public BookTable create( BookTable bookTable)
    {
        return bookTableRepository.save(bookTable);
    }
    public List<BookTable> getAllBookTable( )
    {
        return (List<BookTable>) bookTableRepository.findAll();
    }
    public List<TableR> getAllTable()
    {
        return (List<TableR>) tableRepository.findAll();
    }
    public TableR createTable(TableR table){
        return tableRepository.save(table);
    }
    public boolean deleteDish(Long id){
        tableRepository.deleteById(id);
        return  true;
    }
    public TableR updateIsAvailable(TableR tableR)
    {
        tableR.setIsAvailable(!tableR.getIsAvailable());
        return tableRepository.save(tableR);
    }


}
