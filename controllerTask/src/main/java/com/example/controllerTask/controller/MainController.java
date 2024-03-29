package com.example.controllerTask.controller;


import com.example.controllerTask.item.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

private static final List<Book> books= new ArrayList<>();

@GetMapping("/hello/{name}")
public String sayHello(@PathVariable("name") String name){

    return "Hello"+ name;
}



@PostMapping("/create-book")
public Book createBook(@RequestBody Book book){
    books.add(book);
    return book;

}

@DeleteMapping("/delete-book/{bookIndex}")
public void deleteBook(@PathVariable("bookIndex") int index){
    books.remove(index);
}

@PutMapping("/update-book/{bookIndex}")
public Book updateBook(@PathVariable("bookIndex") int index, @RequestBody Book book){

    if(index<books.size()&& index>-1){

        Book oldBook= books.get(index);
        oldBook.setAuthor(book.getAuthor());
        oldBook.setTitle(book.getTitle());
        oldBook.setPublicationDate(book.getPublicationDate());

    }

    return book;
}

@GetMapping("/get-book/{bookIndex}")
public Book getBook(@PathVariable("bookIndex") int bookIndex)
{
    return books.get(bookIndex);
}

@GetMapping("/get-book/")
public List<Book> getBooks(){
    return books;

}





}
