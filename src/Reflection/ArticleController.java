package Reflection;

public class ArticleController {

    @AutoWired
    private ArticleService articleService;

    @AutoWired
    private TestService testService;

    public void foo(){
        articleService.foo();
        testService.test();
    }
}
