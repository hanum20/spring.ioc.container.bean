# Spring IoC Container - bean

## 같은 Type의 여러 개의 bean을 `@Autowired`로 주입받기
### 1. `@Primary`
> Default Bean을 주입
 ```java
 @Repository @Primary
 public class KeesunBookRepository implements BookRepository{
 }
```


### 2. `@Qualifier`
> 특정 bean을 주입
```java
@Service
public class BookService {
    @Autowired @Qualifier("a_BookRepository")
    BookRepository bookRepository;
} 
```

### 3. `List<type>`
> `List<type`으로 모든 bean을 주입
```java
@Service
public class BookService {
    @Autowired 
    List<BookRepository> bookRepository;
} 
```